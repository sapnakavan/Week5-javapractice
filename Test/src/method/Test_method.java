package method;

public class Test_method {
    public static void main(String[] args) {
        Test_method t = new Test_method();// create an object
        t.addition();                    //call instance method using object name
        t.subtraction(20,10);
        t.subtraction(40,15);
        t.printname("Testing", "java");
        t.multiplication();
        division(50,10);          //call static method direct
        Test_method.division(25,12); // call static method vis class name
    }

    //1. no return type with no parameters
    public  void  addition(){
        System.out.println("codebuster Testing");
    }

    //2. no return type with parameters
    public void subtraction(int a,int b){
        System.out.println(a-b);
    }

    public void printname(String name, String name1){
        System.out.println(name);
        System.out.println(name1);
    }

    //3.with retuen type with no parameters
    public int multiplication(){
        int a = 10;int b = 20;
        int result = a*b;
        System.out.println(result);
        return result;
    }

    //4. with return type with parameter

    public static int division (int a,int b){
         int result =a/b;
        System.out.println(result);
        return result;
    }
}
