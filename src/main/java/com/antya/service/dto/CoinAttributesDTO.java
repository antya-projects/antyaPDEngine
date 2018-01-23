package com.antya.service.dto;


import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.Objects;

/**
 * A DTO for the CoinAttributes entity.
 */
public class CoinAttributesDTO implements Serializable {

    private Long id;

    private Integer minConfirmation;

    private Long txnFees;

    private Long coinIdId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getMinConfirmation() {
        return minConfirmation;
    }

    public void setMinConfirmation(Integer minConfirmation) {
        this.minConfirmation = minConfirmation;
    }

    public Long getTxnFees() {
        return txnFees;
    }

    public void setTxnFees(Long txnFees) {
        this.txnFees = txnFees;
    }

    public Long getCoinIdId() {
        return coinIdId;
    }

    public void setCoinIdId(Long coinId) {
        this.coinIdId = coinId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        CoinAttributesDTO coinAttributesDTO = (CoinAttributesDTO) o;
        if(coinAttributesDTO.getId() == null || getId() == null) {
            return false;
        }
        return Objects.equals(getId(), coinAttributesDTO.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(getId());
    }

    @Override
    public String toString() {
        return "CoinAttributesDTO{" +
            "id=" + getId() +
            ", minConfirmation=" + getMinConfirmation() +
            ", txnFees=" + getTxnFees() +
            "}";
    }
}
