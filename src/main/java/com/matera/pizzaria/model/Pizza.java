package com.matera.pizzaria.model;

import java.math.BigDecimal;

/**
 *
 *
 * @author wbatista teste
 */
public class Pizza {

    private Long id;
    private String name;
    private BigDecimal price;

    /**
     * @return the id
     */
    public Long getId() {

        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {

        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {

        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {

        this.name = name;
    }

    /**
     * @return the price
     */
    public BigDecimal getPrice() {

        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(BigDecimal price) {

        this.price = price;
    }

}
