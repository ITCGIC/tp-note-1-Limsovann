package tp_note_1;

import java.util.*;
public class Task4 {
public static void main(String[] args)
    {
        System.out.print("Program for calculating cost of a call.\n" );
        
        //Start Hour
        Scanner hr1 = new Scanner(System.in);
        System.out.print("\t\tPlease input start hours: ");
        int hour1 = hr1.nextInt(); 
        //Start Minute
        Scanner mn1 = new Scanner(System.in);
        System.out.print("\t\tPlease input start minutes: ");
        int minute1 = mn1.nextInt();
        //Start Second
        Scanner sc1 = new Scanner(System.in);
        System.out.print("\t\tPlease input start seconds: ");
        int second1 = sc1.nextInt();

        //End Hour
        Scanner hr2 = new Scanner(System.in);
        System.out.print("\t\tPlease input start hours: ");
        int hour2 = hr2.nextInt(); 
        //End Minute
        Scanner mn2 = new Scanner(System.in);
        System.out.print("\t\tPlease input start minutes: ");
        int minute2 = mn2.nextInt();
        //End Second
        Scanner sc2 = new Scanner(System.in);
        System.out.print("\t\tPlease input start seconds: ");
        int second2 = sc2.nextInt();

        //Calculation
        int s1 = hour1 * 3600;
        int s2 = minute1 * 60;
        int s3 = second1;
        int start = s1 + s2 + s3 ;

        int e1 = hour2 * 3600;
        int e2 = minute2 * 60;
        int e3 = second2;
        int end = e1 + e2 + e3 ;

        int talk = end - start ;
        int m1 = talk % 60;
        int m2 = talk / 60;
        int m3 = m2 % 60;
        m2 = m2 / 60;

        int cost1 = m3 * 0.05;
        int cost2 = (m1/60) * 0.05;
        int cost = cost1 + cost2;

        //Display result
        System.out.print("---------------------------------------------------------------\n");
        System.out.print("\t\tTotal call duration: "+m2+"h" +m3 +"mn"+m1 +"s");
        System.out.print("\n Total cost of this call:" + cost+);
        
    }
}