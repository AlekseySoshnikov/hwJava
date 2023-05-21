package hw1;

import java.util.Scanner;

// Задание № 3.
// Реализовать простой калькулятор.

public class Task3 {
    public double inputNumber() {
        Scanner input = new Scanner(System.in);
        double number = input.nextDouble();        
        return number;
    }
    public String inputOper() {             
        Scanner inp = new Scanner(System.in);
        String oper = inp.next();        
        return oper;        
    }
    public void сalculate() {
        System.out.println("Введите первое число: ");
        double first = inputNumber();       
        System.out.println("Введите арифметический оператор (+, -, *, /): ");
        String oper = inputOper(); 
        System.out.println("Введите второе число: ");
        double second = inputNumber();        
        double result = 0;       
        switch (oper) {
            case "+":
                result = first + second;                
                break;
            case "-":
                result = first - second;
                break;
            case "*":
                result = first * second;                
                break;
            case "/":
                result = first / second;                
                break;
            default:
                System.out.println("!!!ВНИМАНИЕ!!! Неверно введён арифметический оператор.");
                break;           
        }
        System.out.println("Результат арифметической операции: ");
        System.out.printf("%.2f\n", result);
    }
}
