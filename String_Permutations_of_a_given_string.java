
class Solution {
    List<String> ll = new LinkedList<>();
    public List<String> find_permutation(String s) {
       helper(s , "");
       Collections.sort(ll);
       return ll;
    }
    public List<String> helper(String s , String as){
        int n = s.length();
        if( s.length() == 0 && !ll.contains(as) ){
            ll.add(as);
        }else {
            for(int i = 0; i < s.length(); i++){
              char ch = s.charAt(i);
              String ls = s.substring(0, i);
              String rs = s.substring(i + 1);
            
              String req = ls+ rs;
              String ans = as + ch;
              helper(req, ans);
           }
        }
        
        return ll;
    }
}
