package com.inh;

import java.util.ArrayList;
import java.util.List;

public class Shop {
//should have a name, description, and number of dollar signs.
    String name;
    String Description;
    int numOfDollarSigns;
    private final List<Review> reviews =new ArrayList<>();
/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////

    Shop(String name ,String Description , int numOfDollarSigns ){
        this.Description=Description;
        this.name=name;
        this.numOfDollarSigns=numOfDollarSigns;
    }
    public void setReviews (List<Review>reviews){
        this.reviews.add((Review) reviews);

        System.out.println("Your reviews has been added ");
    }




    public List<Review> getReviews() {
        return reviews;
    }


    @Override
    public String toString() {
        return "Shop{" +
                "name='" + name + '\'' +
                ", Description='" + Description + '\'' +
                ", numOfDollarSigns=" + numOfDollarSigns +
                '}';
    }
}
