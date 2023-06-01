// Домашнее задание к семинару от 26.05.2023

public class Main {
    public static void main(String[] args) {
        // Task1
        // Task1 task1 = new Task1();
        // System.out.println("Оригинал: ");
        // System.out.println(task1.printLinkedList());
        // System.out.println("Перевёртыш: ");
        // System.out.println(task1.reverseLinkedList());

        // Task2
        HWQueue hwQueue = new HWQueue();
        //hwQueue.first();
        hwQueue.enqueue(11);
        hwQueue.enqueue(22);
        hwQueue.enqueue(33);
        System.out.println(hwQueue.first());
        System.out.println(hwQueue.dequeue());
        System.out.println(hwQueue.first());
        System.out.println(hwQueue.dequeue());
        System.out.println(hwQueue.dequeue());
        hwQueue.enqueue(44);
        System.out.println(hwQueue.dequeue());
        System.out.println(hwQueue.first());
    }    
}