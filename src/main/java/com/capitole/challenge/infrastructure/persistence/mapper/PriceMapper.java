package com.capitole.challenge.infrastructure.persistence.mapper;

import org.mapstruct.Mapper;

import com.capitole.challenge.domian.api.entity.Price;
import com.capitole.challenge.infrastructure.persistence.entity.PriceEntity;

@Mapper(componentModel = "spring")
public abstract class PriceMapper {
	public abstract Price mapFromPersitence (PriceEntity entity);
	public abstract PriceEntity mapToPersitence (Price bo);
}