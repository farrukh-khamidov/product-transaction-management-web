package com.example.producttransactionmanagementweb.service;

import com.example.producttransactionmanagementweb.entity.Region;

import java.util.List;

public interface RegionService {
    List<Region> findAll();

    Region save(Region region);
}
