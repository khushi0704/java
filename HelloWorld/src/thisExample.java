class A{
    String a;
    void sendIt(String a){
        this.a=a;
        B b = new B();
        b.receive(this);
    }
    String getMessage(){
        return a;
    }
class B{
    String b;
    void receive(A objA){
        b = objA.getMessage();
        System.out.println("the message is ... " + b);
    }
}
}
public class thisExample {
    public static void main(String[] args){
        A a = new A();
        a.sendIt("Yo !");
        A b = new A();
        b.sendIt("");
    }
}
