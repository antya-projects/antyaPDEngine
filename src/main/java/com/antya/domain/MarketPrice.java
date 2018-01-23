package com.antya.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A MarketPrice.
 */
@Entity
@Table(name = "market_price")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class MarketPrice implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "current_price")
    private Long currentPrice;

    @Column(name = "time_stamp")
    private Instant timeStamp;

    @ManyToMany(mappedBy = "marketPrices")
    @JsonIgnore
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    private Set<Market> markets = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getCurrentPrice() {
        return currentPrice;
    }

    public MarketPrice currentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
        return this;
    }

    public void setCurrentPrice(Long currentPrice) {
        this.currentPrice = currentPrice;
    }

    public Instant getTimeStamp() {
        return timeStamp;
    }

    public MarketPrice timeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
        return this;
    }

    public void setTimeStamp(Instant timeStamp) {
        this.timeStamp = timeStamp;
    }

    public Set<Market> getMarkets() {
        return markets;
    }

    public MarketPrice markets(Set<Market> markets) {
        this.markets = markets;
        return this;
    }

    public MarketPrice addMarket(Market market) {
        this.markets.add(market);
        market.getMarketPrices().add(this);
        return this;
    }

    public MarketPrice removeMarket(Market market) {
        this.markets.remove(market);
        market.getMarketPrices().remove(this);
        return this;
    }

    public void setMarkets(Set<Market> markets) {
        this.markets = markets;
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
        MarketPrice marketPrice = (MarketPrice) o;
        if (marketPrice.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), marketPrice.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "MarketPrice{" +
            "id=" + getId() +
            ", currentPrice=" + getCurrentPrice() +
            ", timeStamp='" + getTimeStamp() + "'" +
            "}";
    }
}
