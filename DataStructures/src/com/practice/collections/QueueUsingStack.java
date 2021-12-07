package collections;

import static java.lang.System.out;

public class QueueUsingStack {
    Stack insertStack ;
    Stack backupStack;
    int capacity;
    int front,rear,size;

    public QueueUsingStack(int capacity) {
        this.capacity = capacity;
        insertStack =  new Stack(capacity);
        backupStack = new Stack(capacity);
        front = size = 0;
        rear = 0;
    }

    private boolean isFull(){
        return this.size == this .capacity;
    }

    private boolean isEmpty(){
        return this.size == 0;
    }

    private void enQueue(int element) {
        if (isFull()) {
            out.println("Queue is Full");
            return;
        }
        copyStack(backupStack, insertStack);
        insertStack.push(element);
        copyStack(insertStack, backupStack);
        size++;
    }

    private void copyStack(Stack destination, Stack source) {
        while (!source.isEmpty()) {
            destination.push(source.pop());
        }
    }

    private int deque() {
        if (isEmpty()) {
            out.println("Queue is Empty");
            return Integer.MIN_VALUE;
        }
        int value  = insertStack.pop();
        size--;
        return value;
    }

    public static void main(String[] args) {
     QueueUsingStack queue = new QueueUsingStack(5);
        queue.enQueue(10);
        queue.enQueue(20);
        queue.enQueue(30);
        queue.enQueue(40);
        queue.enQueue(50);
        queue.enQueue(60);
     System.out.println(queue.deque());
     System.out.println(queue.deque());
     System.out.println(queue.deque());
     System.out.println(queue.deque());
     System.out.println(queue.deque());
     System.out.println(queue.deque());

    }




}
