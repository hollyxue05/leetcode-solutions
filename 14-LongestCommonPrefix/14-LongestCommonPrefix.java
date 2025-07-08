// Last updated: 7/8/2025, 3:48:47 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result = ""; 
        int maxLength = Integer.MAX_VALUE; 
        boolean prefix = true; 

        if(strs.length == 1)
            return strs[0]; 

        for(int i = 0; i < strs.length; i++) {
            maxLength = Math.min(strs[i].length(), maxLength);
        }

        if(maxLength == 0) 
            return result; 

        for(int j = 0; j <= maxLength; j++) {
            
            // "abc", "abcd"    maxLength = 3
            
            for(int i = 1; i < strs.length; i++) {
                String compare = strs[0].substring(0, j); 

                System.out.println(compare + "    " + strs[i].substring(0, j));

                if(!strs[i].substring(0, j).equals(compare)) {
                    prefix = false; 
                    return result; 
                }

                if(prefix && i == strs.length - 1)
                    result = compare; 
            }
        }

        return result; 
    }
}