package com.mindtree.msscbrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.mindtree.msscbrewery.web.model.BeerDto;

/**
 * Created by jt on 2019-04-20.
 */
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Galaxy Cat")
                .beerStyle("Pale Ale")
                .build();
    }
}
