public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.findMin(new int[]{3, 4, 5, 1, 2});
    }

    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;

        if (nums[left] < nums[right]) {
            return nums[0];
        } else {
            while (left < right) {
                int mid = left + (right - left) / 2;
                if (nums[mid] > nums[right]) {
                    left = mid + 1;
                }
                else if (nums[mid] < nums[right]) {
                    right = mid;
                }
            }
            return nums[left];
        }
    }
}