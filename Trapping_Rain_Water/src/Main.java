public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.trap(new int[]{0});
    }

    public int trap(int[] height) {
        int heighest = -1;
        int volume = 0;
        for (int i=0; i<height.length; i++) {
            if (heighest == -1 && height[i] > 0) {
                heighest = i;
            }
            else if (heighest >= 0 && height[heighest] <= height[i]) {
                for (int j=heighest; j<i; j++) {
                    volume = volume + height[heighest] - height[j];
                }
                heighest = i;
            }
        }

        heighest = -1;
        for (int i=height.length-1; i>=0; i--) {
            if (heighest == -1 && height[i] > 0) {
                heighest = i;
            }
            else if (heighest >= 0 && height[heighest] < height[i]) {
                for (int j=heighest; j > i; j--) {
                    volume = volume + height[heighest] - height[j];
                }
                heighest = i;
            }
        }

        return volume;
    }
}