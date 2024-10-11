// Write a Java method to find the smallest number among three numbers.

import java.util.Scanner;
public class method1
 {
   public static void main(String args[])
      {
       double a,b,c;
       Scanner input = new Scanner(System.in);
       System.out.print("Enter A Input : ");
       a=input.nextDouble();
       System.out.print("Enter B Input : ");
       b=input.nextDouble();
       System.out.print("Enter C Input : ");
       c=input.nextDouble();
       System.out.print(" The Smallest number is : " +smallval(a,b,c));
      }
   public static double smallval(double a, double b, double c)
      {
        return Math.min(Math.min(a,b),c)   ;
      }
 }