package com.inh;

import com.inh.*;
import com.inh.Review;

public class App {

    public static void main(String[] args) {
        Review rev1 = new Review("any","Hadeel", 4);
        Review rev2 = new Review("any2","res", 5);
        Review rev3 = new Review("any3","shop", 6);

        //theater
        Theater theater =new Theater("Action", 5);
        theater.addMovie("Move1");
        theater.addMovie("Move2");
        theater.addMovie("Move3");

        theater.addReview(rev1, "Move1");
//rest
        Restaurant restaurant =new Restaurant("HH", 5,"$");
        restaurant.addReview(rev2);
//shop
        Shop shop = new Shop("shop", 5, "disc good", "$");
        shop.addReview(rev3);
        System.out.println("theater"+theater+"\n"+"Restaurant"+restaurant+"\n"+"Shop"+shop);

}
}
