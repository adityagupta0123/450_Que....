class Reverse
{
    // Complete the function
    // str: input string
    public static String reverseWord(String str)
    {
      int end = str.length() - 1;
      String ans ="";
      while( end >= 0){
          ans += str.charAt(end);
          end--;
      }
      return ans;
    }
    
}
