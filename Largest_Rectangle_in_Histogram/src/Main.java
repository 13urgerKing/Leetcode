import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.largestRectangleArea(new int[]{4,2,0,3,2,5});
    }

    public int largestRectangleArea(int[] heights) {
        int res = 0;
        Stack<Integer> stack = new Stack<>();
         for (int i = 0; i <= heights.length; i++) {
             int currentHeight;
             if (i == heights.length) {
                 currentHeight = 0;
             }
             else {
                 currentHeight = heights[i];
             }
             while (!stack.empty() && currentHeight < heights[stack.peek()]) {
                 int index = stack.pop();
                 int h = heights[index];
                 int w;
                 if (stack.empty()) {
                     w = i;
                 }
                 else {
                     w = i - index + index - stack.peek() - 1;
                 }
                 res = Math.max(res, h * w);
             }
             stack.push(i);
        }
        return res;
    }
}