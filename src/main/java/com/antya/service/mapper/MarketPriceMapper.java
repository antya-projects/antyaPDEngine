package com.antya.service.mapper;

import com.antya.domain.*;
import com.antya.service.dto.MarketPriceDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity MarketPrice and its DTO MarketPriceDTO.
 */
@Mapper(componentModel = "spring", uses = {})
public interface MarketPriceMapper extends EntityMapper<MarketPriceDTO, MarketPrice> {


    @Mapping(target = "markets", ignore = true)
    MarketPrice toEntity(MarketPriceDTO marketPriceDTO);

    default MarketPrice fromId(Long id) {
        if (id == null) {
            return null;
        }
        MarketPrice marketPrice = new MarketPrice();
        marketPrice.setId(id);
        return marketPrice;
    }
}
