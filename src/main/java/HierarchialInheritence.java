class Chocolate{
    Chocolate(){
        System.out.println("This is a new chocolate.");
    }
}

class DairyMilk extends  Chocolate  {
    DairyMilk(){
        super();
        System.out.println("This is dairy milk.");
    }
}

class Kitkat extends  Chocolate{
    Kitkat(){
        super();
        System.out.println("This is kit kat.");
    }
}

public class HierarchialInheritence {
    public static  void main(String[] args){
        Kitkat k = new Kitkat();
        DairyMilk d= new DairyMilk();
    }
}
