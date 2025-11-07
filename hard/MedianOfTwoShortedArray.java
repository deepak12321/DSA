package hard;

// problem link :- https://leetcode.com/problems/median-of-two-sorted-arrays/description/

public class MedianOfTwoShortedArray {

}

class Solution { // 2ms Beats 50.11

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] temp = new int[nums1.length + nums2.length];

        int i = 0, j = 0, k = 0;

        while (i != nums1.length && j != nums2.length) {

            if (nums1[i] < nums2[j]) {
                temp[k++] = nums1[i++];
            } else if (nums2[j] < nums1[i]) {
                temp[k++] = nums2[j++];
            } else {
                temp[k++] = nums1[i++];
                temp[k++] = nums2[j++];
            }

        }

        while (i != nums1.length) {
            temp[k++] = nums1[i++];
        }

        while (j != nums2.length) {
            temp[k++] = nums2[j++];
        }

        return calculateMedian(temp);

    }

    public double calculateMedian(int[] arr) {
        if (arr.length % 2 != 0) {
            return arr[arr.length / 2];
        }

        return (arr[(arr.length / 2) - 1] + arr[arr.length / 2]) / 2.0;

    }
}
