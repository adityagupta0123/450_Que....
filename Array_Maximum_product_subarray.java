class Solution {
    // Function to find maximum product subarray
    long maxProduct(int[] arr, int n) {
          long curr=1;

          long last=1;
          long max= Integer.MIN_VALUE;

        for(int i=0;i<n;i++){

            curr*=arr[i];

            last*=arr[n-i-1];

            max=Math.max(max,Math.max(curr,last));

            if(curr==0) curr=1;

            if(last==0) last=1;

        }

      return max;
    }
}
