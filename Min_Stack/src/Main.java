import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}

class MinStack {
    Stack<Integer> mainStack;
    Stack<Integer> minStack;
    int minValue = Integer.MAX_VALUE;

    public MinStack() {
        this.mainStack = new Stack<>();
        this.minStack = new Stack<>();
    }

    public void push(int val) {
        this.mainStack.push(val);

        if (val < this.minValue) {
            this.minValue = val;
        }
        this.minStack.push(minValue);
    }

    public void pop() {
        this.mainStack.pop();
        this.minStack.pop();

        if (!this.minStack.empty()) {
            this.minValue = this.minStack.peek();
        }
        else {
            this.minValue = Integer.MAX_VALUE;
        }
    }

    public int top() {
        return this.mainStack.peek();
    }

    public int getMin() {
        return this.minStack.peek();
    }
}