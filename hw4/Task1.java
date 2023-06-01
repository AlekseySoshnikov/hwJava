// Пусть дан LinkedList с несколькими элементами. Реализуйте метод, который вернет “перевернутый” список.

import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    private LinkedList<String> buildLinkedList() {
        LinkedList<String> ll = new LinkedList<>();
        ll.add("JAVA");
        ll.add("C#");
        ll.add("PHP");
        ll.add("PYTHON");
        ll.add("TURBO PASCAL");
        return ll;
    }
    public LinkedList<String> printLinkedList() {
        LinkedList<String> ll = buildLinkedList();
        return ll;
    }
    public LinkedList<String> reverseLinkedList() {
        LinkedList<String> ll = buildLinkedList();
        Collections.reverse(ll);
        return ll;
    }
}
