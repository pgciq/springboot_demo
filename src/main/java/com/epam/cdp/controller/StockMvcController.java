package com.epam.cdp.controller;

import com.epam.cdp.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StockMvcController {
    @RequestMapping("/stockHome")
    String stocks(Model model) {
        model.addAttribute("stocks", stockRepository.findAll());
        return "stocks"; // src/main/resources/templetes/ + $X + .html
    }

    @Autowired
    private StockRepository stockRepository;
}