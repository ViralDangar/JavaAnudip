// Name-Viral Dangar
// Batch-C2533
// Find Largest of Three Numbers
import java.util.Scanner;


public class Largest {
    public static void main(String[] args) {
        int fn,sn,tn;                   //fn=first Number,sn=Second Number,tn= Third Number

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Three Numbers:  "); //Take A Input from User
        fn=sc.nextInt();                       //1st number Input
        sn=sc.nextInt();                       //2nd number input
        tn=sc.nextInt();                       //3rd Number input
           if(fn>sn && fn>tn) {                //first Number is grater than second Number and first number is grater than Third
             System.out.println(fn+" is Largest Number that is First Number");  //First Number is Printed
        }
            else if(sn>tn){                            //if above is false than these if statment is execute
            System.out.println(sn+" is Largest Number that is Second Number");// second Number is printed
        }
            else
        {
            System.out.println(tn+" is Largest Number that is Third Number"); // if above two statement is false than third number is printed
        }

    }
}
