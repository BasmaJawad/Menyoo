package com.example.menyoo.controller;
import com.example.menyoo.model.Restaurant;
import com.example.menyoo.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin //for at vi kan sende requets hertil med javascript
public class RestaurantController {
   @Autowired
   RestaurantService restaurantService;


    @PostMapping("/restaurant")
    @ResponseStatus(HttpStatus.CREATED)
    public Restaurant postRestaurant(@RequestBody Restaurant restaurant) {
        return restaurantService.postRestaurant(restaurant);
    }

}
