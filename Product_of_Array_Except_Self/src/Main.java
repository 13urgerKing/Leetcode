public class Main {
    public static void main(String[] args) {
        int[] ans = new int[nums.length];
        int leftproduct = 1;
        int rightproduct = 1;

        for (int i=0; i<nums.length; i++) {
            ans[i] = leftproduct;
            leftproduct *= nums[i];
        }

        for (int i=nums.length-1;i>=0; i--) {
            ans[i] *= rightproduct;
            rightproduct *= nums[i];
        }

        return ans;
    }
}