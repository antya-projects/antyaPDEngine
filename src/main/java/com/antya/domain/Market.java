package com.antya.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A Market.
 */
@Entity
@Table(name = "market")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class Market implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "currency_pair_code")
    private String currencyPairCode;

    @Column(name = "name")
    private String name;

    @Column(name = "market_currency")
    private String marketCurrency;

    @Column(name = "base_currency")
    private String baseCurrency;

    @Column(name = "min_trade_size")
    private Integer minTradeSize;

    @Column(name = "max_trade_size")
    private Integer maxTradeSize;

    @Column(name = "manual_trade_qty")
    private Long manualTradeQty;

    @Column(name = "is_active")
    private Integer isActive;

    @Column(name = "commission")
    private Long commission;

    @OneToOne
    @JoinColumn(unique = true)
    private Coin market;

    @OneToOne
    @JoinColumn(unique = true)
    private Coin market;

    @OneToOne
    @JoinColumn(unique = true)
    private Exchange exchange;

    @ManyToMany
    @Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
    @JoinTable(name = "market_market_price",
               joinColumns = @JoinColumn(name="markets_id", referencedColumnName="id"),
               inverseJoinColumns = @JoinColumn(name="market_prices_id", referencedColumnName="id"))
    private Set<MarketPrice> marketPrices = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCurrencyPairCode() {
        return currencyPairCode;
    }

    public Market currencyPairCode(String currencyPairCode) {
        this.currencyPairCode = currencyPairCode;
        return this;
    }

    public void setCurrencyPairCode(String currencyPairCode) {
        this.currencyPairCode = currencyPairCode;
    }

    public String getName() {
        return name;
    }

    public Market name(String name) {
        this.name = name;
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarketCurrency() {
        return marketCurrency;
    }

    public Market marketCurrency(String marketCurrency) {
        this.marketCurrency = marketCurrency;
        return this;
    }

    public void setMarketCurrency(String marketCurrency) {
        this.marketCurrency = marketCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public Market baseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
        return this;
    }

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public Integer getMinTradeSize() {
        return minTradeSize;
    }

    public Market minTradeSize(Integer minTradeSize) {
        this.minTradeSize = minTradeSize;
        return this;
    }

    public void setMinTradeSize(Integer minTradeSize) {
        this.minTradeSize = minTradeSize;
    }

    public Integer getMaxTradeSize() {
        return maxTradeSize;
    }

    public Market maxTradeSize(Integer maxTradeSize) {
        this.maxTradeSize = maxTradeSize;
        return this;
    }

    public void setMaxTradeSize(Integer maxTradeSize) {
        this.maxTradeSize = maxTradeSize;
    }

    public Long getManualTradeQty() {
        return manualTradeQty;
    }

    public Market manualTradeQty(Long manualTradeQty) {
        this.manualTradeQty = manualTradeQty;
        return this;
    }

    public void setManualTradeQty(Long manualTradeQty) {
        this.manualTradeQty = manualTradeQty;
    }

    public Integer getIsActive() {
        return isActive;
    }

    public Market isActive(Integer isActive) {
        this.isActive = isActive;
        return this;
    }

    public void setIsActive(Integer isActive) {
        this.isActive = isActive;
    }

    public Long getCommission() {
        return commission;
    }

    public Market commission(Long commission) {
        this.commission = commission;
        return this;
    }

    public void setCommission(Long commission) {
        this.commission = commission;
    }

    public Coin getMarket() {
        return market;
    }

    public Market market(Coin coin) {
        this.market = coin;
        return this;
    }

    public void setMarket(Coin coin) {
        this.market = coin;
    }

    public Coin getMarket() {
        return market;
    }

    public Market market(Coin coin) {
        this.market = coin;
        return this;
    }

    public void setMarket(Coin coin) {
        this.market = coin;
    }

    public Exchange getExchange() {
        return exchange;
    }

    public Market exchange(Exchange exchange) {
        this.exchange = exchange;
        return this;
    }

    public void setExchange(Exchange exchange) {
        this.exchange = exchange;
    }

    public Set<MarketPrice> getMarketPrices() {
        return marketPrices;
    }

    public Market marketPrices(Set<MarketPrice> marketPrices) {
        this.marketPrices = marketPrices;
        return this;
    }

    public Market addMarketPrice(MarketPrice marketPrice) {
        this.marketPrices.add(marketPrice);
        marketPrice.getMarkets().add(this);
        return this;
    }

    public Market removeMarketPrice(MarketPrice marketPrice) {
        this.marketPrices.remove(marketPrice);
        marketPrice.getMarkets().remove(this);
        return this;
    }

    public void setMarketPrices(Set<MarketPrice> marketPrices) {
        this.marketPrices = marketPrices;
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
        Market market = (Market) o;
        if (market.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), market.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "Market{" +
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
