interface  ShapeInterface{
    double CalculateArea();
}

class CircleShape implements ShapeInterface{
    double r;

    public CircleShape(double radius){
        this.r= radius;
    }

    public double CalculateArea(){
        return Math.PI * Math.pow(this.r , 2);
    }
}

public class Interface {
    public  static  void main(String[] args){
        CircleShape c= new CircleShape(2.5);
        System.out.println("area: "+ c.CalculateArea());
    }
}
