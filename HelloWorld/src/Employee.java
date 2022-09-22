class Employee extends Per{
    String post;
    public Employee(String p){
        post = p;
    }
    public void display(){
        System.out.println(name + " " + age + " " + post );
    }
}
