package com.example.petshopbackend.service.impl;

import com.example.petshopbackend.dto.BestPriceRequestDTO;
import com.example.petshopbackend.dto.BestPriceResponseDTO;
import com.example.petshopbackend.model.PetShop;
import com.example.petshopbackend.repository.PetShopRepository;
import com.example.petshopbackend.service.IPetShopService;
import com.example.petshopbackend.utils.DateOperations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Comparator;
import java.util.List;

@Service
public class PetShopService implements IPetShopService {

    @Autowired
    private PetShopRepository petShopRepository;

    @Override
    public BestPriceResponseDTO getPetShopBestPrice(BestPriceRequestDTO bestPriceRequestDTO) {
        List<PetShop> petShops = petShopRepository.findAll();
        boolean isWeekend = DateOperations.isWeekend(bestPriceRequestDTO.date());
        return getPetShopBestPrice(petShops, isWeekend, bestPriceRequestDTO.smallDogsQuantity(), bestPriceRequestDTO.bigDogsQuantity());
    }

    private BestPriceResponseDTO getPetShopBestPrice(List<PetShop> petShops, boolean isWeekend, Integer smallDogsQuantity, Integer bigDogsQuantity) {
        return isWeekend ? calculatePetShopWeekendBestPrice(petShops, smallDogsQuantity, bigDogsQuantity) : calculatePetShopWeekDaysBestPrice(petShops, smallDogsQuantity, bigDogsQuantity);
    }

    private BestPriceResponseDTO calculatePetShopWeekDaysBestPrice(List<PetShop> petShops, Integer smallDogsQuantity, Integer bigDogsQuantity) {
        var weekPrices = petShops.stream()
                .map(petShop ->
                        new BestPriceResponseDTO(
                                petShop.getName(),
                                petShop.getSmallDogWeekBathPrice()
                                        .multiply(new BigDecimal(smallDogsQuantity))
                                        .add(petShop.getBigDogWeekBathPrice()
                                                .multiply(new BigDecimal(bigDogsQuantity))),
                                petShop.getDistance()
                        )
                )
                .toList();

        return weekPrices.stream()
                .min(Comparator.comparing(BestPriceResponseDTO::totalPrice)
                        .thenComparing(BestPriceResponseDTO::distance))
                .orElseThrow(() -> new ArithmeticException("Error calculating the petShop best price"));
    }

    private BestPriceResponseDTO calculatePetShopWeekendBestPrice(List<PetShop> petShops, Integer smallDogsQuantity, Integer bigDogsQuantity) {
        var weekendPrices = petShops.stream()
                .map(petShop ->
                        new BestPriceResponseDTO(
                                petShop.getName(),
                                petShop.getSmallDogWeekendBathPrice()
                                        .multiply(new BigDecimal(smallDogsQuantity))
                                        .add(petShop.getBigDogWeekendBathPrice()
                                                .multiply(new BigDecimal(bigDogsQuantity))),
                                petShop.getDistance()
                        )
                )
                .toList();

        return weekendPrices.stream()
                .min(Comparator.comparing(BestPriceResponseDTO::totalPrice)
                        .thenComparing(BestPriceResponseDTO::distance))
                .orElseThrow(() -> new ArithmeticException("Error calculating the petShop best price"));
    }
}
