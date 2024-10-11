//Write a Java method to compute the average of three numbers.

import java.util.Scanner;
public class method2
 {
  public static void main(String args[])
   {
     double a , b, c, d, e, avg;
     Scanner input = new Scanner(System.in);
     System.out.print("Enter A value : ");
     a=input.nextDouble();
     System.out.print("Enter B value : ");
     b=input.nextDouble();
     System.out.print("Enter C value : ");
     c=input.nextDouble();
     System.out.print("Enterr D value : ");
     d=input.nextDouble();
     System.out.print("Enter E value : ");
     e=input.nextDouble();
     System.out.print("The Average value of five number is : "+average(a,b,c,d,e));
   }
  public static double average( double a,double b, double c, double d , double e)
   { 
    return(a+b+c+d+e )/5;
   }
 }





















