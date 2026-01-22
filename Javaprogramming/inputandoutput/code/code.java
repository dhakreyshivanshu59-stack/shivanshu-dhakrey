package Javaprogramming.inputandoutput.code;

import java.util.Scanner;
import java.util.*;

public class code {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int number1 = obj.nextInt();
        int number2 = obj.nextInt();
        int number3 = obj.nextInt();

        int unitplace1 = number1 % 10;
        int unitplace2 = number2 % 10;
        int unitplace3 = number3 % 10;
        int unitplace = Math.min(unitplace1, Math.min(unitplace2, unitplace3));

        int tensplace1 = (number1 / 10) % 10;
        int tensplace2 = (number2 / 10) % 10;
        int tensplace3 = (number3 / 10) % 10;
        int tensplace = Math.min(tensplace1, Math.min(tensplace2, tensplace3));
        int hundredplace1 = (number1 / 100) % 10;
        int hundredplace2 = (number2 / 100) % 10;
        int hundredplace3 = (number3 / 100) % 10;
        int hundredplace = Math.min(hundredplace1, Math.min(hundredplace2, hundredplace3));

        // Thousand place

        int[] arr = { number1, number2, number3 };
        int maxDigit = 0;
        for (int num : arr) {
            while (num > 0) {
                int temp = num;
                maxDigit = Math.max(maxDigit, temp % 10);
                num = num / 10;
            }
        }
        int pin = maxDigit * 1000 + hundredplace * 100 + tensplace * 10 + unitplace;
        System.out.println(pin);
        
    }
}
