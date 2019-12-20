package tp_note_1;

import java.util.*;
public class Task3 {
public static void main(String[] args)
    {
        System.out.print("Program for converting time to seconds.\n" );
        
        //Hour
        Scanner hr = new Scanner(System.in);
        System.out.print("\t\tPlease input hours: ");
        int hours = hr.nextInt(); 
        //Minute
        Scanner mn = new Scanner(System.in);
        System.out.print("\t\tPlease input minutes: ");
        int minutes = mn.nextInt();
        //Second
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tPlease input seconds: ");
        int seconds = sc.nextInt();
        //Calculation
        int m1 = hours * 3600;
        int m2 = minutes * 60;
        int m3 = seconds;
        int total = m1 + m2 + m3;
        //Display result
        System.out.print("---------------------------------------------------------------\n");
        System.out.print( "\t\tNumber of seconds = "+ hours +"x3600 + "+ seconds + "x60 + " + seconds + " = " + total);
        System.out.print("\n");
    }
}