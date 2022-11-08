package com.example.producttransactionmanagementweb.controllers;

import com.example.producttransactionmanagementweb.entity.Region;
import com.example.producttransactionmanagementweb.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("regions")
@RequiredArgsConstructor
public class RegionController {

    private final RegionService regionService;

    @GetMapping
    public String list(Model model) {
        model.addAttribute("regions", regionService.findAll());
        return "pages/region/list";
    }

    @GetMapping("/create")
    public String create(Model model) {
        model.addAttribute("region", new Region());
        return "pages/region/create";
    }

    @PostMapping("/create")
    public String save(Region region, Model model) {
        System.out.println(region);
        regionService.save(region);

        return "redirect:/regions";
    }
}
