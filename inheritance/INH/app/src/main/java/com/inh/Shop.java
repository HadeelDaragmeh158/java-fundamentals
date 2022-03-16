package com.inh;

import java.util.ArrayList;
import java.util.List;

public class Shop extends Ecommerce {

    String Description;
    String priceCategory;
/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////

    public Shop(String name, int numOfStars, String description, String  priceCategory) {
        super(name, numOfStars);
        Description = description;
        this.priceCategory = priceCategory;
    }

    public String getDescription() {
        return Description;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Description='" + Description + '\'' +
                "name="+super.getName()+"\'"+
                "stars"+super.getReviewList()+"\'"+
                ", priceCategory=" + priceCategory +
                '}';
    }
}
