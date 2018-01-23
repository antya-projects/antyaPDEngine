package com.antya.service.mapper;

import com.antya.domain.*;
import com.antya.service.dto.MarketDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Market and its DTO MarketDTO.
 */
@Mapper(componentModel = "spring", uses = {CoinMapper.class, ExchangeMapper.class, MarketPriceMapper.class})
public interface MarketMapper extends EntityMapper<MarketDTO, Market> {

    @Mapping(source = "marketCurrency.id", target = "marketCurrencyId")
    @Mapping(source = "marketCurrency.marketCurrency", target = "marketCurrencyMarketCurrency")
    @Mapping(source = "baseCurrency.id", target = "baseCurrencyId")
    @Mapping(source = "baseCurrency.baseCurrency", target = "baseCurrencyBaseCurrency")
    @Mapping(source = "exchange.id", target = "exchangeId")
    MarketDTO toDto(Market market);

    @Mapping(source = "marketCurrencyId", target = "marketCurrency")
    @Mapping(source = "baseCurrencyId", target = "baseCurrency")
    @Mapping(source = "exchangeId", target = "exchange")
    Market toEntity(MarketDTO marketDTO);

    default Market fromId(Long id) {
        if (id == null) {
            return null;
        }
        Market market = new Market();
        market.setId(id);
        return market;
    }
}
