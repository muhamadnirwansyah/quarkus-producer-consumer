package org.app.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "polis")
public class Polis {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "polis_number", nullable = false)
    private String polisNumber;
    @Column(name = "polis_holder", nullable = false)
    private String polisHolder;
    @Column(name = "product", nullable = false)
    private String product;
    @Column(name = "premium", nullable = false)
    private BigDecimal premium;

    public Polis(){}

    public Polis(String polisNumber, String polisHolder, String product, BigDecimal premium){
        this.polisNumber = polisNumber;
        this.polisHolder = polisHolder;
        this.product = product;
        this.premium = premium;
    }

    public Long getId(){
        return id;
    }

    public void setId(Long id){
        this.id = id;
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
