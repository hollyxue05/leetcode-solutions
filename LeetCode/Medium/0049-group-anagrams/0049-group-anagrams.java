class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, Integer> mp = new HashMap<>();
        List<List<String>> result  = new ArrayList<>();

        char[] chars; 
        String sortedStr; 

        for(String str : strs) {    
            chars = str.toCharArray();       
            Arrays.sort(chars);     
            sortedStr = new String(chars);   
            
            if(mp.containsKey(sortedStr)) 
                result.get(mp.get(sortedStr)).add(str);
            
            else {
                mp.put(sortedStr, result.size());
                result.add(new ArrayList<>(Arrays.asList(str)));
            }
        }   

        return result; 
    }
}