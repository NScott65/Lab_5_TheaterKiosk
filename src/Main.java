import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Variables
        int userAge = 0;

        System.out.print("Enter your age: ");
        if(scan.hasNextInt()){
            userAge = scan.nextInt();
        }else{
            System.out.print("Your input was invalid.");
            System.exit(0);
        }
        if(userAge < 21){
            System.exit(0);
        }else if(userAge >= 21){
            System.out.print("Now printing your wristband.");
        }
    }
}