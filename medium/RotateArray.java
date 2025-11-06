package medium;

class Solution { /* Time: 1ms Beats: 45.97% */

    public void rotate(int[] nums, int k) {
        if (nums.length == 1 || nums.length == 0 || k == 0)
            return;

        int breakpoint = nums.length - (k % nums.length);
        int temp[] = new int[nums.length];

        for (int i = breakpoint, j = 0; i < temp.length; i++, j++) {
            temp[j] = nums[i];
        }

        for (int i = 0, j = k % nums.length; i < breakpoint; i++, j++) {
            temp[j] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = temp[i];
        }

        temp = null;
    }
}
