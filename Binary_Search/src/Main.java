public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.search(new int[]{-1, 0, 3, 5, 9, 12}, 13);
    }

    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return mid;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            }
            else if (target < nums[mid]) {
                right = mid - 1;
            }
        }
        return -1;
    }
}