package com.inh;

public class Review {
    String Body,author;
    int numOfStars;


    public Review( String Body,String author , int numOfStars){
        this.numOfStars=numOfStars;
        this.Body=Body;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Review{" +
                "Body='" + Body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars +
                '}';
    }

    public int getNumOfStars() {
        return  this.getNumOfStars();
    }
}
