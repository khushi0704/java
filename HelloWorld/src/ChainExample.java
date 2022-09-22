class Base{
    String name;
    Base(){
        this(" ");
        System.out.println("No Argument constructor of " + "base class");
    }
    Base(String name){
        this.name = name;
        System.out.println("Calling parameterized constructor"+" base");
    }
}
class ChainExample extends Base{
    ChainExample(){
        // first line super by default
        System.out.println("No argument constructor"+" of derived");
    }
    ChainExample(String name){
       super(name);
        System.out.println("Calling parameterized constructor"+" of derived");
    }
    public static void main(String args[]){
        ChainExample obj = new ChainExample("test");
        ChainExample obj1 = new ChainExample();
    }
}