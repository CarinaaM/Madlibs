import java.util.Scanner;

public class Nouns {
    public String getNouns(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter noun: ");
        String noun1 = sc.nextLine();
        System.out.print("Enter noun: ");
        String noun2 = sc.nextLine();
        sc.close();
        return noun1 + "" + noun2;
    }
    
}
