import java.util.Scanner;

// name-Viral Dangar
// student input outpt with indiviual method
class Student{
    Scanner sc=new Scanner(System.in);
    String sname,clgname;
    int srollno;
    void input(){
        System.out.print("Enter Student Name: ");
        sname=sc.next();
        System.out.print("Enter Student Roll number: ");
        srollno=sc.nextInt();  // user input
        System.out.print("Enter College name : ");
        clgname= sc.next();// enter collegename without college prefix
    }
    void output() {
        System.out.println("hello "+sname+"\n Your Roll number is"+srollno+" \n Welcome to "+clgname+" College");
    }
}
public class StudentIO {
    public static void main(String[] args) {
        Student s=new Student();
        s.input();
        s.output();
    }

}
