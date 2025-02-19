import java.util.Arrays;

//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public boolean isAnagram(String s, String t) {
        char[] chars_s = s.toCharArray();
        char[] chars_t = t.toCharArray();
        Arrays.sort(chars_s);
        Arrays.sort(chars_t);
        return Arrays.compare(chars_s, chars_t) == 0;
    }
}