package io.swagger.repository.entity;

import java.math.BigDecimal;
import javax.persistence.*;

@Entity
@Table(name="EXCHANGE_RATE")
public class ExchangeRateEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="exchange_rate", nullable=false)
    private BigDecimal exchangeRate;

    @Column(name="currency_from", nullable=false)
    private String currencyFrom;

    @Column(name="currency_to", nullable=false)
    private String currencyTo;

    public BigDecimal getExchangeRate() {
        return exchangeRate;
    }

    public void setExchangeRate(BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    public String getCurrencyFrom() {
        return currencyFrom;
    }

    public void setCurrencyFrom(String currencyFrom) {
        this.currencyFrom = currencyFrom;
    }

    public String getCurrencyTo() {
        return currencyTo;
    }

    public void setCurrencyTo(String currencyTo) {
        this.currencyTo = currencyTo;
    }

    @Override
    public String toString() {
        return new org.apache.commons.lang3.builder.ToStringBuilder(this)
                .append("id", id)
                .append("exchangeRate", exchangeRate)
                .append("currencyFrom", currencyFrom)
                .append("currencyTo", currencyTo)
                .toString();
    }
}
