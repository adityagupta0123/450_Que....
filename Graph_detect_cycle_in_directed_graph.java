
class Solution {
    // Function to detect cycle in a directed graph.
    public boolean isCyclic(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[adj.size()];
        boolean stack[] = new boolean[adj.size()];
        
        for(int i = 0; i< adj.size(); i++){
            if(!vis[i]){
                if(isCyclicUtil(adj , i , vis, stack)){
                    return true;
                }
            }
        }
        return false;
    }
    public boolean isCyclicUtil(ArrayList<ArrayList<Integer>> graph, int cur, boolean vis[], boolean []stack){
        vis[cur] = true;
        stack[cur] = true;
        
        for(int i =0; i< graph.get(cur).size(); i++){
            int e = graph.get(cur).get(i);
            if(stack[e])
                return true;
            else if (!vis[e] && isCyclicUtil(graph, e, vis, stack)){
                return true;
            }
        }
        stack[cur] = false;
        
        return false;
    }
}
