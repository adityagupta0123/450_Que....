
class Solution
{
    public static void sort012(int a[], int n)
    {
        int l = 0, r = n -1, m =0 ;
        while( m <= r){
            if( a[m] == 0){
                swap(a, m, l );
                m++;
                l++;
            }
            else if (a[m] == 2){
                swap(a, m, r );
                r--;
            }else
                m++;
        }
    }
    private static void swap(int a[], int m, int n){
        int temp = a[m];
        a[m] = a[n];
        a[n] = temp;
    }
}
