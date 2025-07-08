// Last updated: 7/8/2025, 4:00:27 PM
class Solution {
    public String longestCommonPrefix(String[] strs) {
        String result  = ""; 

        Arrays.sort(strs); 
        String first = strs[0]; 
        String last = strs[strs.length - 1];

        System.out.println(first + ", " + last);

        int index = 0; 
        while(index < first.length() && index < last.length()) {
            if(first.charAt(index) != last.charAt(index)) 
                break; 
            index++; 
        }

        return first.substring(0, index); 
    }
}