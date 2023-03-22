class Solution {
   int median(int matrix[][], int R, int C) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<R; i++){
            for(int j=0; j<C; j++){
                list.add(matrix[i][j]);
            }
        }
        Collections.sort(list);
        return list.get(((list.size()+1)/2)-1);
    }
    
}
