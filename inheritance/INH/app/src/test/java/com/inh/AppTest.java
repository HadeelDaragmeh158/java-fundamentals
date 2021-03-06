/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package com.inh;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
@Test
    void testRest() {
    Review rev1 = new Review("any","Hadeel", 4);
    Restaurant restaurant =new Restaurant("HH", 5,"$");
    restaurant.addReview(rev1);
    int rev =restaurant.getNumOfStars();
    assertEquals(4,rev);
}
@Test
    void testTheater(){
    Review rev2 = new Review("any2","res", 5);
    Theater theater =new Theater("Action", 5);
    theater.addMovie("Move1");
    theater.addMovie("Move2");
    theater.addMovie("Move3");

    theater.addReview(rev2, "Move1");

    assertEquals(5, theater.getNumOfStars());
}

@Test
    void testShop(){

    Review rev3 = new Review("any3","shop", 5);

    Shop shop = new Shop("shop", 5, "disc good", "$");
    shop.addReview(rev3);

     assertEquals(5,shop.getNumOfStars());
}
}
