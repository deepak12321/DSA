/*
 *Problem Link :- https://leetcode.com/problems/remove-duplicates-from-sorted-array/ 
 * 
 */

class Solution {
    public int removeDuplicates(int[] nums) {
        int previousValue = nums[0], next = 1, uniqueCount = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != previousValue) {
                nums[next++] = nums[i];
                previousValue = nums[i];
                uniqueCount += 1;
            }
        }
        return uniqueCount;

    }
}