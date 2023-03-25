import java.util.ArrayList;
import java.util.HashMap;

public class Solution
{
    public static ArrayList<Integer> findCommonElements(ArrayList<ArrayList<Integer>> mat)
    {  int n = mat.size();
        int m = mat.get(0).size();

        // Defining the HashMap to store common elements
        HashMap<Integer, Integer> commonElements = new HashMap<Integer, Integer>();
        
        // Adding the elements of first row to HashMap
        for (int j = 0; j < m; j++){
            commonElements.put(mat.get(0).get(j), 1);
        }
        
        // Iterating through the elements of the matrix
        for (int i = 1; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                // Checking whether the current element is present in all the previously traversed rows
                if (commonElements.get(mat.get(i).get(j)) != null && commonElements.get(mat.get(i).get(j)) == i){
                    commonElements.put(mat.get(i).get(j), i + 1);
                }
            }
        }

        // Defining the output array
        ArrayList<Integer> ans = new ArrayList<Integer>();
        
        // Traversing the HashMap
        for (HashMap.Entry mp : commonElements.entrySet()){
            // Adding all elements that are present in all the matrix rows to the output array
            if ((int)mp.getValue() == n)
                ans.add((int)mp.getKey());
        }
        // Returning the output array
        return ans;
    }
}
