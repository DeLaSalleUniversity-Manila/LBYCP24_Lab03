package io.github.melvincabatuan;

/**
 * Swap the first letter with the last letter of a name
 * Created by cobalt on 9/22/15.
 */
public class Swap {

    private String name = "ali al-ali";

    // swap the first letter with the last letter of a name
    public void swapFirstLast(){
        int length = name.length();
        name = new String("" + name.charAt(length-1) + name.substring(1,length-1) + name.charAt(0));
    }

    public void printName(){
        System.out.println("Name: " + name);
    }
}
