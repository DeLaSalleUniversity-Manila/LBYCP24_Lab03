package io.github.melvincabatuan;

/**
 * Search and replace string
 * Created by cobalt on 9/22/15.
 */
public class Replace {

    private String message = "This is ICS102 Lab";


    public void findReplace(){
        message = message.replaceAll("ICS102","COE-200");
    }

    public void printMessage(){
        System.out.println("message = " + message);
    }

}
