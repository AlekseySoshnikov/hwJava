// Реализуйте очередь с помощью LinkedList со следующими методами:
// enqueue() - помещает элемент в конец очереди, 
// dequeue() - возвращает первый элемент из очереди и удаляет его, 
// first() - возвращает первый элемент из очереди, не удаляя.

import java.util.LinkedList;

public class HWQueue {
    private LinkedList<Integer> ll;

    private boolean empty() {
        return ll.size() == 0;
    }

    public HWQueue() {
        this.ll = new LinkedList<>();
    }
    
    public void enqueue(int inputArg) {
        ll.add(inputArg);
    }

    public int dequeue() {
        if (empty()) {
            throw new RuntimeException("Очередь является пустой.");
        } else {
            return ll.pollFirst();
        }
    }

    public int first() {
        if (empty()) {
            throw new RuntimeException("Очередь является пустой.");
        } else {
            return ll.getFirst();
        }
    }
}
