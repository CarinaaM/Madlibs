import java.util.Scanner;

public class Verbs {
    public String getVerbs(){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a verb: ");
        String verbOne = sc.nextLine();

        System.out.print("Enter another verb!: ");
        String verbTwo = sc.nextLine();

        sc.close();
        return verbOne + "" + verbTwo;
    }
}
