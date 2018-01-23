package com.antya.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the Market entity.
 */
public class MarketDTO implements Serializable {

    private Long id;

    private String currencyPairCode;

    private String name;

    private String marketCurrency;

    private String baseCurrency;

    private Integer minTradeSize;

    private Integer maxTradeSize;

    private Long manualTradeQty;

    private Integer isActive;

    private Long commission;

    private Long marketCurrencyIdId;

    private String marketCurrencyIdMarketCurrency;

    private Long baseCurrencyIdId;

    private String baseCurrencyIdBaseCurrency;

    private Long exchangeIdId;

    private Long marketPriceIdId;

    private String marketPriceIdCurrencyPairCode;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyPairCode() {
        return currencyPairCode;
    }

    public void setCurrencyPairCode(String currencyPairCode) {
        this.currencyPairCode = currencyPairCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarketCurrency() {
        return marketCurrency;
    }

    public void setMarketCurrency(String marketCurrency) {
        this.marketCurrency = marketCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Integer getMinTradeSize() {
        return minTradeSize;
    }

    public void setMinTradeSize(Integer minTradeSize) {
        this.minTradeSize = minTradeSize;
    }

    public Integer getMaxTradeSize() {
        return maxTradeSize;
    }

    public void setMaxTradeSize(Integer maxTradeSize) {
        this.maxTradeSize = maxTradeSize;
    }

    public Long getManualTradeQty() {
        return manualTradeQty;
    }

    public void setManualTradeQty(Long manualTradeQty) {
        this.manualTradeQty = manualTradeQty;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Long getCommission() {
        return commission;
    }

    public void setCommission(Long commission) {
        this.commission = commission;
    }

    public Long getMarketCurrencyIdId() {
        return marketCurrencyIdId;
    }

    public void setMarketCurrencyIdId(Long coinId) {
        this.marketCurrencyIdId = coinId;
    }

    public String getMarketCurrencyIdMarketCurrency() {
        return marketCurrencyIdMarketCurrency;
    }

    public void setMarketCurrencyIdMarketCurrency(String coinMarketCurrency) {
        this.marketCurrencyIdMarketCurrency = coinMarketCurrency;
    }

    public Long getBaseCurrencyIdId() {
        return baseCurrencyIdId;
    }

    public void setBaseCurrencyIdId(Long coinId) {
        this.baseCurrencyIdId = coinId;
    }

    public String getBaseCurrencyIdBaseCurrency() {
        return baseCurrencyIdBaseCurrency;
    }

    public void setBaseCurrencyIdBaseCurrency(String coinBaseCurrency) {
        this.baseCurrencyIdBaseCurrency = coinBaseCurrency;
    }

    public Long getExchangeIdId() {
        return exchangeIdId;
    }

    public void setExchangeIdId(Long exchangeId) {
        this.exchangeIdId = exchangeId;
    }

    public Long getMarketPriceIdId() {
        return marketPriceIdId;
    }

    public void setMarketPriceIdId(Long marketPriceId) {
        this.marketPriceIdId = marketPriceId;
    }

    public String getMarketPriceIdCurrencyPairCode() {
        return marketPriceIdCurrencyPairCode;
    }

    public void setMarketPriceIdCurrencyPairCode(String marketPriceCurrencyPairCode) {
        this.marketPriceIdCurrencyPairCode = marketPriceCurrencyPairCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MarketDTO marketDTO = (MarketDTO) o;
        if(marketDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), marketDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MarketDTO{" +
            "id=" + getId() +
            ", currencyPairCode='" + getCurrencyPairCode() + "'" +
            ", name='" + getName() + "'" +
            ", marketCurrency='" + getMarketCurrency() + "'" +
            ", baseCurrency='" + getBaseCurrency() + "'" +
            ", minTradeSize=" + getMinTradeSize() +
            ", maxTradeSize=" + getMaxTradeSize() +
            ", manualTradeQty=" + getManualTradeQty() +
            ", isActive=" + getIsActive() +
            ", commission=" + getCommission() +
            "}";
    }
}
