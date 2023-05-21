package hw1;

// Вывести все простые числа от 1 до 100

public class Task2 {
    public void elementalNumbers() {        
        System.out.println(2);
        System.out.println(3);        
        for (int i = 5; i < 100; i++) {
            boolean f = true;
            if (i % 2 != 0) {
                for (int j = 3; j < i; j += 2) {
                    if (i % j == 0) {
                        f = false;
                    }
                }
                if (f) {
                    System.out.println(i);
                }                    
            }             
        }
    }
}
