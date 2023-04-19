

class Solution
{
    //Function to return list containing vertices in Topological order. 
    static int[] topoSort(int V, ArrayList<ArrayList<Integer>> adj) 
    {
        int arr[] = new int[V];
        boolean vis[] = new boolean[V];
        Stack<Integer> s = new Stack<>();
        
        for(int i = 0; i< V; i++){
            if(!vis[i]){
                topSortUtil(adj, i, vis, s);
            }
        }
        int j = 0;
        while(!s.isEmpty()){
            arr[j++] = s.pop();
        }
        return arr;
    }
    
    static void topSortUtil(ArrayList<ArrayList<Integer>> graph, int cur, boolean []vis, Stack<Integer> s){
        vis[cur] = true;
        for(int i=0; i < graph.get(cur).size(); i++){
            int e = graph.get(cur).get(i);
            if(!vis[e]){
                topSortUtil(graph, e, vis, s);
            }
        }
        s.push(cur);
    }
}
