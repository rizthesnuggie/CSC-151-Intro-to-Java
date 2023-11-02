/*Meadowdale Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. Write a program that prompts a user for the number of eggs in the order and then display the amount owed with a full explanation using the following wording: You ordered 27 eggs. That’s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents each for a total of $7.85.
*/

import java.util.Scanner;
class Eggs {
    public static void main(String[] args) {
        
    Scanner userInput = new Scanner(System.in);
    System.out.println("How many eggs go you want? ");
    int eggCount = userInput.nextInt();

    int dozenEggCount = 12;

    double dozenEggPrice = 3.25;
    double singleEggPrice = 0.45;


    int finalDozenCount = eggCount/dozenEggCount;
    int finalSingleCount = eggCount%dozenEggCount;
    
    double finalPrice = (dozenEggPrice*finalDozenCount)+(singleEggPrice*finalSingleCount);
    


        System.out.println("You ordered "+eggCount+" eggs. That’s "+finalDozenCount+" dozen at $3.25 per dozen and "+finalSingleCount+" loose eggs at 45 cents each for a total of $"+finalPrice+".");
    }
}
