import java.util.* ;
import java.io.*; 

public class Solution {
	public static int[] wavePrint(int arr[][], int nRows, int mCols) {
		int ar[] = new int[nRows*mCols];
		int k = 0;
		for(int j = 0; j < mCols; j++){
			if( (j & 1) != 1 ){
				for(int i =0; i< nRows; i++){
                   ar[k++] = arr[i][j];
				}
			} else{
				for(int ii =nRows - 1; ii >= 0; ii--){
					ar[k++] = arr[ii][j];
				}
			}
		}
		return ar;
	}
}
