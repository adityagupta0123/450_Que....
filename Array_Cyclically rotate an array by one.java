class Compute {
    public void rotate(int arr[], int n)
    {
        for(int i=1; i<n ; i++){
            int temp = arr[n-i];
            arr[n-i] =arr[n-i-1];
            arr[n-i-1] = temp;
        }
    } 

}
 
