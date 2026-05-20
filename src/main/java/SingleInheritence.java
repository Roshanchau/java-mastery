class Vehicle{
    Vehicle(){
        System.out.println("This is a vehicle");
    }
}

class Car extends Vehicle{
    Car(){
        super();
        System.out.println("This is a car");
    }
}

public class SingleInheritence {
    public  static void main(String[] args){
        Car c= new Car();
    }
}
