package io.github.melvincabatuan;

/**
 * Created by cobalt on 9/21/15.
 */
public class StringWelcome {

    private String message = "Welcome! This is \"LBYCP24\" Course";

    // Convert all alphabets to capital letters and print out the result;
    public void toCapital(){
        System.out.println("\nGiven: " + message);
        System.out.println(message.toUpperCase());
    }

    // Convert all alphabets to lower-case letters and print out the result;
    public void toLower(){
        System.out.println("Given: " + message);
        System.out.println(message.toLowerCase());
    }

    // Print out the length of the string.
    public void getLength(){
        System.out.println("The length of the message is " + message.length());
    }

    // Print out the index of the word Course.
    public void getIndex(String fragment){
        System.out.println("The index of the word \"Course\" is " + message.indexOf(fragment));
        System.out.println(" ");
    }
}
