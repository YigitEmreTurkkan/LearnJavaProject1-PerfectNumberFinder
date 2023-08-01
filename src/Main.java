import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = enter.nextInt();

        int controlValue = 0;

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                controlValue = (controlValue += i);
            } else {
                continue;
            }
        }
        if(controlValue==number*2){
            System.out.println("This number is perfect number");
        }else{
            System.out.println("This number is NOT perfect number");
        }



    }
}