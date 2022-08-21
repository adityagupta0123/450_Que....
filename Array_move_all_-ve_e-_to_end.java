class Solution {
    
    public void segregateElements(int arr[], int n)
    {
       int ar[] = new int[n];
       int count =0;
       int j =0;
       for(int i=0; i< n; i++){
           
           if(arr[i] >=0){
               ar[j] = arr[i];
               j++;
               count++;
           }
       }
       j =count;
       for(int i=0;  i<n ; i++){
           if(arr[i] < 0){
               ar[j] = arr[i];
               j++;
           }
       }
        for(int i=0; i< n; i++)
            arr[i] =ar[i];
       
    }
}
