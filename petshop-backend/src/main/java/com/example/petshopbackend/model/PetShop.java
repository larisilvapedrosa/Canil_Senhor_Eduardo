package com.example.petshopbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Table(name = "tb_petshops")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PetShop {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private Double distance;

    private BigDecimal smallDogWeekBathPrice;

    private BigDecimal bigDogWeekBathPrice;

    private BigDecimal smallDogWeekendBathPrice;

    private BigDecimal bigDogWeekendBathPrice;
}
