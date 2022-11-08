package com.example.producttransactionmanagementweb.service.impl;

import com.example.producttransactionmanagementweb.entity.Place;
import com.example.producttransactionmanagementweb.entity.Region;
import com.example.producttransactionmanagementweb.repository.PlaceRepository;
import com.example.producttransactionmanagementweb.repository.RegionRepository;
import com.example.producttransactionmanagementweb.service.PlaceService;
import com.example.producttransactionmanagementweb.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PlaceServiceImpl implements PlaceService {

    private final PlaceRepository placeRepository;

    @Override
    public List<Place> findAll() {
        return placeRepository.findAll();
    }

    @Override
    public Place save(Place place) {
        return placeRepository.save(place);
    }
}
