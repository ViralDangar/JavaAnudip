// name=Viral Dangar
//   count the number that how many times occured in array
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n;                  // n is for index value
        int Element;   // Take A Element
        int cnt=0;   // Counting the elemet
        System.out.println("Enter the Array index Value: "); // TAke the Index VAlue from The user
        n=sc.nextInt();
        int[] a=new int[n];     // Array with n input
        System.out.println("Enter Array:  ");
        for(int i=0;i<=n-1;i++)//reading
        {
            a[i]=sc.nextInt();
        }
        System.out.println("Enter Element That You Have to Count:");
        Element=sc.nextInt();
        for(int i=0;i<=n-1;i++)
        {
            if(a[i]==Element)
            {
                cnt++;
            }
        }
        System.out.println(cnt+" Times Occured ");
    }
}
