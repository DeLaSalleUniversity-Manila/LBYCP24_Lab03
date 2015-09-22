package io.github.melvincabatuan;

/**
 * Created by cobalt on 9/22/15.
 */
public class Sum {

    private String name = "Java";
    private int sum;

    public void addASCII() {
        sum = 0;

        for (int i = 0; i < name.length(); ++i) {
            char c = name.charAt(i);
            sum = sum + (int) c;
        }
    }

    public void printSum(){
        System.out.println("The ASCII sum of 'Java' is " + sum);
    }
}
