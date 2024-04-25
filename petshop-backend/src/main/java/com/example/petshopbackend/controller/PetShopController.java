package com.example.petshopbackend.controller;

import com.example.petshopbackend.dto.BestPriceRequestDTO;
import com.example.petshopbackend.dto.BestPriceResponseDTO;
import com.example.petshopbackend.service.IPetShopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/petshops")
public class PetShopController {

    @Autowired
    private IPetShopService petShopService;

    @GetMapping("/bestPrice")
    public ResponseEntity<BestPriceResponseDTO> getPetShopBestPrice(BestPriceRequestDTO bestPriceRequestDTO) {
        return ResponseEntity.ok(petShopService.getPetShopBestPrice(bestPriceRequestDTO));
    }
}
