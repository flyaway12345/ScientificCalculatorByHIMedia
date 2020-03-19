package scientificCalculator;

import java.util.Scanner;

import static scientificCalculator.Prompt.display;

public class Core {
    public static String state(String value){
         return value;

    }
    public static void clearScreen() {
        display = 0.0;
    }

    public static boolean numberCheck(String input){
        try
        {
            Integer.parseInt(input);
        }
        catch(NumberFormatException ex)
        {
            return false;
        }
        return true;
    }
    public static double swap(){
        if(display < 0){
            display = (display*-1);
        }else if(display > 0){
            display = (display*-1);
        }else if(display == 0){
            System.out.println("0 cannot be positive or negative");
        }else{
            System.out.println("Invalid Input");
        }

        return display;
    }

    /*public static void simpleMath(String input){
        String[] inputArray = input.trim().split(" ");
        String[] calc = new String[inputArray.length];
        for(int i = 0; i < inputArray.length; i++){
            if(numberCheck(inputArray[i])){
                calc[i].equals(inputArray[i]);
            }
            if(inputArray[i].equals("+")){

            }
        }
    }*/

}
