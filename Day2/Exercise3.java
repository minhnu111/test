import java.util.Scanner;

public class Exercise3 {
    public static void main(String[] strings) {
        System.out.print("Input a month number: ");
        Scanner input = new Scanner(System.in);
        int number_Of_DaysInMonth = 0;
        int a;
        do{
            a = input.nextInt();
            System.out.printf("\"%s\" is not a month.\n", a);
            System.out.println("Please enter again.");
        }
        while(!(a < 1) && !(a > 13));
        int month = input.nextInt();
        switch (month) {
            case 1:
                number_Of_DaysInMonth = 31;
                break;
            case 2:
                number_Of_DaysInMonth = 28;
                break;
            case 3:
                number_Of_DaysInMonth = 31;
                break;
            case 4:
                number_Of_DaysInMonth = 30;
                break;
            case 5:
                number_Of_DaysInMonth = 31;
                break;
            case 6:
                number_Of_DaysInMonth = 30;
                break;
            case 7:
                number_Of_DaysInMonth = 31;
                break;
            case 8:
                number_Of_DaysInMonth = 31;
                break;
            case 9:
                number_Of_DaysInMonth = 30;
                break;
            case 10:
                number_Of_DaysInMonth = 31;
                break;
            case 11:
                number_Of_DaysInMonth = 30;
                break;
            case 12:
                number_Of_DaysInMonth = 31;
        }
        System.out.print("Thang " + month + " co " + number_Of_DaysInMonth + " ngay");
    }
}
