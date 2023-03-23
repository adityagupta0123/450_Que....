class Solution {
    public int maxArea(int M[][], int n, int m) {
        int[] heights = new int[m];
        for(int i = 0; i < m; i++){
            if(M[0][i] == 1)    heights[i] = 1;
        }
        int maxArea = maxAreaHistogram(heights);
        
        for(int i = 1; i < n; i++){
            for(int j = 0; j < m; j++){
                if(M[i][j] == 1){
                    heights[j] += 1;
                }else{
                    heights[j] = 0;
                }
            }
            maxArea = Math.max(maxArea, maxAreaHistogram(heights));
        }
        return maxArea;
    }
    
    public int maxAreaHistogram(int[] heights){
        int n = heights.length;
        int maxArea = 0;
        Stack<Integer> st = new Stack<>();
        
        for(int i = 0; i <= n; i++){
            int currHeight = i == n ? 0 : heights[i];
            while(!st.isEmpty() && currHeight < heights[st.peek()]){
                int top = st.pop();
                int width = st.isEmpty() ? i : i - st.peek() - 1;
                int area = heights[top] * width;
                maxArea = Math.max(area, maxArea);
            }
            st.push(i);
        }
        return maxArea;
    }
}
