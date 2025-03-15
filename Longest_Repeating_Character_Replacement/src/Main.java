import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }

    public int characterReplacement(String s, int k) {
        int l = 0, max_count = 0, max_length = 0;
        Map<Character, Integer> map = new HashMap<>();

        for (int r = 0; r < s.length(); r++) {
            char c = s.charAt(r);
            map.put(c, map.getOrDefault(c, 0) + 1);
            max_count = Math.max(max_count, map.get(c));

            if (r - l + 1 - max_count > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            max_length = Math.max(max_length, r - l + 1);
        }
        return max_length;
    }
}