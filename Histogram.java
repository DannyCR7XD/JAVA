//Danny Castaneda SP21 Advanced Programming Language- JAVA Assignment #4
//Accepts input integer values from the standard input, each value is a number
//between 1 and 10. The input might contain any number of values separated by white-space. The
//user will indicate the end of the list by signaling EOF, can be signaled by hitting control-D


import java.util.Scanner;

public class Histogram {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int arr[]=new int[11];
                System.out.println("    Enter integers between 1 and 10, one per line, hit control-D when done: \n");
                
                while(sc.hasNextInt())
		{
                        arr[sc.nextInt()]++;
                }
		
                System.out.print("\n");
		
                for(int i=1;i<11;i++) 
		{
                        System.out.print(i+": ");
                        lineOfStars(arr[i]);
                }
        }

        
        private static void lineOfStars(int n) 
	{
                for(int i=0;i<n;i++)
                        System.out.print("*");
                System.out.println();
        }
}