package collections;

public class Stack {
     private int size;
     private int [] stack ;
     private int top = -1;

    public Stack(int size) {
        this.size = size;
        this.stack = new int[this.size];
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(100);
        stack.push(200);
        stack.push(300);
        stack.push(400);
        stack.push(500);
        stack.push(600);

        System.out.println("popped element = "+stack.pop());
        System.out.println("popped element = "+stack.pop());
        System.out.println("popped element = "+stack.pop());
        System.out.println("popped element = "+stack.pop());
        System.out.println("popped element = "+stack.pop());
        System.out.println("popped element = "+stack.pop());


    }

    public int pop() {
        if(top< 0){
            System.out.println("Stack is empty...can't pop");
            return -1;
        }
        return stack[top--];
    }

    public void push(int data) {
        if(top >= this.size -1){
            System.out.println("Stack is full to capacity...can't push");
            return ;
        }
        stack[++top] = data;
       // System.out.println("pushed element = "+ data);
    }

    public boolean isEmpty() {
       return  top == -1;
    }

    public boolean isFull(){
        return  top == size;
    }
}
