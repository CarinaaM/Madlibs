import java.util.Scanner;

public class Adjectives {
    public String getAdjectives(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter adjective: ");
        String adjective1 = sc.nextLine();
        System.out.print("Enter noun: ");
        String adjective2 = sc.nextLine();
        sc.close();
        return adjective1 + "" + adjective2;
    }
}
