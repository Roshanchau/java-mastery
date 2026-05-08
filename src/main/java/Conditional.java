import java.util.Scanner;

public class Conditional {
    public void main(StringOperation[] args){
        Scanner read= new Scanner(System.in);

        System.out.println("Enter your number: ");
        int num= read.nextInt();
        int remainder= num%4;

        if(remainder==0){
            System.out.println("the num:"+ num + " "+"is divisible by 4");
        }else{
            System.out.println("not divisible");
        }
    }
}
