package com.mindtree.msscbrewery.services;

import java.util.UUID;

import com.mindtree.msscbrewery.web.model.BeerDto;

/**
 * Created by jt on 2019-04-20.
 */
public interface BeerService {
    BeerDto getBeerById(UUID beerId);
}
