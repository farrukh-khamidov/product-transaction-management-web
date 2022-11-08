package com.example.producttransactionmanagementweb.controllers;

import com.example.producttransactionmanagementweb.entity.Place;
import com.example.producttransactionmanagementweb.entity.Region;
import com.example.producttransactionmanagementweb.service.PlaceService;
import com.example.producttransactionmanagementweb.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("places")
@RequiredArgsConstructor
public class PlaceController {

    private final PlaceService placeService;
    private final RegionService regionService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("places", placeService.findAll());
        return "pages/place/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("place", new Place());
        model.addAttribute("regions", regionService.findAll());
        return "pages/place/create";
    }

    @PostMapping("/create")
    public String save(Place place, Model model) {
        System.out.println(place);
        placeService.save(place);

        return "redirect:/places";
    }
}
