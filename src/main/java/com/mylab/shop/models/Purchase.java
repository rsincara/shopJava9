package com.mylab.shop.models;

import java.util.Date;

public class Purchase {
    private Long id;
    private String name;
    private Date addingDate;
    private Boolean isBought = false;

    public Purchase(Long id, String name, Date addingDate) {
        this.id = id;
        this.name = name;
        this.addingDate = addingDate;
    }

    public Purchase() {
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getAddingDate() {
        return addingDate;
    }

    public boolean isBought() {
        return isBought;
    }

    public void setBought() {
        isBought = true;
    }
}
