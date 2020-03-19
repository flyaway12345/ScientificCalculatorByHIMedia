package scientificCalculator;

import java.util.Scanner;



public class Prompt {
    public String input;
    public static double display = 10.0; ///st to 0 before shipping
    public static void startPrompt(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Input Command (type -help for command list)");
        System.out.println(display);
        String input = scan.nextLine();

            switch (input) {
                case "-help":
                    System.out.println("Note: In current Build all "+
                            "commands are Case Sensitive" +
                            "\n-clear: clears screen" +
                            "\n-mhelp: displays math commands" +
                            "\n-set: sets the current displayed number" +
                            " to an inputted value" +
                            "\n -swap: swap the display value between"+
                            " positive and negative");
                    break;
                case "-mhelp":
                    System.out.println("Note: In current Build all "+
                            "commands are Case Sensitive" +
                            "\n-add: add a number to current displayed value" +
                            "\n-sub: subtract a number from current displayed value" +
                            "\n-mul: multiply a number by current displayed value"+
                            "\n-div: divide current displayed value by a number" +
                            "\n-sq: square the displayed value" +
                            "\n-sqr:take the square root of the displayed value");
                    break;
                    //Core
                case "-clear":
                    Core.clearScreen();
                    break;
                case "-swap" :///turn from negative to posivitve
                    System.out.println(Core.swap());
                    break;
                    ///Basic Math
                case "-add" :
                    System.out.println(BasicMath.add());
                    break;
                case "-sub" :
                    System.out.println(BasicMath.sub());
                    break;
                case "-mul" :
                    System.out.println(BasicMath.mul());
                    break;
                case "-div" :
                    System.out.println(BasicMath.div());
                    break;
                case "-inv" :
                    System.out.println(AlgebraicMath.inv());
                    break;
                case "-set" :
                    System.out.println("Input New Display Value");
                    display = scan.nextDouble();
                    break;
                default:
                    System.out.println("Invalid Input, Are you writing a command?"+
                            " try putting a \"-\" before your input");
            }
        startPrompt();
        }

    }

