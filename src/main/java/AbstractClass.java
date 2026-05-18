/*
Abstraction in Java is the process of hiding internal implementation details and showing only essential functionality to the user. It focuses on what an object does rather than how it does it.

It hides the complex details and shows only essential features.
Abstract classes may have methods without implementation and must be implemented by subclasses.
By abstracting functionality, changes in the implementation do not affect the code that depends on the abstraction.
 */
abstract class Shape{
    String color;

    abstract double area();
    public abstract  String toString();

    public  Shape(String color){
        System.out.println("shape constructor called");
        this.color= color;
    }

//    concrete class
    public String getColour(){
        return this.color;
    }
}

class Circle extends  Shape{
    double radius;

//    even if the super() is called at the last line
//    it will be called first.
    public  Circle(String color , double radius){

        System.out.println("circle constructor called");
        this.radius= radius;
        super(color);

    }

    @Override
    double area(){
        return Math.PI * Math.pow(radius , 2);
    }

    @Override
    public String toString(){
        return "circle color is "+ this.getColour()
                + " and area is: " + this.area();
    }
}

public class AbstractClass {
    public  static void main(String[] args){
        Circle c= new Circle("green" , 2.5);
        System.out.println(c.toString());
    }
}
