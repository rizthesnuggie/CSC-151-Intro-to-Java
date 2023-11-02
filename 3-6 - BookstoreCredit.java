/*To encourage good grades, Hermosa High School has decided to award each student a bookstore credit that is 10 times the student’s grade point average.

In other words, a student with a 3.2 grade point average receives a $32.0 credit.

Create an application that prompts a student for a name and grade point average, and then passes the values to a method (computeDiscount) that displays a descriptive message. The message uses the student’s name, echoes the grade point average, and computes and displays the credit.

An example of the program is shown below:

Enter your name >> John
Enter your gpa >>3.4
John, your  GPA is 3.4, so your your credit is $34.0
*/

import java.util.Scanner;
public class BookstoreCredit {
    public static void main (String args[]) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Input your Name: ");
        String userName = userInput.nextLine();
        System.out.println("Input your GPA: ");
        String userGrade = userInput.nextLine();
        computeDiscount(userName, Double.parseDouble(userGrade));
    }
    public static void computeDiscount(String name, double gpa)     {
        System.out.println(name+", your GPA is "+gpa+", so your credit is $"+gpa*10);
    }

}
