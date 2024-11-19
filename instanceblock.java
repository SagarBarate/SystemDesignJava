//Instace block examples:
class A{
    int a,b;
    
    void show(){
        System.out.println("Method called");
    }
    static void staticshow(){
        System.out.println(" Static Method called");
    }
    A(){
         a=10;
         b=10;
        System.out.println(a+b+" Constructor called");
        
    }
    {
        a=20;
        b=20;
        System.out.println(a+b+" Instance block Called");
    }
}

class Main {
    public static void main(String[] args) {
        A.staticshow();
        A obj = new A();
        obj.show();
        
        
    }
}

// Output: 
// Static Method called
// 40 Instance block Called
// 20 Constructor called
// Method called


