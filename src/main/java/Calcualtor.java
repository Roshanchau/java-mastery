import java.util.Scanner;

public class Calcualtor {
    public  void main(StringOperation[] args){
        int a;
        int b;
        int c;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the numbers");

        a= scanner.nextInt();
        b= scanner.nextInt();
        c= scanner.nextInt();

        System.out.println("sum: "+ this.add(a , b , c));
        System.out.println("multiply: "+ this.multiply(a , b , c));

    }

    private int add(int a , int b , int c){
        return a+b+c;
    }

    private int multiply(int a , int b , int c){
        return a*b*c;
    }

}

