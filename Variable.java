public class Variable {
    public static void main(String args[])
        {
            int in;//Instance Variable Inside Class outside Method
            int c=5;//Instance Variable  
            System.out.println("Instance Variable=" +c);

            public void case()
            {
                int b=10; //local variable
                System.out.println("Value of b : "+b);
            }

            static int b=50;//Static Variable Inside Class outside Method with static keyword

            public static void main(String[] args){
            Localv l1 = new Localv();//Creating obj for Instance

            System.out.println("Instance Variable i : "+l1.i);//default value of x will be printed
            System.out.println("Instance Variable j : "+l1.j);

            Localv l2 = new Localv();//Creating object for Local
            l2.case();
            System.out.println("Static Variable b : "+l2.b);

        }
        }
}
