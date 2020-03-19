package scientificCalculator;

import java.util.Scanner;

import static scientificCalculator.Prompt.display;

public class BasicMath
{
    public static double add(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to add");
        Double addToValue = scan.nextDouble();


        display += addToValue;
        return display;
    }
    public static double sub(){
    Scanner scan = new Scanner(System.in);
    System.out.println("What do you want to subtract");
    Double addToValue = scan.nextDouble();


    display -= addToValue;
    return display;
}
    public static double mul(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to multiply by");
        Double addToValue = scan.nextDouble();


        display *= addToValue;
        return display;
    }
    public static double div(){
        Scanner scan = new Scanner(System.in);
        System.out.println("What do you want to divide by");
        Double addToValue = scan.nextDouble();

        if(addToValue != 0 && display != 0) {
            display /= addToValue;

        }else{
            System.out.println("Invalid Input: Cannot Divide by zero");
        }
        return display;

    }
    }

