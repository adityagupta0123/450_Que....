
class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        for(int i =0; i< V; i++){
            if(!vis[i]){
                if(detectCycle_dfs(adj, vis, i, -1)) return true;
            }
        }
        return false;
    }
    
    public boolean detectCycle_dfs(ArrayList<ArrayList<Integer>> graph, boolean vis[], int cur, int parent){
        vis[cur] = true;
        for(int i =0; i< graph.get(cur).size(); i++){
            int e = graph.get(cur).get(i);
            
            //case 1
            if(vis[e] && e != parent)
                return true;
            //case 2 do nothing
            
            //case 3 
            else if(!vis[e]){
                if(detectCycle_dfs(graph, vis, e, cur))
                    return true;
            }
        }
        return false;
    }
}
