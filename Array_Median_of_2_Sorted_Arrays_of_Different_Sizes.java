
class GFG 
{ 
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        double res = 0;
        List <Integer> list = new ArrayList<>();
        for(int i = 0 ; i < n ; i++)
            list.add(a[i]);
        for(int j = 0 ; j < m ; j++)
            list.add(b[j]);
         Collections.sort(list);
        if((list.size() & 1) == 1){
            res = list.get(list.size()/2);
        }else{
            int s = list.size();
            res = list.get(s/2) + list.get((s/2)-1);
            res = res/2;
        }
        return res;
    }
}
