/*Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков (Set).
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру. 
Критерии фильтрации можно хранить в Map или в Сет. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - цвет
2 - бренд */

import java.util.Objects;

public class Notebook {
    String brand;
    String color;
    String maidIn;

    public Notebook(String brand, String color, String maidIn) {
        this.brand = brand;
        this.color = color;
        this.maidIn = maidIn;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public String getMaidIn() {
        return maidIn;
    }

    @Override
    public String toString() {        
        return "Notebook{" +
                "brand=" + brand +
                ", color=" + color +
                ", maidIn=" + maidIn +
                '}';
    }

    @Override
    public boolean equals(Object o) {        
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Notebook notebook = (Notebook) o;
        return Objects.equals(brand, notebook.brand) && Objects.equals(color, notebook.color) && Objects.equals(maidIn, notebook.maidIn);
    }

    @Override
    public int hashCode() {        
        return Objects.hash(brand, color, maidIn);
    }
}
