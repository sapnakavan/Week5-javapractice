package method;
// constructor understand
public class Test_1 {
    int eid;
    String name;

    public static void main(String[] args) {
        Test_1 t= new Test_1(111,"bhav");
        t.display();
        Test_1 t1=new Test_1(222,"gaurang");
        t1.display();
        Test_1 t3=new Test_1(333,"sapna");
        t3.display();

    }

    Test_1(int eid,String name){
       /* eid=111;
        name="bhav";*/
        this.eid=eid;
        this.name=name;
    }
    void display(){
        System.out.println(eid);
        System.out.println(name);
    }

}
