package com.antya.service.mapper;

import com.antya.domain.*;
import com.antya.service.dto.MarketDTO;

import org.mapstruct.*;

/**
 * Mapper for the entity Market and its DTO MarketDTO.
 */
@Mapper(componentModel = "spring", uses = {CoinMapper.class, ExchangeMapper.class, MarketPriceMapper.class})
public interface MarketMapper extends EntityMapper<MarketDTO, Market> {

    @Mapping(source = "marketCurrencyId.id", target = "marketCurrencyIdId")
    @Mapping(source = "marketCurrencyId.marketCurrency", target = "marketCurrencyIdMarketCurrency")
    @Mapping(source = "baseCurrencyId.id", target = "baseCurrencyIdId")
    @Mapping(source = "baseCurrencyId.baseCurrency", target = "baseCurrencyIdBaseCurrency")
    @Mapping(source = "exchangeId.id", target = "exchangeIdId")
    @Mapping(source = "marketPriceId.id", target = "marketPriceIdId")
    @Mapping(source = "marketPriceId.currencyPairCode", target = "marketPriceIdCurrencyPairCode")
    MarketDTO toDto(Market market);

    @Mapping(source = "marketCurrencyIdId", target = "marketCurrencyId")
    @Mapping(source = "baseCurrencyIdId", target = "baseCurrencyId")
    @Mapping(source = "exchangeIdId", target = "exchangeId")
    @Mapping(source = "marketPriceIdId", target = "marketPriceId")
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
