class Solution {
    public int findDuplicate(int[] nums) {
        // while (nums[0] != nums[nums[0]]) {
        //     int nxt = nums[nums[0]];
        //     nums[nums[0]] = nums[0];
        //     nums[0] = nxt;
        // }
        // return nums[0];
        
        // using Linked list cycle
        //1 -> 3-> 2 <=> 4 
        
         int slow = nums[0];
         int fast = nums[0];
        do{
            slow = nums[slow];
            fast = nums[nums[fast]];
        }while(slow != fast);
        
        fast = nums[0];
        while(slow != fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
        
         
    }
}
