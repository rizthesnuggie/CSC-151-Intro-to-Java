/*Implement the EvenOdd application that asks a user to enter an integer. Display a statement that indicates whether the integer is even or odd.

An example of the program is shown below:

Enter a number >> 372
372 is even
*/

import java.util.Scanner;
class EvenOdd {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter a Number");
        int inputNumber = userInput.nextInt();
        if(isEven(inputNumber)){
            System.out.println(inputNumber+" is even");
        }
        else{
            System.out.println(inputNumber+" is odd");
        }
    }
    public static boolean isEven(int number) {
        if(number%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
}
