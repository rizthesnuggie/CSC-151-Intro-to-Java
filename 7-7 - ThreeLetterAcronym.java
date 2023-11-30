import java.util.*;
public class ThreeLetterAcronym {
    public static void main(String[] args) {

        //Takes user input
        Scanner userInput = new Scanner(System.in);
        String firstAcronym = userInput.nextLine();

        //Will be the final 3 letter acronyn
        String finalAcronym = "";

        for(int i = 0; i<firstAcronym.length(); i++){
            //Makes sure the first letter is added, feel's like ther should be a better way to do this 
            if(i == 0){
                //I can't prove the exsistence of string.Append() in java
                finalAcronym += firstAcronym.charAt(i);
            }
            else{
                //Checks if there is whitespace
                if(Character.isWhitespace(firstAcronym.charAt(i))){
                    //Appends the letter after the whitespace
                    finalAcronym += firstAcronym.charAt(i+1);
                }
            }
        }
        //System wants it uppercase, idc
        System.out.println(finalAcronym.toUpperCase());
    }
}
