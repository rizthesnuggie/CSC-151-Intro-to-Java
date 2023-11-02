/*The Harrison Group Life Insurance company computes annual policy premiums based on the age the customer turns in the current calendar year. The premium is computed by taking the decade of the customer’s age, adding 15 to it, and multiplying by 20.

For example, a 34-year-old would pay $360, which is calculated by adding the decades (3) to 15, and then multiplying by 20.

Write an application that prompts a user for the current year then a birth year. Pass both to a method that calculates and returns the premium amount, and then display the returned amount.

An example of the program is shown below:

Enter the current year >> 2020
Enter the birth year >> 2001
The premium is $320
*/

import java.util.Scanner;
class Insurance {
    public static void main (String args[]) {
        
        Scanner userInput = new Scanner(System.in);
        
        int currentYear;
        int userBirthYear;
 
        System.out.println("Enter the current year: ");
        currentYear = userInput.nextInt();
        System.out.println("Enter your birth year: ");
        userBirthYear = userInput.nextInt();
        System.out.println("The premium is $"+calculatePremium(currentYear,userBirthYear));

    }

    public static int calculatePremium(int curr, int birth) {
        return ((((curr-birth)/10)+15)*20);
    }
}
