import java.util.Scanner;
import java.util.Set;

public class NotebookFilter {       
    public int inputFilter() {
        System.out.println("Введите цифру, соответствующую необходимому критерию поиска:");
        System.out.println("1 - бренд");
        System.out.println("2 - цвет");        
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        return number;
    }

    public void inputItemAndPrint(int number, Set<Notebook> notebooks) {
        if (number == 1) {
            System.out.println("Введите бренд - ASUS, ASER, HP или LENOVO:");                                 
        }
        if (number == 2) {
            System.out.println("Введите цвет - RED, BLUE, BLACK или SILVER:");                      
        }

        Scanner input = new Scanner(System.in);
        String item = input.next();
        System.out.println("Бренд   Цвет      Страна производитель");
        
        for (var items : notebooks) {            
            if (number == 1 && items.brand.equals(item)) {
                System.out.println(items.brand + "      " + items.color + "     " + items.maidIn);                                
            }
            if (number == 2 && items.color.equals(item)) {
                System.out.println(items.brand + "      " + items.color + "     " + items.maidIn);
            }            
        }        
    }
    
}
