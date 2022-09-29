// name=viral Dangar
// bankcustomer
import java.util.Scanner;

class BankCustomer {
    int accno;
    String acctype;
    double amt;

   public BankCustomer(int x){// constructor with int datatype
          accno=x;
        System.out.println("Account number is:"+x);
    }
    BankCustomer(String y){              // constructor with String datatype
        acctype=y;
        System.out.println( " Account type is: "+y);
    }
    BankCustomer(double z){                  //constructor with Double datatype
        amt=z;
        System.out.println("Amount is: "+z);


    }


    }

public class Bank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Take a user input
        int accno;    // account number
        String acctype;   // account type
        double amt;   // balance
        System.out.print("Enter the Account number: ");
        accno = sc.nextInt();    // Account number take from the user
        System.out.print("Enter Type of the Account: ");
        acctype = sc.next();      // Account Type take from the user
        System.out.print("Enter the Balance of Your Account: " );
        amt = sc.nextDouble();    // Account Balance take from the user
        BankCustomer B = new BankCustomer(accno);       //calling Constructor With respect to there Datatype int
        BankCustomer B1 = new BankCustomer(acctype);       //calling Constructor With respect to there Datatype string
        BankCustomer B2 = new BankCustomer(amt);       //calling Constructor With respect to there Datatype double

    }}