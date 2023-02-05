package com.example.resturant.service;

import com.example.resturant.model.Restaurant;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class RestaurantService {
    private static List<Restaurant> res = new ArrayList<>();
    private static int resCount = 0;

    static {
        res.add(new Restaurant(++resCount,"res1",4.5,"vizag",50,true));
        res.add(new Restaurant(++resCount,"res2",4.0,"vizag",40,true));
        res.add(new Restaurant(++resCount,"res3",3.8,"vizag",30,true));
        res.add(new Restaurant(++resCount,"res4",2.9,"vizag",10,true));
        res.add(new Restaurant(++resCount,"res5",4.7,"vizag",150,true));

    }
    public List<Restaurant> findAll(){
        return res;
    }
}
