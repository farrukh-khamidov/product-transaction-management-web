package com.example.producttransactionmanagementweb.service;

import com.example.producttransactionmanagementweb.entity.Place;

import java.util.List;

public interface PlaceService {
    List<Place> findAll();

    Place save(Place place);
}
