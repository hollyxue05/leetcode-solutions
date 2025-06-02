class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int currIndex = 0; 
        int currLen = 0;
        int tempLen = 0; 
        int maxLen = 0; 

        while (currIndex < s.length()) {
            //hashmap already contains the current letter (repeat letter, BAD)
            if(map.containsKey(s.charAt(currIndex))) {
                currLen = Math.max(currLen, map.get(s.charAt(currIndex)) + 1);
            }

            //hashmap does not contain the current letter (new letter, add and keep going)
            tempLen = currIndex - currLen + 1; 
            maxLen = Math.max(tempLen, maxLen); 
            map.put(s.charAt(currIndex), currIndex);
            currIndex++; 
        }

        return maxLen; 
    }
}