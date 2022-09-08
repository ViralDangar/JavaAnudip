//Name=Viral Raja Dangar
//batch=C2533
import java.util.Scanner;


public class Student {
    public static void main(String[] args) {
        int id,attendece; //initializing variable that is integer
        String sname; // initializing variable that is string
        Scanner sc=new Scanner(System.in); // scanner is pre defind method that takes input from the user sc is a object
        System.out.print("Enter name of the student: "); // print statement for understanding to user input
        sname=sc.next();                       //  This is take the input that has string datatype
        System.out.print("Enter id of the student: ");// print statement for understanding to user input
        id=sc.nextInt();     //This is take the input that has int datatype
        System.out.print("Enter attendence of the student: "); // print statement for understanding to user input
        attendece=sc.nextInt();     // This is take the input that has int datatype
        System.out.println("Name of the student is: "+sname); // print statement that shows the output + is concat symbol that call the value of that variable
        System.out.println("Id of the student: "+id);
        System.out.println("Attendece of the student is : "+attendece);
    }
}
