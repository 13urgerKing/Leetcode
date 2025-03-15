import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        List<String> strings = Arrays.asList(
                "\n\t\r\b\f",  // 控制字符
                "Hello\nWorld",  // 包含換行
                "\u0000\u0001\u0002"  // 空字符和其他控制字符
        );
        List<String> ans = main.decode(main.encode(strings));
        System.out.println(ans.equals(strings));
    }

    public String encode(List<String> strs) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(strs.size()).append("#");
        for (String str: strs) {
            stringBuilder.append(str.length()).append("#").append(str);
        }
        return stringBuilder.toString();
    }

    public List<String> decode(String str) {
        List<String> ans = new ArrayList<>();
        int currentIndex = str.indexOf("#");
        int strsTotal = Integer.parseInt(str.substring(0, currentIndex));
        currentIndex += 1;

        for (int i=0; i<strsTotal; i++){
            int delIndex = str.indexOf("#", currentIndex);
            int strTotal = Integer.parseInt(str.substring(currentIndex, delIndex));
            currentIndex = delIndex + strTotal + 1;
            ans.add(str.substring(delIndex + 1, currentIndex));
        }
        return ans;
    }
}