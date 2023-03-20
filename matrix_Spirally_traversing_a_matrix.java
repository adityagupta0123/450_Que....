
class Solution
{
   static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c){
     int row=matrix.length;
     int col=matrix[0].length;
     int count=0;
     int total=row*col;
     int  startRow=0;
     int startCol=0;
     int endRow=row-1;
     int endCol=col-1;
     ArrayList<Integer> al = new ArrayList<>();

      while(count<total){
          // top boun...
        for(int i=startCol; count<total && i<=endCol; i++) {
          al.add(matrix[startRow][i]);
          count++;
        }
        startRow++;

        // right bound....
        for(int i=startRow; count<total && i<=endRow; i++){
            al.add(matrix[i][endCol]);
            count++;
        }
        endCol--;
        //bottom boundary
        for(int i=endCol; count<total && i>=startCol; i--){
            al.add(matrix[endRow][i]);
            count++;
        }
        endRow--;
        // left boundary
        for(int i=endRow; count<total && i>=startRow; i--){
            al.add(matrix[i][startCol]);
            count++;
        }
        startCol++;
      }

      return al;

    }

}
