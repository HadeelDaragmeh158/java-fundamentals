# java-fundamentals
https://canvas.instructure.com/courses/4333681/assignments/28344566 

## The tasks Lab01 2/26:
- Flipping Coins
- Pluralize
- Command Line Clock

# The tasks Lab02  2/26:
- roll.
- containsDuplicates.
- Calculating Averages.


# The task Lab03 27/2:
###Linter : File I/O
_method _that reads a JavaScript file with a given Path, and generates an error message whenever it finds a line that doesn’t end in a semi-colon.


# Composition and Inheritance
Create a class to represent a Restaurant. Each Restaurant should have a name, a number of stars betweeen 0 and 5, and a price category (i.e. number of dollar signs).
Implement a Restaurant constructor.
Test that your Restaurant constructor is behaving reasonably.
Implement a reasonable toString method for Restaurants.
Write a test to create an instance of Restaurant and ensure that its toString is working properly.
Create a class to represent a Review. Each Review should have a body, an author, and a number of stars.
Write a Review constructor.
Test that your constructor is working reasonably.
Implement a reasonable toString method for Reviews.
Write a test to create an instance of Review and ensure that its toString is working properly.
A Review should be about a single Restaurant. Choose an implementation for this, and implement it. Some considerations:
Should a Review know which Restaurant it is about?
Should a Restaurant know which Reviews are about it?
Is a Restaurant a special type of Review? Is a Review a special type of Restaurant? Is there common functionality that unites them?
Update your toString and constructor methods appropriately, and also update your testing code to test this new functionality.
Add an instance method addReview to your Restaurant class. This method should take in a Review instance, and associate that review with this Restaurant. The specific methodology for this will vary, depending on the implementation you chose above.
Add tests to ensure that when you call addReview, the association is created between the Restaurant and the Review.
When you associate a review with a restaurant, that restaurant’s star rating should change. Ensure that your addReview method updates the Restaurant star rating appropriately, and add tests. (In particular, ensure that if you’re trying to call addReview when the restaurant and the review are already associated, the star rating of the restaurant does not update.)
