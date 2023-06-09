// Задание к семинару от 02.06.2023

public class Main {
    public static void main(String[] args) {
        Task task = new Task();
        task.putNewElement("John", "123654");
        task.putNewElement("Den", "4562145");
        task.putNewElement("Sally", "789544");
        task.printMap();
        task.putNewElement("John", "20003698");
        task.printMap();
        task.putNewElement("John", "201113698");
        task.putNewElement("Sally", "2045898");
        task.putNewElement("Alex", "27895898");
        task.printMap();
        task.sort();
        task.printMap();
    }
    
}