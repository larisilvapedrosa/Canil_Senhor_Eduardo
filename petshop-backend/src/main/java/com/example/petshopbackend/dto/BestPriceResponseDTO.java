package com.example.petshopbackend.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public record BestPriceResponseDTO(String petShopName,

                                   BigDecimal totalPrice,

                                   @JsonIgnore
                                   Double distance) {
}
