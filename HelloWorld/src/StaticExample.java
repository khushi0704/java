public class StaticExample {
    int x;
    static int y;
    public void f1(){
        System.out.println("Instance member function : f1");
    }
    public static void f2(){
        System.out.println("Static member function : f2");
    }
    public class Test1{
        public void f3(){
            System.out.println("Member function of inner class");
        }
    }
    static class Test{
        public void f4(){
            System.out.println("Member function of static inner class");
        }
    }

    static class Test2{
        public static void f5(){
            System.out.println("Static member function of static inner class");
        }
    }
    public static void main(String [] args){
    StaticExample se = new StaticExample();
    se.f1();
    StaticExample.f2();
    StaticExample.Test set = new StaticExample.Test();
    set.f4();
    StaticExample.Test1 et = se.new Test1();
    et.f3();
    StaticExample.Test2.f5();
    }
}

