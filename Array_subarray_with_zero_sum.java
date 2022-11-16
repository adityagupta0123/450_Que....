class Solution{
    //Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[],int n)
    {
       int sum = 0;

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(sum, 1);

        for(int i = 0; i < arr.length; i++){

            sum += arr[i];

            if(map.containsKey(sum)) return true;

            

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return false;
    }
}
