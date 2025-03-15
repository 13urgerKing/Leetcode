import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.generateParenthesis(3);
    }

    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        backtrack(ans, "", 0, 0, n);
        return ans;
   }

    public void backtrack(List<String> ans, String s, int l, int r, int n) {
        if (l + r == n * 2) {
            ans.add(s);
            return;
        }

        if (l < n) {
            backtrack(ans, s + "(", l + 1, r, n);
        }

        if (r < l){
            backtrack(ans, s + ")",  l, r + 1, n);
        }
    }
}