package com.example.menyoo.service;

import com.example.menyoo.model.Restaurant;
import com.example.menyoo.repository.RestaurantRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {
    @Autowired
    RestaurantRepo restaurantRepo;

    public Restaurant postRestaurant(Restaurant restaurant) {
        return restaurantRepo.save(restaurant);
    }


    public List<Restaurant> allRestaurants() { return restaurantRepo.findAll();
    }


}
