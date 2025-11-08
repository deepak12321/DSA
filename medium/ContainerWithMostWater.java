package medium;

public class ContainerWithMostWater {
    /*
     * Problem Link -
     * https://leetcode.com/problems/container-with-most-water/description/
     *
     * Runtime :5ms
     * Beats :77.89%
     * 
     * Approach - 2 Pointer
     */
}

class Solution {
    public int maxArea(int[] height) {

        int start = 0, end = height.length - 1;

        int maxCapacity = Integer.MIN_VALUE;
        int breadth = height.length - 1;

        while (start < end) {
            int smallerWall = Math.min(height[start], height[end]);
            int currentCapacity = smallerWall * breadth;
            maxCapacity = Math.max(maxCapacity, currentCapacity);
            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
            breadth--;
        }

        return maxCapacity;

    }
}
