package com.inh;



public class App {
    Restaurant resturantTest = new Restaurant("Hadeel", 5,"$");
    Review rev1= new Review("10/10","Mohammad",5);
    Review rev2 =new Review("the onion is burnt","Hadeel",4);
    Review rev3 =new Review("Good View","Maria", 5);

        resturantTest.addReview(rev1);
        System.out.println(resturantTest);
        resturantTest.addReview(rev2);
        System.out.println(resturantTest);
        resturantTest.addReview(rev3);
        System.out.println(resturantTest);


}