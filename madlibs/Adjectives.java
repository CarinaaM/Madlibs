import java.util.Scanner;

public class Adjectives {
    //Asks the user for an adjective and returns it
    //The Scanner is passed in from main so one Scanner is shared by all classes
    public String getAdjectives(Scanner sc){
        //Prompt the user
        System.out.print("Enter adjective: ");

        //Read the whole line the user types and store it
        String adjective1 = sc.nextLine();

        //Send the adjective back to main
        return adjective1;
    }
}
