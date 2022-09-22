public class Initialization {
    static int a =10;
    static {
        System.out.println("Static init block");
    }
    {
        System.out.println("init");
    }
    Initialization(){
        System.out.println("default");
    }
    Initialization(int x){
        System.out.println(x);
    }
    {
        System.out.println("second");
    }
    public static void main(String args[]){
        System.out.println(Initialization.a);
        Initialization it = new Initialization();
        Initialization it1 = new Initialization(15);
    }
}
