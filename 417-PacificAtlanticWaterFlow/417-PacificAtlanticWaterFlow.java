// Last updated: 6/14/2025, 2:24:42 PM
class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        List<List<Integer>> res = new LinkedList<>();

        if(heights == null || heights.length == 0 || heights[0].length == 0){
            return res;
        }

        int n = heights.length, m = heights[0].length;
        boolean[][]atlantic = new boolean[n][m];
        boolean[][]pacific = new boolean[n][m];
        
        for(int i=0; i<n; i++){
            dfs(heights, pacific, Integer.MIN_VALUE, i, 0);
            dfs(heights, atlantic, Integer.MIN_VALUE, i, m-1);
        }

        for(int j=0; j<m; j++){
            dfs(heights, pacific, Integer.MIN_VALUE, 0, j);
            dfs(heights, atlantic, Integer.MIN_VALUE, n-1, j);
        }

        for (int i = 0; i < n; i++) 
            for (int j = 0; j < m; j++) 
                if (pacific[i][j] && atlantic[i][j]) 
                    res.add(Arrays.asList(i, j));

        return res;
    }

    int[][]dir = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

    public void dfs(int[][]matrix, boolean[][]visited, int height, int x, int y){
        int n = matrix.length, m = matrix[0].length;
        if(x<0 || x>=n || y<0 || y>=m || visited[x][y] || matrix[x][y] < height)
            return;
        visited[x][y] = true;
        for(int[]d : dir){
            dfs(matrix, visited, matrix[x][y], x + d[0], y + d[1]);
        }
    }
}