import java.util.Scanner;

public class Verbs {
    //Creates verb class that we can call in main file 
    public String getVerbs(Scanner sc){

        //Allows user to input 
        System.out.print("Enter a verb: ");
        String verbOne = sc.nextLine();
        //Scanner is closed in Runner after all input is collected
        return verbOne;
    }
}
