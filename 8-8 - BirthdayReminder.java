import java.util.*;
public class BirthdayReminder {
    public static void main(String[] args) {

        //Setup Scanner
        Scanner userInput = new Scanner(System.in);

        //Variable Setup
        String inputedName = "";
        String inputedBirthday = "";
        String escapeValue = "ZZZ";
        int maxNames = 10;
        //String Dictionary cause fuck
        Map<String,String> userInputedValues = new Hashtable<>();

        //Main information input loop
        while(true){
            if(userInputedValues.size() <10){
            System.out.println("Enter a Name or ZZZ to quit");
            inputedName = userInput.nextLine();
            //Checks for escape value(ZZZ)
            if(inputedName.equalsIgnoreCase(escapeValue)){
                break;
                }
            System.out.println("Enter birthdate with slahses between the month, day, and year");
            inputedBirthday = userInput.nextLine();
             userInputedValues.put(inputedName,inputedBirthday);
            }
            else{
                break;
            }
            }

        System.out.println("Count of names entered: "+ userInputedValues.size());
        
        //Prints name
        Set<String> keys = userInputedValues.keySet();
        for (String key : keys) {
            // Access the value associated with the current key
            String value = userInputedValues.get(key);
         System.out.println(key);
        }

        while(true){
            System.out.println("Enter a name to search for");
            inputedName = userInput.nextLine();
            if(inputedName.equalsIgnoreCase(escapeValue)){
                break;
            }
            if(userInputedValues.containsKey(inputedName)){
                System.out.println(userInputedValues.get(inputedName));
            }
            else{
                System.out.println("Sorry, no entry for "+inputedName);
            }
        }
        
    }
}
