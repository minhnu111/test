import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number 1:");
        int a = input.nextInt();
        System.out.println("Please enter number 2");
        int b = input.nextInt();
        if(a > b){
            System.out.println("Number 1 must be smaller than number 2");
        }
        else{
            for(int i = a; i <= b; i++) System.out.println(i);
        }
    }
}
