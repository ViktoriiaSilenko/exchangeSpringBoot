package io.swagger.repository.entity;

import javax.persistence.*;
import java.math.BigDecimal;

@Entity
@Table(name="COMMISSIONS")
public class CommissionEntity {

    @Id
    @GeneratedValue
    private Long id;

    @Column(name="commission_pt", nullable=false)
    private BigDecimal commissionPt;

    @Column(name="currency_from", nullable=false)
    private String currencyFrom;

    @Column(name="currency_to", nullable=false)
    private String currencyTo;

    public BigDecimal getCommissionPt() {
        return commissionPt;
    }

    public void setCommissionPt(BigDecimal commissionPt) {
        this.commissionPt = commissionPt;
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
                .append("commissionPt", commissionPt)
                .append("currencyFrom", currencyFrom)
                .append("currencyTo", currencyTo)
                .toString();
    }

}
