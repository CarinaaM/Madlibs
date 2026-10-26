import java.util.Scanner;

public class Adjectives {
    public String getAdjectives(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter adjective: ");
        String adjective1 = sc.nextLine();
        sc.close();
        return adjective1;
    }
}
