public class WrapperClass {
    public static void main(String[] args){
        Integer i1 = Integer.valueOf("123");
        System.out.println(i1);
        Double d1 = Double.valueOf("3.14");
        System.out.println(d1);
        int a = Integer.parseInt("123");
        System.out.println(a);
        double b = Double.parseDouble("13.45");
        System.out.println(b);
        int c = i1.intValue();
        System.out.println(c);
    }
}
