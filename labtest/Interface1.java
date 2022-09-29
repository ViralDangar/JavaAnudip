interface numbers {
      public static final int a = 45;
      public static final int b=50;
      public abstract int add();

}
interface numbers1{
    public static final int x=100;
    public static final int y=200;
    public abstract int sub();
}
class addsub implements numbers,numbers1{
    public int add(){
        int c=a+b;
        return c;
    }
    public int sub(){
        int d=x-y;
        return d;
    }
}
public class Interface1 {
    public static void main(String[] args) {
        addsub a=new addsub();

        System.out.println(a.add());
        System.out.println(a.sub());

    }
}
