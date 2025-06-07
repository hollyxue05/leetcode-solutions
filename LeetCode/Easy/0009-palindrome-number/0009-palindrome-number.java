import java.util.LinkedList;
import java.util.Stack;
import java.util.Queue;

class Solution {
    public boolean isPalindrome(int x) {
        String s = String.valueOf(x);

        // Stack<Character> stack = new Stack<>();
        // Queue<Character> queue = new LinkedList<>();

        // int c1, c2;

        // for(int i = 0; i < s.length(); i++) {
        //     stack.push(s.charAt(i));
        //     queue.add(s.charAt(i));
        // }

        // while(!queue.isEmpty()) {
        //     c1 = stack.pop();
        //     c2 = queue.remove(); 
        //     if(!(c1==c2))   return false;
        // }

        // return true;

        for (int i=0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length()-i-1))     return false;
        }

        return true; 
    }
}