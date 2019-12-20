package tp_note_1;

import java.util.*;
public class Task5 {
public static void main(String[] args)
    {
        System.out.print("Program for converting money in Riels to Dollars.\n" );

        Scanner am = new Scanner(System.in);
        System.out.print("\t\tPlease input money in Riels: ");
        int amount = am.nextInt(); 

        double exchange = amount/4000;

        System.out.print(+amount+ " RIELs = "+exchange+ "USD");
    }
}