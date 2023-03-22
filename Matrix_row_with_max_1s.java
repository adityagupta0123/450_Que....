class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        int i = 0,   j = m - 1 ,   max1row= 0;
        while(i < n && j >= 0){
            if(arr[i][j] == 0) i++;
            else{
                max1row = i;
                j--;
            }
        }
        if(j == m -1) return -1;
        else return max1row;
    }
}
