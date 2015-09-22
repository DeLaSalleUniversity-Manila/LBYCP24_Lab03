package io.github.melvincabatuan;

/**
 * Remove the 1st three occurrences of the character "m" (capital or small)
 * Created by cobalt on 9/21/15.
 */
public class CharRemover {

    private String message = "I'm a JaVa PrOgRaMmEr - Melvin";
    private String newMessage;

    public void remove3M(){
        String temp = new String(message);
        int count = 0;

        for(int i = 0; i < message.length(); ++i){
            if(count < 3 && (message.charAt(i) == 'm' || message.charAt(i) == 'M')){
                // System.out.println(message.charAt(i));                     // Debugging read 'm'
                // System.out.println("temp.length() = " + temp.length());
                temp = new String(deleteChar(temp, i-count)); // - count is used because the length is decreasing
                ++count;
            }
        }
        newMessage = temp;
    }


    private static String deleteChar(String src, int index) {
        return src.substring(0, index) + src.substring(index+1);

    }


    public void printResult(){
        System.out.println("Given                 : " + message);
        System.out.println("After removing 3 m's  : " + newMessage);
    }
}
