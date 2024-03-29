/*Question's example
Example 1:
Input: nums = [1,2,3,1,1,3]
Output: 4
Explanation: There are 4 good pairs (0,3), (0,4), (3,4), (2,5) 0-indexed.
*/

///////////////////////////////////// MY SOLUTION ///////////////////////////////////////////////////////////////////////////
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        for(int i = 0; i <= nums.length-1; i++){
            for(int j = 0; j <= nums.length-1; j++){
                if(nums[i] == nums[j] && i < j){
                    count = count + 1;
                }
            }
        }
        return count;
    }
}
