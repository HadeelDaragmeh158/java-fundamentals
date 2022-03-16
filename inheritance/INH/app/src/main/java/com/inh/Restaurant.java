package com.inh;

import java.util.List;

public class Restaurant extends Ecommerce{
    String priceCategory;



/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////


    public Restaurant(String name, int numOfStars, String priceCategory) {
        super(name, numOfStars);
        this.priceCategory = priceCategory;
    }

    public String getPriceCategory() {
        return priceCategory;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "priceCategory='" + priceCategory + '\'' +
                "name="+super.getName()+"\'"+
                "stars"+super.getReviewList()+"\'"+
                '}';
    }
}
