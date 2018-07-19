import java.util.Scanner;

public class Exercise1 {
    public static void main(String[] args){
        System.out.print("Please enter a number: ");
        Scanner scanner = new Scanner(System.in);

        int number;
        do {
            String input = scanner.next();
            System.out.printf("\"%s\" is not a valid number.\n", input);
            System.out.println("Please enter again.");

        } while (!scanner.hasNextInt());
        number = scanner.nextInt();
        if(number % 2 ==0){
            System.out.println("You have entered an even number");
        }
        else {
            System.out.println("You have entered an odd number");
        }
    }
}
