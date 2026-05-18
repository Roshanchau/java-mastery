import java.util.Scanner;

public class Array {
    public void main(String[] args){
        Scanner reader= new Scanner(System.in);

        System.out.println("How many numbers?");

        int howMany= reader.nextInt();

        int[] numbers= new int[howMany];

        System.out.println("Enter the numbers");

        for(int i=0; i<howMany; i++){
            numbers[i]= reader.nextInt();
        }

        System.out.println("Printing the numbers:");

        for(int i=0; i<howMany; i++){
            System.out.println(numbers[i]);
        }
    }
}
