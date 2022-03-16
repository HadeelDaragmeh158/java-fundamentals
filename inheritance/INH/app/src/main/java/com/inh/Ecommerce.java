package com.inh;

import java.util.ArrayList;
import java.util.List;

public class Ecommerce {
    private String name ;
    private int numOfStars;
    private List <Review> reviewList= new ArrayList<>();
    int count, sumOfStars;

    public int getNumOfStars() {
        return numOfStars;
    }

    public Ecommerce(String name, int numOfStars) {
        this.name = name;
        this.numOfStars = numOfStars;
        this.count=0;
        this.sumOfStars=0;
    }

    public String getName() {
        return name;
    }

    public List<Review> getReviewList() {
        return reviewList;
    }

    public void addReview(Review review){
        this.reviewList.add(review);
        count ++;
        sumOfStars+=review.getNumOfStars();
        numOfStars=sumOfStars/count;
    }


    @Override
    public String toString() {
        return "Ecommerce{" +
                "name='" + name + '\'' +
                ", numOfStars=" + numOfStars +
                ", reviewList=" + reviewList +
                '}';
    }
}
