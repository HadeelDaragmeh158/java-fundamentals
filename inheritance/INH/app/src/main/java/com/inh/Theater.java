package com.inh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Theater extends Ecommerce{

    List<String> listMovies = new ArrayList<>();


/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////


    public Theater(String name, int numOfStars) {
        super(name, numOfStars);
    }

    void addMovie(String movie){
        if (listMovies.contains(movie)){
            System.out.println("Movie already exist");
        }
        else { listMovies.add(movie);
        System.out.println("The Movie "+movie+" Added. ");
        }
    }
   public void addReview(Review review, String newMovie){
        if (!newMovie.isEmpty()){
            review.setNewMovie(newMovie);
        }
       super.getReviewList().add(review);
       super.count ++;
       sumOfStars+=review.getNumOfStars();
       review.setNumOfStars(sumOfStars/count);
    }

    void removeMovie(String movie){
        listMovies.remove(movie);
    }


    @Override
    public String toString() {
        return "Theater{" +
                "listMovies=" + listMovies +"\'"+
                "name="+super.getName()+"\'"+
                "stars"+super.getReviewList()+"\'"+
                '}';
    }
}
