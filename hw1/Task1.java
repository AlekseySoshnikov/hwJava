package hw1;

import java.util.Scanner;

// Задание № 1.
// Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n).

public class Task1 {
    public int inputNumber() {
        System.out.println("Введите n:");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();        
        return number;
    }
    public void сalculate(int number) {
        int trips = 1;
        int fact = 1;      

        for (int i = 2; i <= number; i++) {
            trips += i;
            fact *= i;        
        }        
        
        System.out.println("n-ое треугольного число = " + trips);        
        System.out.println("n! = " + fact);
    }
}
