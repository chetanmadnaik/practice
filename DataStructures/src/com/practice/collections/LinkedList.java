package collections;

import static java.lang.System.*;

public class LinkedList {

    private Node head;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }
    private void print() {
        if(head == null){
            out.println("list is empty");
            return;
        }
        out.print("head->");
        Node current = head;
        while (current != null) {
            out.print(current.data);
            out.print("->");
         current = current.next;
        }
        out.print("null");
        out.println("");
    }

    private void add(int data) {
        Node current = this.head;
        while(current.next!= null){ current = current.next; }
        current.next = new Node(data);
    }

    private void addFirst(int data) {
        Node existingFirst = head;
        head = new Node(data);
        head.next = existingFirst;
    }


    private void delete(int index) {
        if(index == 1){
            head = head.next;
            return;
        }
        Node current = this.head;
        int count = 1;
        while(current != null){
            if(count == index-1){
                break;
            }
            count ++;
            current = current.next;
        }

        Node nodeToDelete = current.next;
        current.next = nodeToDelete.next;

    }


    private boolean contains(int element) {
        for(Node node = this.head; node!= null ;node = node.next){
            if(node.data == element){
                return true;
            }
        }
        return false;
    }

    private void reverse() {
        Node next;
        Node prev = null;
        Node node = this.head;
        while ( node!= null ){
            next = node.next;
            node.next = prev;
            prev = node;
            node = next;
        }
        this.head = prev;
    }


    private void clear() {
        head = null;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node first = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        list.head = first;
        list.head.next = second;
        list.head.next.next = third;
        list.print();

        list.add(4);
        list.add(5);
        list.print();

        list.addFirst(5);
        list.addFirst(6);
        list.addFirst(7);
        list.print();

        list.delete(3);
        list.print();
        list.delete(1);
        list.print();

        boolean isPresent  = list.contains(3);
        System.out.println("3 present ="+ isPresent);

        isPresent  = list.contains(7);
        System.out.println("7 present ="+ isPresent);

        list.reverse();
        list.print();


        list.clear();
        list.print();

    }

}
