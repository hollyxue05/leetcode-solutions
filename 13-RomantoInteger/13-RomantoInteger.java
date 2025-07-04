// Last updated: 7/3/2025, 11:10:23 PM
class Solution {
    public int romanToInt(String s) {
        int result = 0;
        
        for (int i = 0; i < s.length(); i++) {
            int curr = getValue(s.charAt(i));
            if (i < s.length() - 1 && curr < getValue(s.charAt(i + 1))) {
                result -= curr;
            } else {
                result += curr;
            }
        }
        
        return result;
    }

    private int getValue(char c) {
        switch(c) {
            case 'I': return 1; 
            case 'V': return 5; 
            case 'X': return 10; 
            case 'L': return 50; 
            case 'C': return 100; 
            case 'D': return 500; 
            case 'M': return 1000; 
        }

        return 0;
    }
}