// dp solution imp
class Solution {
    int isPalindrome(String S) {
        int n = S.length() - 1 ;
	    String  ans = "";
	    for(int i = n ; i >= 0; i--)
	    {
	        ans += S.charAt(i);
	    }
	    if(ans.equals(S))
	        return 1;
	    else
	        return 0;
    }
};
