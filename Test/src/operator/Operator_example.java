package operator;

public class Operator_example {

    public static void main(String[] args) {
        int a =10;
        int b =20;


        //Airthmatic perators
        System.out.println("Addition is = "+(a+b));
        System.out.println("Subtraction is = "+(a-b));
        System.out.println("Multiplication is = "+(a*b));
        System.out.println("Division is = "+(a/b));
        System.out.println("Modulse is = "+(a%b));
        System.out.println(++a);
        System.out.println("Decremental value = "+(--a));


        //Logical Operators
        boolean result = a<b && a>b;//false
        boolean result1 = a<b && b>a;//True
        boolean result2 = a<b || a>b;//True
        boolean result3 =a!=b;//True
        boolean result4 =a!=20;//True

        System.out.println(result);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);

        //Relational operators
        boolean answer = a==b;//false
        boolean answer1 = a!=b;//true
        boolean answer2 = a>b;//false
        boolean answer3 = a<b;//true


        System.out.println(answer);
        System.out.println(answer1);
        System.out.println(answer2);
        System.out.println(answer3);

    }
}
