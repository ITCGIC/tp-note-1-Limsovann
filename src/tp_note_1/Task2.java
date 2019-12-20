package tp_note_1;

import java.util.*;
 public class Task2 {
 public static void main(String[] args)
    {
        System.out.print("```\n");
        System.out.print("Program for converting second into formated H:M:S\n" );
        Scanner sc = new Scanner(System.in);
        System.out.print("\t\tInput number of seconds: ");
		int seconds = sc.nextInt(); 
        int m1 = seconds % 60;
        int m2 = seconds / 60;
        int m3 = m2 % 60;
        m2 = m2 / 60;
        System.out.print( "\t\tTime corresponding to "+ seconds +"seconds is "+ m2 + ":" + m3 + ":" + m1);
        System.out.print("\n```");
    }    
 }