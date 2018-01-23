package com.antya.domain;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Objects;

/**
 * A CoinAttributes.
 */
@Entity
@Table(name = "coin_attributes")
@Cache(usage = CacheConcurrencyStrategy.NONSTRICT_READ_WRITE)
public class CoinAttributes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "min_confirmation")
    private Integer minConfirmation;

    @Column(name = "txn_fees")
    private Long txnFees;

    @OneToOne
    @JoinColumn(unique = true)
    private Coin coinId;

    // jhipster-needle-entity-add-field - JHipster will add fields here, do not remove
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMinConfirmation() {
        return minConfirmation;
    }

    public CoinAttributes minConfirmation(Integer minConfirmation) {
        this.minConfirmation = minConfirmation;
        return this;
    }

    public void setMinConfirmation(Integer minConfirmation) {
        this.minConfirmation = minConfirmation;
    }

    public Long getTxnFees() {
        return txnFees;
    }

    public CoinAttributes txnFees(Long txnFees) {
        this.txnFees = txnFees;
        return this;
    }

    public void setTxnFees(Long txnFees) {
        this.txnFees = txnFees;
    }

    public Coin getCoinId() {
        return coinId;
    }

    public CoinAttributes coinId(Coin coin) {
        this.coinId = coin;
        return this;
    }

    public void setCoinId(Coin coin) {
        this.coinId = coin;
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
        CoinAttributes coinAttributes = (CoinAttributes) o;
        if (coinAttributes.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), coinAttributes.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CoinAttributes{" +
            "id=" + getId() +
            ", minConfirmation=" + getMinConfirmation() +
            ", txnFees=" + getTxnFees() +
            "}";
    }
}
