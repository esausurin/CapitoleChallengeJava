package com.capitole.challenge.domian.api.service;

import java.time.LocalDateTime;

import com.capitole.challenge.domian.api.entity.Price;

public interface PriceService {
	public Price getPriceProductByDateProductBrand(LocalDateTime date, Integer product, Integer brand);
	public Price getPriceProductByDateProductBrandNamedQuery(LocalDateTime date, Integer product, Integer brand);
		
}
