package com.semicore.jparel.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "price_info")
public class PriceInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "price_info_id")
    private Integer pricInfoId;

    @Column(name = "pruch_price")
    private  Double pruchPrice;

    @Column(name = "discount")
    private Double discount;

    @Column(name = "sell_price")
    private Double sellPrice;

    public Integer getPricInfoId() {
        return pricInfoId;
    }

    public void setPricInfoId(Integer pricInfoId) {
        this.pricInfoId = pricInfoId;
    }

    public Double getPruchPrice() {
        return pruchPrice;
    }

    public void setPruchPrice(Double pruchPrice) {
        this.pruchPrice = pruchPrice;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public Double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(Double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
