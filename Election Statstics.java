import java.util.Scanner;

public class electionStatistics{
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        
        String firstPartyName;
        String secondPartyName;
        String thirdPartyName;
        
        double firstPartyVotes;
        double secondPartyVotes;
        double thirdPartyVotes;
        double totalVotesPercent;
        
        System.out.println("Enter First Party Name >>");
        firstPartyName = userInput.nextLine();
        System.out.println("Enter Votes Received >>");
        firstPartyVotes = Double.parseDouble(userInput.nextLine());
        
        System.out.println("Enter Second Party Name >>");
        secondPartyName = userInput.nextLine();
        System.out.println("Enter Votes Received >>");
        secondPartyVotes = Double.parseDouble(userInput.nextLine());
        
        System.out.println("Enter Third Party Name >>");
        thirdPartyName = userInput.nextLine();
        System.out.println("Enter Votes Received >>");
        thirdPartyVotes = Double.parseDouble(userInput.nextLine());
        
        totalVotesPercent = (firstPartyVotes + secondPartyVotes + thirdPartyVotes)/100;
        System.out.println("The " + firstPartyName + " got "+ firstPartyVotes/totalVotesPercent + " percent of the vote");
        System.out.println("The " + secondPartyName + " got "+ secondPartyVotes/totalVotesPercent + " percent of the vote");
        System.out.println("The " + thirdPartyName + " got "+ thirdPartyVotes/totalVotesPercent + " percent of the vote");
        
        userInput.close();
    }
}
