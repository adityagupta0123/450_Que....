class Solution
{   
	static int findLongestConseqSubseq(int arr[], int n)
	{
	    Arrays.sort(arr);

        int max=0;
        int cnt=0;
 
        for(int i=0;i<n-1;i++) {

            if(arr[i+1]==1+arr[i]) {
                cnt++;
                
                if(max<cnt)
                  max=cnt;
            }

            else if(arr[i+1]!=arr[i])
                cnt=0;

        }

    return max+1;

 }

}
