//Krushil Amrutiya
import java.util.Scanner; //imports the keyboard class
public class Main {
  public static void main(String[] args) {
    System.out.println("Pig Latin translator");
    
    Scanner keyboard = new Scanner(System.in);
    
  
    //for vovel
    System.out.print("Please enter a word that starts with a vowel: "); //print statement
    String word = keyboard.nextLine(); //stores the user input
    String vovel = word + ("way"); //adds way to the input
    System.out.println("The word that starts with a vowel: " + vovel); //prints the word translated in pig latin
    System.out.println('\n'); //prints new nextLine
    
    //for consonant
    System.out.print("Please enter a word that starts with a consonant then a vowel:"); //print statement
    String word1 = keyboard.nextLine(); //stores the user input
    String exceptFirstLetter = word1.substring(1); //removes the first character in the word
    System.out.println("The word that starts with a constant then a vovel: " + exceptFirstLetter + word1.charAt(0) + "ay"); //prints the word translated in pig latin
    System.out.println('\n'); //prints new nextLine

    //2 consonants
    System.out.print("Please enter a word that starts with 2 consonants: "); //print statement
    String twoConsonants = keyboard.nextLine(); //stores the user input
    String lastLetters = twoConsonants.substring(2); //removes the first two characters of the word
    String firstLetter = twoConsonants.substring(0,2); //gets the first two characters of the word
    System.out.println("The word that starts with 2 consonants: " + lastLetters + firstLetter + "ay"); //prints the word translated in pig latin

  }
}
