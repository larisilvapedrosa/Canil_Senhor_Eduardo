package com.example.petshopbackend.dto;

import jakarta.validation.constraints.NotNull;

import java.time.LocalDate;

public record BestPriceRequestDTO (LocalDate date,

                                   @NotNull Integer smallDogsQuantity,

                                   @NotNull Integer bigDogsQuantity){
}
