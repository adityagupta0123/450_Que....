
class Solution{

    // arr: input array
    // n: size of array
    //Function to find the sum of contiguous subarray with maximum sum.
    long maxSubarraySum(int a[], int n){
         int max = a[0];
         int curr_max = a[0];
         for (int i = 1; i < n; i++){
           curr_max = Math.max(a[i], curr_max+a[i]);
           max = Math.max(max, curr_max);
          }
        return max;
    }
    
}
