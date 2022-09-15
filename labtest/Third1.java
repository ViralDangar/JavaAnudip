// Name=Viral Dangar
// batch=C2533
// Find the order 1 4 7 10
public class Third1 {
    public static void main(String[] args){
        int t = 1;
        for (int i = 1; i <= 10; i++)
        {
            System.out.print(t + " ");   // first value 1 print then t=1+3=4 printed
            t += 3;
        }
    }
}
