package io.github.melvincabatuan;

/**
 * Generates a password for a student using his initials and age
 * Created by cobalt on 9/22/15.
 */
public class PasswordMaker2 {

    private String firstName = "Melvin";
    private String middleName = "Kong";
    private String lastName = "Cabatuan";
    private String initials;
    private String password;

    private int age = 20;

    // Using initials and age * 100
    public void makePassword1(){

            initials = firstName.substring(0,1) +
                    middleName.substring(0,1) +
                    lastName.substring(0,1);

            password = initials.toLowerCase() + age;

            System.out.println("Your Weak Password 1 is " + password);
    }

    // Using middle char and age * 100
    public void makePassword2(){

        initials = firstName.substring(firstName.length()/2,firstName.length()/2 + 1) +
                middleName.substring(middleName.length()/2, middleName.length()/2 + 1) +
                lastName.substring(lastName.length()/2, lastName.length()/2 + 1);

        password = initials.toLowerCase() + 100*age;

        System.out.println("Your Weak Password 2 is " + password);
    }

    // Using middle char - 1 and age * 100
    public void makePassword3(){

        initials = firstName.substring(firstName.length()/2  - 1,firstName.length()/2) +
                middleName.substring(middleName.length()/2  - 1, middleName.length()/2 ) +
                lastName.substring(lastName.length()/2  - 1, lastName.length()/2 );

        password = initials.toLowerCase() + 100*age;

        System.out.println("Your Weak Password 3 is " + password);
    }
}