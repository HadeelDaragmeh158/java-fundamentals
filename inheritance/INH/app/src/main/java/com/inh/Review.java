package com.inh;

public class Review {
    private  String Body,author;
    private int numOfStars;
    private String newMovie = "";

/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////


    public String getNewMovie() {
        return newMovie;
    }

    public void setNewMovie(String newMovie) {
        this.newMovie = newMovie;
    }

    public Review(String Body, String author , int numOfStars){
        this.numOfStars=numOfStars;
        this.Body=Body;
        this.author=author;
    }
    public int getNumOfStars() {
        return  numOfStars;
    }

    public void setNumOfStars(int numOfStars) {
      if (numOfStars>5){
          System.out.println("Please Enter number less than 6");
      }else {
          this.numOfStars = numOfStars;
      }
    }

    @Override
    public String toString() {
      if (!newMovie.isEmpty()){
          return "Review{" +
                  "Body='" + Body + '\'' +
                  ", author='" + author + '\'' +
                  ", numOfStars=" + numOfStars +
                  ", newMovie='" + newMovie + '\'' +
                  '}';
      }else
          return "Review{" +
                  "Body='" + Body + '\'' +
                  ", author='" + author + '\'' +
                  ", numOfStars=" + numOfStars +
                  '}';

    }
}
