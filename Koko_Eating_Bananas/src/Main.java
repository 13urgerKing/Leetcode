import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.minEatingSpeed(new int[]{805306368,805306368,805306368}, 1000000000);
    }

    public int minEatingSpeed(int[] piles, int h) {
        Arrays.sort(piles);
        int min = 1;
        int max = piles[piles.length - 1];
        int ans = Integer.MAX_VALUE;

        while (min <= max) {
            int mid = (min + max) / 2;
            int hours = 0;
            for (int pile: piles) {
                hours = hours + (pile + mid - 1) / mid;
            }

            if (hours < 0) {
                break;
            }
            else if (hours > h) {
                min = mid + 1;
            }
            else if (hours <= h) {
                max = mid - 1;
                if (mid <= ans) {
                    ans = mid;
                }
            }
        }
        return ans;
    }
}