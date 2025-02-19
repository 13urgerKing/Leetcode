import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        HashMap<String, List<String>> index = new HashMap<>();
        for (String s: strs) {
            char[] chars = s.toCharArray();
            Arrays.sort(chars);
            if (index.containsKey(new String(chars))){
                index.get(new String(chars)).add(s);
            }
            else {
                List<String> strings = new ArrayList<>();
                strings.add(s);
                index.put(new String(chars), strings);
            }
        }

        return new ArrayList<>(index.values());
    }
}