package com.inh;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Theater {

    String name ;
    List<String> Movies = new ArrayList<>();


/////////////////////////////////////////////////////////////////////////////////
///////////////////////// METHODS   /////////////////////////////////////////////
/////////////////////////////////////////////////////////////////////////////////


    Theater (String name ){
    this.name=name;

    }
    void addMovie(String Movie){
         Movies.add(Movie);
    //  int number = list.get(0);
        System.out.println("The Movie "+Movie+" Added. ");
    }
    void removeMovie(String Movie){
        Movies.remove(Movie);
    }
    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", Movies=" + Movies +
                '}';
    }
}
