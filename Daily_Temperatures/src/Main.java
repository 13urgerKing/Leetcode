import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
    }

    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> stack = new Stack<>();
        int[] ans = new int[temperatures.length];

        for (int i = 0; i < temperatures.length; i++) {
            while (!stack.empty() && temperatures[i] > temperatures[stack.peek()]) {
                ans[stack.peek()] = i - stack.pop();
            }
            stack.push(i);
        }
        return ans;
    }
}