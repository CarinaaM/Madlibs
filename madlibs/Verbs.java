import java.util.Scanner;

public class Verbs {
    //Creates verb class that we can call in main file 
    public String getVerbs(Scanner sc){

        //Allows user to input 
        System.out.print("Enter a verb: ");
        String verbOne = sc.nextLine();

        sc.close();
        //Closes scanner system
        return verbOne;
    }
}
