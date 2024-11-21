// Online Java Compiler
// Super keyword 
//In Java, the use of super to call a parent class constructor is restricted to the first line of a constructor and cannot be used outside of a method or constructor
class A{
    int a=10;
    A(){
        System.out.println("default constructor A");
    }
    A(int c){
        System.out.println("default constructor A"+c);
    }
    void show(){
        System.out.print("A class show method");
    }
}

class B extends A{
    int a =20;
    
    B(){
        
        super(100);
        //super();
        System.out.println("default constructor B");
    }
    void show(){
        System.out.println(super.a);
        System.out.println(a);
    }
}
class Main {
    public static void main(String[] args) {

        B r = new B();
        System.out.println();
        r.show();
        
    }
}
