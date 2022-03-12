package com.inh;

import java.util.List;

public class Restaurant extends Shop{
    String name ;
    int numOfStars;
    String priceCategory;


/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////



  public   Restaurant (String name, int numOfStars, String priceCategory, String Description,int numOfDollarSigns ){
        super(name,Description,numOfDollarSigns);
        this.name=name ;
        this.numOfStars=numOfStars;
        this.priceCategory=priceCategory;
    }

    public List<Review> getListofReviewInResturant() {
        return getReviews();
    }


    public int getNumOfStars() {
        return numOfStars;
    }



    public String  getPriceCategory() {
        return priceCategory;
    }

    public void addReview (Review review) {
        setReviews((List<Review>) review);
    }
    public int sumOfStars(){
        List<Review>reviews=getListofReviewInResturant();
        int count = 0;
        for (Review rev:reviews) {
            count += rev.getNumOfStars();
        }this.numOfStars = count/reviews.size();
        return numOfStars;
    }
    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", priceCategory=" + priceCategory +
                '}';
    }
}
