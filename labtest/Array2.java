// Name=Viral Dangar
//wrp To input 5 subject marks for 5 students and calculate total,avg,result using arrays

import java.util.Scanner;

public class Array2 {
    void input()
    {
        double[][] marks=new double[5][5];
        Scanner sc=new Scanner(System.in);
        double Sum=0;
        double Avg=1;
        int Count=0;
        int n; // n is for number of student that you have to take as a input
        System.out.println("How Many Student: ");
        n=sc.nextInt();
        System.out.println("Enter Marks of the Students");       // Take the input from thr user
        for(int i=0;i<n;i++)
        {
            System.out.println("Enter Marks of Student "+i);
            for(int j=0;j<n;j++)
            {
                System.out.print("Enter the Marks for Subject "+j+":");    // TAke the marks of Each subject
                marks[i][j]=sc.nextInt();
            }
        }

        System.out.println("Printing Student Marks");
        for(int i=0;i<n;i++)
        {
            System.out.println("Marks of Student "+i+"\n");
            for(int j=0;j<n;j++)
            {
                System.out.println(" Marks for Subject "+j+" : "+marks[i][j]);
            }
        }

        System.out.println("\n Printing Total Marks of Students.. : \n");  // Finding the Total Marks and Average of Each student
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                Sum=Sum+marks[i][j];
            }
            System.out.println("\nSum of Total marks of Student "+i+" is : "+Sum);
            Avg=Sum/5;
            System.out.println("Avarage of Total marks of Student "+i+" is : "+Avg);
            Sum=0;
        }

        System.out.println("\n Printing Result of Students...... : \n");
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(marks[i][j]>=40)
                    Count++;
                else
                {
                    System.out.print("");
                }
            }
            if(Count==n)
                System.out.println("Student "+i+" is Pass...!!!!!");   // Checking the result of the student if pass
            else
                System.out.println("Student "+i+" is Fail...!!!!!");   // Checking the result of the student if Fail
            Count=0;
        }

    }


    public static void main(String[] args)
    {
        Array2 c = new Array2();  // calling the method that is inside the Array2 class
        c.input();

    }
}
