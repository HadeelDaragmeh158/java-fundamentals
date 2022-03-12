package com.inh;

public class Review {
    String Body,author;
    int numOfStars;
/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////


    public Review( String Body,String author , int numOfStars){
        this.numOfStars=numOfStars;
        this.Body=Body;
        this.author=author;
    }
    public int getNumOfStars() {
        return  this.getNumOfStars();
    }

    @Override
    public String toString() {
        return "Review{" +
                "Body='" + Body + '\'' +
                ", author='" + author + '\'' +
                ", numOfStars=" + numOfStars +
                '}';
    }


}
