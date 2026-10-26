import java.util.Scanner;

public class Nouns {
    public String getNouns(){
        //new scanner object
        Scanner sc = new Scanner(System.in);
        
        //ask for user input
        System.out.print("Enter noun: ");

        //read and store input
        String noun1 = sc.nextLine();

        return noun1;
    }
    
}
