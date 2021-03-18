package com.mindtree.msscbrewery.services;

import java.util.UUID;

import com.mindtree.msscbrewery.web.model.CustomerDto;

public interface CustomerService {
	CustomerDto getCustomerById(UUID customerId);
}
