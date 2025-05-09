package org.app.model;

import java.math.BigDecimal;

public class Polis {

    private String polisNumber;
    private String polisHolder;
    private String product;
    private BigDecimal premium;

    public Polis(){}

    public Polis(String polisNumber, String polisHolder, String product, BigDecimal premium){
        this.polisNumber = polisNumber;
        this.polisHolder = polisHolder;
        this.product = product;
        this.premium = premium;
    }

    public String getPolisNumber(){
        return polisNumber;
    }

    public void setPolisNumber(String polisNumber){
        this.polisNumber = polisNumber;
    }

    public String getPolisHolder(){
        return polisHolder;
    }

    public void setPolisHolder(String polisHolder){
        this.polisHolder = polisHolder;
    }

    public String getProduct() {
        return product;
    }

    public void setProduct(String product) {
        this.product = product;
    }

    public BigDecimal getPremium() {
        return premium;
    }

    public void setPremium(BigDecimal premium) {
        this.premium = premium;
    }

    @Override
    public String toString() {
        return "Polis{" +
                "polisNumber='" + polisNumber + '\'' +
                ", polisHolder='" + polisHolder + '\'' +
                ", product='" + product + '\'' +
                ", premium=" + premium +
                '}';
    }
}
