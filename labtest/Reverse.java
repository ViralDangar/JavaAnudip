// Name=viral Dangar
// Batch=C2533
// Find the Reverse of the number

import java.util.Scanner;


public class Reverse {
    public static void main(String[] args) {
                int number, reverse = 0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Number that you want to find reverse: "); // Take a input From The User
        number=sc.nextInt();
                while(number != 0)
                {
                    int remainder = number % 10;         //example number=123 then remainder = 3
                    reverse = reverse * 10 + remainder;   // reverse=0*10+3=3
                    number = number/10;                  //number=123/10=12 then these goes again in while loop and follow same step until number is not zero
                }
                System.out.println("The reverse of the given number is: " + reverse);
            }
        }

