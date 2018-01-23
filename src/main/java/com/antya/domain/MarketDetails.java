package com.antya.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.Objects;

/**
 * A MarketDetails.
 */
@Entity
@Table(name = "market_details")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MarketDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "high_price")
    private Long highPrice;

    @Column(name = "low_price")
    private Long lowPrice;

    @Column(name = "last_price")
    private Long lastPrice;

    @Column(name = "ask_price")
    private Long askPrice;

    @Column(name = "bid_price")
    private Long bidPrice;

    @Column(name = "volume_24_hours")
    private Long volume24hours;

    @Column(name = "time_stamp")
    private Instant timeStamp;

    @Column(name = "is_active")
    private Integer isActive;

    @OneToOne
    @JoinColumn(unique = true)
    private Exchange exchange;

    @OneToOne
    @JoinColumn(unique = true)
    private Market market;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getHighPrice() {
        return highPrice;
    }

    public MarketDetails highPrice(Long highPrice) {
        this.highPrice = highPrice;
        return this;
    }

    public void setHighPrice(Long highPrice) {
        this.highPrice = highPrice;
    }

    public Long getLowPrice() {
        return lowPrice;
    }

    public MarketDetails lowPrice(Long lowPrice) {
        this.lowPrice = lowPrice;
        return this;
    }

    public void setLowPrice(Long lowPrice) {
        this.lowPrice = lowPrice;
    }

    public Long getLastPrice() {
        return lastPrice;
    }

    public MarketDetails lastPrice(Long lastPrice) {
        this.lastPrice = lastPrice;
        return this;
    }

    public void setLastPrice(Long lastPrice) {
        this.lastPrice = lastPrice;
    }

    public Long getAskPrice() {
        return askPrice;
    }

    public MarketDetails askPrice(Long askPrice) {
        this.askPrice = askPrice;
        return this;
    }

    public void setAskPrice(Long askPrice) {
        this.askPrice = askPrice;
    }

    public Long getBidPrice() {
        return bidPrice;
    }

    public MarketDetails bidPrice(Long bidPrice) {
        this.bidPrice = bidPrice;
        return this;
    }

    public void setBidPrice(Long bidPrice) {
        this.bidPrice = bidPrice;
    }

    public Long getVolume24hours() {
        return volume24hours;
    }

    public MarketDetails volume24hours(Long volume24hours) {
        this.volume24hours = volume24hours;
        return this;
    }

    public void setVolume24hours(Long volume24hours) {
        this.volume24hours = volume24hours;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public MarketDetails timeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public MarketDetails isActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public MarketDetails exchange(Exchange exchange) {
        this.exchange = exchange;
        return this;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public Market getMarket() {
        return market;
    }

    public MarketDetails market(Market market) {
        this.market = market;
        return this;
    }

    public void setMarket(Market market) {
        this.market = market;
    }
    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here, do not remove

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MarketDetails marketDetails = (MarketDetails) o;
        if (marketDetails.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), marketDetails.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MarketDetails{" +
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
