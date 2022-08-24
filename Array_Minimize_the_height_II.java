class Solution {
    int getMinDiff(int arr[], int n, int k) {
       Arrays.sort(arr);
       int ans = arr[n - 1] - arr[0];
       int maxi, mini;

       for (int i = 0; i < n - 1; i++) {
           maxi = Math.max(arr[n - 1] - k, arr[i] + k);
           mini = Math.min(arr[0] + k, arr[i + 1] - k);
           if (mini < 0)
               continue;

           ans = Math.min(ans, maxi - mini);
       }
       return ans;
   }
}
