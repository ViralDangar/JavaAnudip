// name=Viral Dangar
// Constructor Chaining using this keyword
class Chain{
    Chain(){
        this(5);
        System.out.println("First/Default Constructor");
    }
    Chain(int a) {
        this(10.5,5.55);
        System.out.println("Constructor with 1 parameter "+a);
    }
    Chain(double b,double c){
        System.out.println(b+c);
    }
}
public class Chaining {
    public static void main(String[] args) {
        new Chain();
    }
}
