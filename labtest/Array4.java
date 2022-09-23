// NAme=Viral Dangar
// To find duplicate elements and copy to another array.

import java.util.Scanner;

public class Array4 {

    void Duplicate(int[] a)   // Creating The Method To Store Duplicate
    {
        System.out.println("Duplicate Elements Are : ");
        for(int i=0;i<a.length;i++)      // finding the duplicate array
        {
            for(int j=i+1;j<a.length;j++)
            {
                if(a[i]==a[j])
                    System.out.print(a[i]+" ");
            }
        }
    }
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of Array : ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        Array4 a1=new Array4();
        System.out.println("Enter "+n+" elements of Array  : ");
        for(int i = 0; i<n; i++)
        {
            System.out.println("Enter value of "+i+" index : ");
            arr[i]=sc.nextInt();
        }
        System.out.println("Printing Array : ");
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+" ");
        }
        System.out.println("\n");
        a1.Duplicate(arr);
    }

}

