package com.inh;



import java.util.ArrayList;
import java.util.List;

public class Restaurant<setReview> {
    String name ;
    int numOfStars;
    String priceCategory;
    private final List<Review> reviews =new ArrayList<>();

    Restaurant (String name, int numOfStars, String priceCategory){        this.name=name ;
        this.numOfStars=numOfStars;
        this.priceCategory=priceCategory;
    }

    public List<Review> getListofReviewInResturant() {
        return reviews;
    }

    public String getName() {
        return name;
    }


    public int getNumOfStars() {
        return numOfStars;
    }



    public String  getPriceCategory() {
        return priceCategory;
    }


    public List<Review> getReviews() {
        return reviews;
    }
    public void addReview (Review review) {
        int count = 0;
        for (Review rev:reviews) {
            count = count + rev.getNumOfStars();
        }this.numOfStars = count/reviews.size();
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
