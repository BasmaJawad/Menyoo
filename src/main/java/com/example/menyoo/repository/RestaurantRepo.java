package com.example.menyoo.repository;

import com.example.menyoo.model.Restaurant;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RestaurantRepo extends JpaRepository<Restaurant, Integer> {

}
