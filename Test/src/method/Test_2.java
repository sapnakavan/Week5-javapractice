package method;
//constructer understand
public class Test_2 {
    int eid;
    String name;

    public static void main(String[] args) {
        Test_2 t= new Test_2(10);

    }

    Test_2(){
        this("patel");
        System.out.println("bhav");
    }

    Test_2(int a){
        this();
        System.out.println(a);
    }
    Test_2(String n){
        System.out.println(n);
    }

}
