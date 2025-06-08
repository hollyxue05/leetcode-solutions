// Last updated: 6/7/2025, 9:44:52 PM
class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> s = new HashSet<Integer>(); 
        //fill 
        for(int i = 0; i < nums.length; i++) {
            if(s.contains(nums[i]))  return true;

            s.add(nums[i]);
        }




        //
        return false; 
    }
}