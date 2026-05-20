class newVehicle{
    newVehicle(){
        System.out.println("This is a new vehicle");
    }
}

class newCar extends newVehicle{
    newCar(){
        super();
        System.out.println("This is a new car");
    }
}

class Ford extends  newCar{
    Ford(){
        super();
        System.out.println("This is ford");
    }
}

public class MultilevelInheritence {
    public static void main(String[] args){
        Ford f= new Ford();
    }
}
