import com.sun.net.httpserver.Authenticator;

class BaseClass{
    public void show(){
        System.out.println("hello from base class");
    }
}

class Subclass1 extends  BaseClass{
    @Override
    public void show(){
        System.out.println("hello from subclass 1");
    }
}

class Subclass2 extends BaseClass{
    @Override
    public void show(){
        System.out.println("hello from subclass 2");
    }
}


public class RunTime_Polymorphism_MethodOverriding {
    public static void main(String[] args){
        Subclass1 sc1= new Subclass1();
        Subclass2 sc2= new Subclass2();

        sc1.show();
        sc2.show();
    }
}
