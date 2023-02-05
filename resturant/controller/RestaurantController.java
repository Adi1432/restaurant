package com.example.resturant.controller;

import com.example.resturant.model.Restaurant;
import com.example.resturant.service.RestaurantService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.*;

@RestController
@RequestMapping("api/v1")
public class RestaurantController {

    private final RestaurantService restaurantService;

    public RestaurantController(RestaurantService restaurantService){
        this.restaurantService = restaurantService;
    }

    @GetMapping("findAll")
    public List<Restaurant> findAll(){
        return restaurantService.findAll();
    }

}
