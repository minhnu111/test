package nultm;

import java.util.Scanner;

public class SumOfTwoNumber {
    public static void main(String[] args) {
        float sum = 0, number1, number2;
        Scanner scanner = new Scanner(System.in);

            System.out.println("Nhập vào số thứ 1: ");
            number1 = scanner.nextFloat();
            System.out.println("Nhập vào số thứ 2: ");
            number2 = scanner.nextFloat();
            sum += number1 + number2;

        System.out.println("Tổng = " + sum);
    }
}
