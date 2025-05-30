class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] indices = new int[2]; 
        for(int i = 0; i<nums.length; i++) {
            for(int j = i+1; j < nums.length; j++) {
                // System.out.println("i="+i+", nums[i]="+nums[i]);
                // System.out.println("j="+j+", nums[j]="+nums[j]);

                if(nums[i] + nums[j] == target) {
                    indices[0] = i; 
                    indices[1] = j;
                }  
            }
        }

        return indices; 
    }
}