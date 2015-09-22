package io.github.melvincabatuan;

/**
 * Created by cobalt on 9/22/15.
 */
public class FamilyName {

    private String student1Name = "Ali Al-Ali";
    private String student2Name = "Ahmed Al-Ahmed";

    // Exchange the last name of the two students
    public void exchangeNames(){
        String firstElements[] = student1Name.split("\\s+");
        String secondElements[] = student2Name.split("\\s+");
        student1Name = new String(firstElements[0] + " " + secondElements[1]);
        student2Name = new String(secondElements[0] + " " + firstElements[1]);
    }

    public void printNames(){
        System.out.println("Student 1: " + student1Name);
        System.out.println("Student 2: " + student2Name);
    }
}
