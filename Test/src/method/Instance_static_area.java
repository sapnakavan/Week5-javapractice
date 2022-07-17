package method;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Instance_static_area {
    //Instance area or static area

    int a= 1; //  Declare instance variable
    static  String name = "Java is a Secure Language ";// Declare stattic Variable

    public static void main(String args []){
        // Static area

        //Create an object
        //where instance_static_area is class name ,isa is an object ,new is a key word and Instance_static_area()
        // is constructor
        Instance_static_area isa =new Instance_static_area();
        System.out.println(isa.a);// caled instance variable using object name
        System.out.println(name);
        m2();
        isa.m1();
    }

    //calling :- Instance variable to instance area :- Direct
    //calling :- Static variable to static area :- Direct
    //calling :- Instance variable to static area :- create object
    //calling :- static variable to instance area :-direct or via Class name

    void m1 (){//Instance method
        //instance area
        int x = 10;
        System.out.println(x);
        System.out.println(a);
        m2();
        Instance_static_area.m2();

        }
        static void m2(){//Declare static method
        //static area
        int y = 5;
        System.out.println(y);
        Instance_static_area isa = new Instance_static_area();
        System.out.println(isa.a);


    }
}

