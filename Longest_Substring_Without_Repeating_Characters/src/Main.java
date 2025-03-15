import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.lengthOfLongestSubstring(" ");
    }

    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0;
        int max = 0;

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            if (map.get(c) != null) {
                l = Math.max(l, map.get(c) + 1);
            }
            map.put(c, r);
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}