import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.evalRPN(new String[]{"2","1","+","3","*"});
    }

    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<>();

        for (String token: tokens) {
            try {
                stack.push(Integer.parseInt(token));
            }
            catch (NumberFormatException e) {
                int b = stack.pop();
                int a = stack.pop();
                switch (token) {
                    case "+":
                        stack.push(a + b);
                        break;
                    case "-":
                        stack.push(a - b);
                        break;
                    case "*":
                        stack.push(a * b);
                        break;
                    case "/":
                        stack.push(a / b);
                        break;
                }
            }
        }
        return stack.peek();
    }
}