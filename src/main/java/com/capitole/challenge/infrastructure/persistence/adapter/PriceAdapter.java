package com.capitole.challenge.infrastructure.persistence.adapter;

import java.time.LocalDateTime;

import org.springframework.stereotype.Component;

import com.capitole.challenge.domian.api.entity.Price;
import com.capitole.challenge.domian.spi.PricePort;
import com.capitole.challenge.infrastructure.persistence.mapper.PriceMapper;
import com.capitole.challenge.infrastructure.persistence.repository.PriceRepository;

@Component
public class PriceAdapter implements PricePort {
	private final PriceRepository repository;
	private final PriceMapper mapper;
	
	public PriceAdapter(PriceRepository repository,
			PriceMapper mapper) {
		this.repository = repository;
		this.mapper=mapper;
	}
	
	@Override
	public Price getPriceProductByDateProductBrandNativeQuery(LocalDateTime date, Integer product, Integer brand) {
		return this.mapper.mapFromPersitence(this.repository.getPriceProductByDateProductBrand(date, product, brand));
	}

	@Override
	public boolean existsByProductId(Integer productId) {
		return repository.existsByProductId(productId);
	}

	@Override
	public boolean existsByBrandId(Integer brandId) {
		return repository.existsByBrandId(brandId);
	}
}
