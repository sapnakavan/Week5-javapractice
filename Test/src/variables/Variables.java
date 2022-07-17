package variables;

public class Variables {
    //Local Variable :- Varaibles which is declared inside the method.
    //Instance Variable :- Varaibles which is declared outside the method and inside the class.
    //Static variable :-  Varaibles which is declared outside the method and inside the class with static keyword.

    int a =10;// instance variable or Global variable
    static  int b = 20;//static variable Global variable
    static  String name1 = "JAVA";

    public static void main(String args[]){
        String name = "Codebuster";//local variable
        System.out.println(b);//called local variable
        System.out.println(name);//called static variable
        Variables var = new Variables();//crete an object

        System.out.println(var.a);//called variable using object

    }

    void add () {//user defined method and Instance method
        //x,y are local variables.
        int x = 5;
        int y = 10;

        System.out.println(x);//called local variable direct.
        System.out.println(y);
        System.out.println(b);//called static variable direct.
        System.out.println(Variables.name1);//called static variable using class name.

    }
    static  void test(){// static method
        //m,n are local variables.
        int m = 100;
        int n = 200;
        Variables var = new Variables();
        System.out.println(m);
        System.out.println(n);
        System.out.println(var.a);

    }
    //Constructer name and class name should be same.
    Variables(){// Create constructor
        String name2 = "Java is an oriented Programming Language";
    }

    //Instance block
    {
        int m1 = 25;
        System.out.println(m1);
    }

    //Static block
    static {
        boolean result = true;

    }
}
