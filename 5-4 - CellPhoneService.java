/*Write the CellPhoneService program for Horizon Phones, a provider of cellular phone service. Prompt a user for maximum monthly values for talk minutes used, text messages sent, and gigabytes of data used, and then recommend the best plan for the customer’s needs.

    A customer who needs fewer than 500 minutes of talk and no text or data should accept Plan A at $49 per month.

    A customer who needs fewer than 500 minutes of talk and any text messages should accept Plan B at $55 per month.

    A customer who needs 500 or more minutes of talk and no data should accept either Plan C for up to 100 text messages at $61 per month or Plan D for 100 text messages or more at $70 per month.

    A customer who needs any data should accept Plan E for up to 3 gigabytes at $79 or Plan F for 3 gigabytes or more at $87.

An example of the program is shown below:

Enter talk minutes needed
400
Enter text messages needed
1000
Enter gigabytes of data needed
5
Plan F  $87 per month
*/

import java.util.*;
public class CellPhoneService {
    public static void main (String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter talk minutes needed");
        int userMinutes = userInput.nextInt();
        System.out.println("Enter text messages needed");
        int userMessages = userInput.nextInt();
        System.out.println("Enter gigabytes of data needed");
        int userData = userInput.nextInt();
        checkPlan(userMinutes,userMessages,userData);
    }


    public static void checkPlan(int minutes,int messages,int data){
        if(data>=3){
            System.out.println("Plan F $87 per month");
        }
        else if(data<3 & data>0){
            System.out.println("Plan E $79 per month");
        }
        else if(data<=0 && messages>=100 && minutes>=500){
            System.out.println("Plan D $70 per month");
        }
        else if(data<=0 && messages<100 && minutes>=500){
            System.out.println("Plan C $61 per month");
        }
        else if(data<=0 && messages>0 && minutes<500){
            System.out.println("Plan B $55 per month");
        }
        else if (data<=0 && messages<=0 && minutes<500){
            System.out.println("Plan A $49 per month");
        }
    }
}
