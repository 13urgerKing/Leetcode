public class Main {
    public static void main(String[] args) {
        Main main = new Main();
        main.searchMatrix(new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,50}}, 11);
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        int left = 0;
        int right = matrix.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == matrix[mid][0]) {
                return true;
            }
            else if (left == right) {
                return searchNum(matrix[mid], target);
            }
            else if (target < matrix[mid][0]) {
                right = mid - 1;
            }
            else if (target >= matrix[mid + 1][0]) {
                left = mid + 1;
            }
            else {
                return searchNum(matrix[mid], target);
            }
        }
        return false;
    }

    public boolean searchNum(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (target == nums[mid]) {
                return true;
            }
            if (target > nums[mid]) {
                left = mid + 1;
            }
            else if (target < nums[mid]) {
                right = mid - 1;
            }
        }
        return false;
    }
}