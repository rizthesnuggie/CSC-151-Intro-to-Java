/*
Write an application that prompts the user for a password that contains at least two uppercase letters, at least three lowercase letters, and at least one digit. Continuously reprompt the user until a valid password is entered. Display Valid password if the password is valid; if not, display the appropriate reason(s) the password is not valid as follows:

"The password did not have enough of the following:
uppercase letters
lowercase letters
digits"
*/


import java.util.*;
public class ValidatePassword {
    public static void main(String[] args) {

        boolean passwordIsValid = false;
        Scanner userInput = new Scanner(System.in);
        
        //Most examples of this online to not mention continous reprompts. Programming Exercise 7-4 does so this must be taken into account
        while(!passwordIsValid){

            //Parameters a for valid password
            int uppercaseLetters = 0;
            int lowercaseLetters = 0;
            int digits = 0;

            //Collects user's password
            System.out.println("Please input a password: ");
            String password = userInput.nextLine();
            
            //Check inputed password for uppercase letters, lowercase letters, and digits 
            for(int i = 0; i < password.length(); i++){
                if(Character.isUpperCase(password.charAt(i))){
                    uppercaseLetters++;
                }
                else if(Character.isLowerCase(password.charAt(i))){
                    lowercaseLetters++;
                }
                else if(Character.isDigit(password.charAt(i))){
                    digits++;
                }
                else{
                    break;
                }
            }

            //If the password meets requirments then break loop
            if((uppercaseLetters >= 2) && (lowercaseLetters >= 3) && (digits >= 1)){;
                passwordIsValid = true;
            }
            //Will display issues in password and loop function
            else{
                System.out.println("The password did not have enough of the following:");
                if(uppercaseLetters <2){
                    System.out.println("uppercase letters");
                }
                if(lowercaseLetters <3){
                    System.out.println("lowercase letters");
                }
                if(digits < 1){
                    System.out.println("digits");
                }
            }
        } 
    //Can only be displayed by a valid password breaking the loop
    System.out.println("Valid Password");
    }
}
