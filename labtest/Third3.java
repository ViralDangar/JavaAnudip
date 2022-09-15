// name=Viral Dangar
// Batch=C2533
// w.a.p to find fibonacci series
public class Third3 {
    public static void main(String[] args) {
        int fv=0,sv=1,fib=1,n=10;
        System.out.print(fv+" "+sv);    // this is out side loop beacuse we want to print this first
        for( int i=2;i<n;++i)//loop starts from 2 because 0 and 1 are already printed
        {
            fib=fv+sv;
            System.out.print(" "+fib);
            fv=sv;
            sv=fib;
        }
    }
}
