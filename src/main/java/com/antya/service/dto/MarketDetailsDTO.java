package com.antya.service.dto;


import java.time.Instant;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the MarketDetails entity.
 */
public class MarketDetailsDTO implements Serializable {

    private Long id;

    private Long highPrice;

    private Long lowPrice;

    private Long lastPrice;

    private Long askPrice;

    private Long bidPrice;

    private Long volume24hours;

    private Instant timeStamp;

    private Integer isActive;

    private Long exchangeId;

    private Long marketId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHighPrice() {
        return highPrice;
    }

    public void setHighPrice(Long highPrice) {
        this.highPrice = highPrice;
    }

    public Long getLowPrice() {
        return lowPrice;
    }

    public void setLowPrice(Long lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Long getLastPrice() {
        return lastPrice;
    }

    public void setLastPrice(Long lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Long getAskPrice() {
        return askPrice;
    }

    public void setAskPrice(Long askPrice) {
        this.askPrice = askPrice;
    }

    public Long getBidPrice() {
        return bidPrice;
    }

    public void setBidPrice(Long bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Long getVolume24hours() {
        return volume24hours;
    }

    public void setVolume24hours(Long volume24hours) {
        this.volume24hours = volume24hours;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Long getExchangeId() {
        return exchangeId;
    }

    public void setExchangeId(Long exchangeId) {
        this.exchangeId = exchangeId;
    }

    public Long getMarketId() {
        return marketId;
    }

    public void setMarketId(Long marketId) {
        this.marketId = marketId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        MarketDetailsDTO marketDetailsDTO = (MarketDetailsDTO) o;
        if(marketDetailsDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), marketDetailsDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MarketDetailsDTO{" +
            "id=" + getId() +
            ", highPrice=" + getHighPrice() +
            ", lowPrice=" + getLowPrice() +
            ", lastPrice=" + getLastPrice() +
            ", askPrice=" + getAskPrice() +
            ", bidPrice=" + getBidPrice() +
            ", volume24hours=" + getVolume24hours() +
            ", timeStamp='" + getTimeStamp() + "'" +
            ", isActive=" + getIsActive() +
            "}";
    }
}
