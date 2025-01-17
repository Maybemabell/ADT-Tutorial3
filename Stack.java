//672115039 Metavee Aeinjang
// this code is for tutorial3 assignment in ADT and problem solving only

package tutorial3;

public class Stack {
    private Student[] stackArray; 
    private int top;              
    private int capacity; 

    public Stack(int capacity) {
        this.capacity = capacity;
        stackArray = new Student[capacity];
        top = -1; 
    }

    // Push method
    public void push(Student student) {
        if (isFull()) {
            throw new IllegalStateException("Stack is full! Cannot push.");
        }
        stackArray[++top] = student;
    }

    // Pop method
    public Student pop() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty! Cannot pop.");
        }
        return stackArray[top--];
    }

    // Peek method
    public Student peek() {
        if (isEmpty()) {
            throw new IllegalStateException("Stack is empty! Nothing to peek.");
        }
        return stackArray[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int max() {
        return top + 1;
    }
}
