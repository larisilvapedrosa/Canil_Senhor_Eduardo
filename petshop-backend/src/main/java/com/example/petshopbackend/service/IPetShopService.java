package com.example.petshopbackend.service;

import com.example.petshopbackend.dto.BestPriceRequestDTO;
import com.example.petshopbackend.dto.BestPriceResponseDTO;

public interface IPetShopService {

    BestPriceResponseDTO getPetShopBestPrice(BestPriceRequestDTO bestPriceRequestDTO);
}
