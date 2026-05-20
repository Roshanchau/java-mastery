interface LandVehicle{
    default void landVehicleInfo(){
        System.out.println("This is a land vehicle info.");
    }
}

interface WaterVehicle{
    default void WaterVehicleInfo(){
        System.out.println("This is a water vehicle info.");
    }
}

class AmphibianVehicle implements  LandVehicle, WaterVehicle{
    AmphibianVehicle(){
        System.out.println("This is an amphibian vehicle.");
    }
}

public class MultipleInheritence {
    public static  void main(String[] args){
        AmphibianVehicle av= new AmphibianVehicle();
        av.landVehicleInfo();
        av.WaterVehicleInfo();
    }
}
