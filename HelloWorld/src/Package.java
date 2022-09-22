package a;
import b.Pack;
public class Package {
    public static void main(String[] args){
        System.out.println("I am in package a");
        Pack p1 = new Pack();
        p1.callMe();
    }
}
