// Danny Castaneda
// Java Assignment #1: will prompt the user for a purchase amount. If this bill
// amount is valid, then prompt the user again for the payment amount. If this is valid
// then compute the change to be returned. This amount should be displayed in pennies,
// nickels, dimes, quarters, single dollar bills, five-dollar bills, ten-dollar bills, and 20
// dollar bills. If either of the input values are invalid, an error message should be
// displayed explaining precisely where the error is.


import java.util.Scanner;
public class change

{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("This program will compute the proper change from a purchase.\n");
        System.out.print("Please enter the purchase amount: $"); // requests input for purchase amount
        double purchase = sc.nextDouble();
       
	if(purchase > 0) // Purchase amount must be positive before displaying change 
        {
            System.out.print("Please enter the payment amount: $"); // requests input for payment amount
            double payment = sc.nextDouble(); 
            if(purchase > payment) // if purchase amount is greater than payment amount
            {
                System.out.print("The payment amount has an ERROR!! \n Payment amount must be greater than or equal to the purchase amount!\n"); // must represent legitimate payment was made, no negatives.
            }
           
	    else
            {
                double remainder = payment - purchase; // amount due in double to represent percentage per the dollar
                
		double ten = remainder / 10; 
                remainder = remainder - (int)ten * 10; // change the remaining amount
                remainder = Math.round(remainder * 100.0) / 100.0; // rounding to two decimal places
                
		double five = remainder / 5;
                remainder = remainder - (int)five * 5;
                remainder = Math.round(remainder * 100.0) / 100.0;
                
		double one = remainder / 1;
                remainder = remainder - (int)one;
                remainder = Math.round(remainder * 100.0) / 100.0;
                
		double quarter = remainder / 0.25;
                remainder = remainder - (int)quarter * 0.25;
                remainder = Math.round(remainder * 100.0) / 100.0;
                
		double dime = remainder / 0.10;
                remainder = remainder - (int)dime * 0.10;
                remainder = Math.round(remainder * 100.0) / 100.0;
                
		double nickel = remainder / 0.05;
                remainder = remainder - (int)nickel * 0.05;
                remainder = Math.round(remainder * 100.0) / 100.0;
                
		double penny = remainder / 0.01;

                System.out.println("The change is: \n"); // displays output to user
                System.out.printf("  %d TEN(S)\n", (int)ten);
                System.out.printf("  %d FIVE(S)\n", (int)five);
                System.out.printf("  %d ONE(S)\n", (int)one);
                System.out.printf("  %d QUARTER(S)\n", (int)quarter); // representing dollar bills and coin quantity
                System.out.printf("  %d DIME(S)\n", (int)dime);
                System.out.printf("  %d NICKEL(S)\n", (int)nickel);
                System.out.printf("  %d PENNY(S)\n", (int)penny);
            }
        }

        else
        {
            System.out.print("The purchase amount has an ERROR!! \n The purchase amount must be at least One cent. \n"); // negative purchase not possible, neither free is.
        }
    }
}