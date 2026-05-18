class Calculation{
      public int Multiply(int a , int b){
          return a*b;
      }

      public  double Multiply(double a , double b){
          return a*b;
      }
}

public class CompileTime_Polymorphism_MethodOverloading {
    public static void main(String[] args){
        Calculation c= new Calculation();

        System.out.println(c.Multiply(2, 4));
        System.out.println(c.Multiply(2.5 , 3.5));
    }
}
