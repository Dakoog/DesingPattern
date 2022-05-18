package designPattern.singleton;


import java.io.IOException;


public class RoundingMain {
    public static void main(String[] args) throws IOException {


        //Second singleton -> rounding numbers
        double a = 7.4;
        double b = 13.0;
        double quotient = a / b;
        System.out.println(a + " : " + b + " = "+ quotient);
        for (int i = 0; i < 3; i++) {
            System.out.print(a + " : " + b + " = ");
            if (i == 0)
                System.out.println(Rounding.decimal(quotient)+" -> rounding decimal");

            if (i == 1)
                System.out.println(Rounding.hundredths(quotient)+" -> rounding hundredths");
            if (i == 2)
                System.out.println(Rounding.thousandths(quotient)+" -> rounding thousandths");
        }


    }

}
