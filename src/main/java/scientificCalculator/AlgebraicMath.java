package scientificCalculator;
import java.math.*;
import java.util.Scanner;

import static scientificCalculator.Prompt.display;

public class AlgebraicMath {
    public static double sq(){
        display *= display;
        return display;
    }
    public static double sqr(){
        display = Math.sqrt(display);
        return display;
    }
    public static double inv(){
        display = (1/display);
        return display;
    }
}
