// Пусть дан произвольный список целых чисел. Нужно:
// 1) Найти минимальное значение.
// 2) Найти максимальное значение.
// 3) Найти среднее значение.
// 4) Нужно удалить из него чётные числа.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Task {
    private ArrayList<Integer> buildArray() {
        ArrayList<Integer> arrayList = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            arrayList.add(random.nextInt(-100, 100));
        }        
        return arrayList;
    }
    public void сalculate() {
        ArrayList<Integer> arrList = buildArray();
        System.out.println("Задан произвольный список целых чисел:");
        System.out.println(arrList);
        System.out.println("Минимальное значение элемента списка: " + Collections.min(arrList));
        System.out.println("Максимальное значение элемента списка: " + Collections.max(arrList));
        double summer = 0;
        int arrSize = arrList.size();
        ArrayList<Integer> arrayListRemove = new ArrayList<>();
        for (int i = 0; i < arrList.size(); i++) {
            summer += arrList.get(i);            
            if (arrList.get(i) % 2 != 0) {                
                arrayListRemove.add(arrList.get(i));
            }
        }
        System.out.println("Среднее арифметическое значение списка: " + summer / arrSize);
        System.out.println("Список целых чисел после удаления элементов с чётными значениями:");
        System.out.println(arrayListRemove);
    }
}
