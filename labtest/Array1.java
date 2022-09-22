// Name=Viral Dangar
// Batch=C2533
//1)to make menu driven using 2d-arrays
//        a)addition
//        b)multiplication
//        c)transpose
import java.util.Scanner;
class Array1
{
    void add(int[][] Mat1,int[][] Mat2) //Addtion Function   // Mat1 is Matrix 1 and Mat2 is Matrix 2
    {
        int [][] c=new int[2][2];
        System.out.println("Addtion of Two Matrix :");
        for(int i=0;i<Mat1.length;i++)
        {
            for(int j=0;j<Mat2.length;j++)
            {
                c[i][j]=Mat1[i][j]+Mat2[i][j];
            }
        }
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }

    void transpose(int[][] Mat1,int[][] Mat2)
    {
        Scanner sc=new Scanner(System.in);
        int[][] c=new int[2][2];
        int ch;
        System.out.println("Enter your choice for Transponse of Matrix (1 or 2 Any one):");
        ch=sc.nextInt();
        if(ch==1)
        {
            for(int i=0;i<Mat1.length;i++)
            {
                for(int j=0;j<Mat1.length;j++)
                {
                    c[i][j]=Mat1[j][i];
                }
            }
        }
        else
        {
            for(int i=0;i<Mat2.length;i++)
            {
                for(int j=0;j< Mat2.length;j++)
                {
                    c[i][j]=Mat2[j][i];
                }
            }
        }

        System.out.println("Transpose of Matrix : ");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }


    void multi(int[][] Mat1,int[][] Mat2)   // Multiplication of Array
    {

        int[][] c=new int[2][2];
        if(Mat1.length==Mat2.length)
        {
            for(int i=0;i<2;i++)
            {
                for(int j=0;j<2;j++)
                {
                    for(int k=0;k<2;k++)
                    {
                        c[i][j]+=Mat1[i][k]*Mat2[k][j];
                    }
                }
            }
        }
        else
        {
            System.out.println("Multiplication of Array is not possible .");
        }
        System.out.println("Multiply of Martixes : ");
        for(int i=0;i<c.length;i++)
        {
            for(int j=0;j<c.length;j++)
            {
                System.out.print(" "+c[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[] args)
    {
        Array1 c=new Array1();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter  First array  "); // First Array
        int[][] Mat1=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter value ");
                Mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your first array: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(" "+Mat1[i][j]);
            }
            System.out.println();
        }
        System.out.println("Enter Second Array: "); // Second Array
        int[][] Mat2=new int[2][2];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("Enter value ");
                Mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("Your Second array: ");
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print(" "+Mat2[i][j]);
            }
            System.out.println();
        }
        int choice;            // we take a input as a choice because we want to choose only one option from following
        System.out.println("1. Addtion of Matrix .");
        System.out.println("2. Transpose of Matrix .");
        System.out.println("3.  Multiply  of Matrix .");
        System.out.println("Enter  Your Choice: ");
        choice=sc.nextInt();
        switch(choice)
        {
            case 1:        // this choice call an addition Method
                c.add(Mat1,Mat2);//Calling the Method
                break;
            case 2:       // this choice call an transpose method
                c.transpose(Mat1,Mat2); // Calling the method
                break;
            case 3:       // this choice call an Multiplication method
                c.multi(Mat1,Mat2); // calling the method
                break;
            default:     // if choice is not correct then this statement was printed
                System.out.println("Please Enter Correct Choice.....");
                break;
        }
    }
}