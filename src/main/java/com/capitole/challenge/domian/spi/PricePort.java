package com.capitole.challenge.domian.spi;

import java.time.LocalDateTime;

import com.capitole.challenge.domian.api.entity.Price;
public interface PricePort {
	public Price getPriceProductByDateProductBrandNativeQuery(LocalDateTime date, Integer product, Integer brand);

	public boolean existsByBrandId(Integer brandId);

	public boolean existsByProductId(Integer productId);
}
