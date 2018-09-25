package com.epam.cdp.controller;

import com.epam.cdp.Repository.StockRepository;
import com.epam.cdp.entity.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class StockRestController {
    @RequestMapping("/findAllStocks")
    Collection<Stock> stocks() {
        return stockRepository.findAll();
    }

    @Autowired
    StockRepository stockRepository;
}