public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.maxArea(new int[]{2, 3, 4, 5, 18, 17, 6});
    }

    public int maxArea(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int volume = 0;

        while (left < right) {
            volume = Math.max(volume, Math.min(height[left], height[right]) * (right - left));

            if (height[left] <= height[right]) {
                left++;
            }
            else {
                right--;
            }
        }
        return volume;
    }
}