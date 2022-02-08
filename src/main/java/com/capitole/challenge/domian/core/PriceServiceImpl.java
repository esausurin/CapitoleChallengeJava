package com.capitole.challenge.domian.core;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.capitole.challenge.domian.api.entity.Price;
import com.capitole.challenge.domian.api.service.PriceService;
import com.capitole.challenge.domian.spi.PricePort;

@Service
public class PriceServiceImpl implements PriceService {

	private final PricePort port;
	
	public PriceServiceImpl(PricePort port) {
		this.port = port;
	}
	
	@Override
	public Price getPriceProductByDateProductBrand(LocalDateTime date, Integer product, Integer brand) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Price getPriceProductByDateProductBrandNamedQuery(LocalDateTime date, Integer product, Integer brand) {
		// TODO Auto-generated method stub
		return null;
	}

}
