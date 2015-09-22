package io.github.melvincabatuan;

import java.util.Scanner;

public class Main {

    private static int choice;

    public static void main(String[] args) {

        // Main menu
        for(;;) {

            // Display menu and get selection
            getSelection();

            if (choice == 1) {
                StringWelcome welcome = new StringWelcome();
                welcome.toCapital();
                welcome.toLower();
                welcome.getLength();
                welcome.getIndex("Course");
            }

            else if (choice == 2){
                PasswordMaker2 passwordmaker2 = new PasswordMaker2();
                passwordmaker2.makePassword1();
                passwordmaker2.makePassword2();
                passwordmaker2.makePassword3();
            }

            else if (choice == 3){
                CourseSplitter coursesplitter = new CourseSplitter();
                coursesplitter.splitCourse1();
                coursesplitter.printResult();
                coursesplitter.splitCourse2();
                coursesplitter.printResult();
            }

            else if (choice == 4){
                CharRemover charremover = new CharRemover();
                charremover.remove3M();
                charremover.printResult();
            }

            else if (choice == 5){
                FamilyName familyname = new FamilyName();
                System.out.println("Given names:");
                familyname.printNames();
                familyname.exchangeNames();
                System.out.println("New names  :");
                familyname.printNames();
            }

            else if (choice == 6){
                Swap swap = new Swap();
                swap.printName();
                swap.swapFirstLast();
                swap.printName();
            }

            else if (choice == 7){
                Replace replace = new Replace();
                System.out.println("Old message:");
                replace.printMessage();
                replace.findReplace();
                System.out.println("New message:");
                replace.printMessage();
            }

            else if (choice == 8){
                Sum sum = new Sum();
                sum.addASCII();
                sum.printSum();
            }

            else if (choice == 99){
                System.out.println("Exiting now...");
                break;
            }

            else {
                System.out.println("Invalid input! Please try again or Enter 99 to exit.");
            }

        }// ENDFOR MENU

    }// END MAIN


    public static void getSelection(){

        Scanner keyboard = new Scanner(System.in);

        System.out.println("================================================================");
        System.out.println("                     Main Menu                                  ");
        System.out.println("================================================================");
        System.out.println("   1. StringWelcome.java  ");
        System.out.println("   2. PasswordMaker2.java  ");
        System.out.println("   3. CourseSpliter.java ");
        System.out.println("   4. CharRemover.java ");
        System.out.println("   5. FamilyName.java ");
        System.out.println("   6. Swap.java ");
        System.out.println("   7. Replace.java ");
        System.out.println("   8. Sum.java ");
        System.out.println("   99. Exit ");
        System.out.println("================================================================");
        System.out.print("   >> ");

        choice = keyboard.nextInt(); // get the selected option
    }
}
