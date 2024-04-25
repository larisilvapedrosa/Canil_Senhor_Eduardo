package com.example.petshopbackend.repository;

import com.example.petshopbackend.model.PetShop;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetShopRepository extends JpaRepository<PetShop, Long> {

}
