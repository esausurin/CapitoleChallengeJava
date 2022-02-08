package com.capitole.challenge.infrastructure.persistence.adapter;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.capitole.challenge.domian.api.entity.Price;
import com.capitole.challenge.domian.spi.PricePort;
import com.capitole.challenge.infrastructure.persistence.repository.PriceRepository;

@Component
public class PriceAdapter implements PricePort {
	private final PriceRepository repository;

	public PriceAdapter(PriceRepository repository) {
		this.repository = repository;
	}
	
	@Override
	public Price getPriceProductByDateProductBrandNativeQuery(LocalDateTime date, Integer product, Integer brand) {
		// TODO Auto-generated method stub
		return null;
	}
}
