public class main{
  public static void main(String[] args){
    Nouns n = new Nouns();
    Verbs v = new Verbs();
    Adjectives a = new Adjectives();

    String noun1 = n.getNouns();
    String noun2 = n.getNouns();
    String verb1 = n.getNouns();
    String verb2 = n.getNouns();
    String adj1 = n.getNouns();
    String adj2 = n.getNouns();

    public static void printStory(String noun1, String noun2, String verb1, String verb2, String adj1, String adj2){
      System.out.println("The " + noun1 + " " + verb1 + " across the " + adj1 + " pond.");
      System.out.println("I went to the zoo to see a " + noun2 + ". There were people " + verb2 + " around the enclosure which made the " + adj2 + " apes go bananas.");
    }

    printStory(noun1, noun2, verb1, verb2, adj1, adj2);
  }




}
