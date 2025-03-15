import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        int[] nums = {1,0,1,2};
        System.out.println(main.longestConsecutive(nums));
    }

    public int longestConsecutive(int[] nums) {
        Set<Integer> set = Arrays.stream(nums).boxed().collect(Collectors.toSet());
        List<Integer> sortedList = new ArrayList<>(set);
        Collections.sort(sortedList);

        int dif = 0;
        int max = 0;
        int count = 0;

        for (int i=0; i<sortedList.size(); i++) {
            if (sortedList.get(i) - i == dif) {
                count++;
            }
            else {
                dif = sortedList.get(i) - i;
                count = 1;
            }

            if (count > max) {
                max = count;
            }
        }
        return max;
    }
}