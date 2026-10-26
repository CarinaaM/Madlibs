import java.util.Scanner;

public class main {
  public static void main(String[] args) {
    // create scanner for user input
    Scanner sc = new Scanner(System.in);

    // create objects for each word type
    Nouns n = new Nouns();
    Verbs v = new Verbs();
    Adjectives a = new Adjectives();

    // get two nouns from the user
    String noun1 = n.getNouns(sc);
    String noun2 = n.getNouns(sc);

    // get two verbs from the user
    String verb1 = v.getVerbs(sc);
    String verb2 = v.getVerbs(sc);

    // get two adjectives from the user
    String adj1 = a.getAdjectives(sc);
    String adj2 = a.getAdjectives(sc);

    // print the story using the words
    printStory(noun1, noun2, verb1, verb2, adj1, adj2);
  }

  // method to print the completed story
  public static void printStory(String noun1, String noun2, String verb1, String verb2, String adj1, String adj2) {
    // print the first sentence
    System.out.println("The " + noun1 + " " + verb1 + " across the " + adj1 + " pond.");

    // print the second sentence
    System.out.println("I went to the zoo to see a " + noun2 + ". There were people " + verb2 + " around the enclosure which made the " + adj2 + " apes go bananas.");
  }
}
