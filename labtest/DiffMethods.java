// name=Viral Dangar
// Named method,Constructor, Static , Annonymous
abstract class viral{
    viral(){
        System.out.println("Hello I am Constructor Of viral class"); // constructor of method vital
    }
    int sum(int a,int b){     // named method with parameter
        int c=a+b;
        return c;
    }
    abstract void Annonymous();   // anonymous method name only but body assign in main method

    static void name(){       //static method that is Constant every time and access any time with only static method
        System.out.println("Hello my name is Viral and My name is Static");
    }
}

public class DiffMethods {
    public static void main(String[] args) {
        viral v=new viral()
        {          // implemeneting annnonymose method
            void Annonymous()
        {
            System.out.println("I am Annonymous method");
        }
        };
        System.out.println( v.sum(10,30)); //calling sum method
        viral.name();  // calling static method thats why call with class not with object
        v.Annonymous(); // calling annonymose

    }
}
