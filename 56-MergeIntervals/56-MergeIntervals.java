// Last updated: 6/10/2025, 9:28:39 PM
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0])); 
        
        List<int[]> result = new ArrayList<>();
		int[] newInterval = intervals[0];
        
		result.add(newInterval);
		for (int[] interval : intervals) {
			if (interval[0] <= newInterval[1]) 
				newInterval[1] = Math.max(newInterval[1], interval[1]);
			else {                             
				newInterval = interval;
				result.add(newInterval);
			}
		}

		return result.toArray(new int[result.size()][]);
    }
}