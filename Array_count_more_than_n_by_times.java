class Solution 
{
    //Function to find all elements in array that appear more than n/k times.
    public int countOccurence(int[] arr, int n, int k) 
    {
        Map<Integer, Integer> hm = new HashMap <>();
        int count = 0;
        for(int i = 0; i < n; i++) {
            if(hm.containsKey(arr[i])) 
                hm.put(arr[i], hm.get(arr[i]) + 1);
            else 
                hm.put(arr[i], 1);
        }

        for(Map.Entry<Integer,Integer> entry : hm.entrySet())
            if(entry.getValue() > (n/k)) 
                count++;

        return count;

    }


}
