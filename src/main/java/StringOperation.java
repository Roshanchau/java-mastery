import java.util.Scanner;

public class StringOperation {
    public void main(String[] args){
        Scanner reader= new Scanner(System.in);

        int sum=0;
        while(true){
            String input = reader.nextLine();
            if(input.equals("")){
                break;
            }
            String[] parts = input.split(",");
            sum= sum+ Integer.valueOf(parts[1]);
        }

        System.out.println("sum of the age is: "+ sum);

    }
}
