class Solution {
    void rearrange(int arr[], int n) {
        Queue<Integer> pos = new LinkedList <>();

        Queue<Integer> neg = new LinkedList <>();

        for(int i = 0; i < n; i++) {

            if(arr[i] >= 0)
                pos.add(arr[i]);
            else 
                neg.add(arr[i]);

        }

        for(int i = 0; i < n; i++) {

            if((i & 1) != 1) {

                if(!pos.isEmpty())

                    arr[i] = pos.remove();

                else 
                    arr[i] = neg.remove();
            } else {

                if(!neg.isEmpty()) 
                    arr[i] = neg.remove();
                else 
                    arr[i] = pos.remove();
            }
        }
    }
}
