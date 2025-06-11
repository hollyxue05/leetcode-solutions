// Last updated: 6/10/2025, 9:09:24 PM
class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] result = new int[nums.length];
        int[] prefixProducts = new int[nums.length];
        int[] suffixProducts = new int[nums.length];

        prefixProducts[0] = 1;
        suffixProducts[0] = 1;

        // for(int i = 0; i < nums.length; i++) {
        //     prefixProducts[i] = prefixProducts[i - 1] * nums[i - 1];
        // }

        // for(int i = nums.length; i < 0; i++) {
        //      *= nums[i + 1];
        // }

        // for(int i = 0; i < nums.length; i++) {
            
        // }

        int n = nums.length;
        int[] ans = new int[n];

        ans[0] = 1;
        // Calculate prefix products
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] * nums[i - 1];
        }

        int prevSuffix = 1;
        // Calculate suffix products and update ans array
        for (int i = n - 2; i >= 0; i--) {
            prevSuffix *= nums[i + 1];
            ans[i] *= prevSuffix;
        }

        return ans;

        // return result; 
    }
}