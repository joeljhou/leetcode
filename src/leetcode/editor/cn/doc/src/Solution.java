/**
 * 解决方案
 */
public class Solution {

    /**
     * 官方推荐方法二：双指针
     */
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int p1 = 0, p2 = 0;
        int[] sorted = new int[m + n];
        int cur;
        while (p1 < m || p2 < n) {
            if (p1 == m) {
                cur = nums2[p2++];
            } else if (p2 == n) {
                cur = nums1[p1++];
            } else if (nums1[p1] < nums2[p2]) {
                cur = nums1[p1++];
            } else {
                cur = nums2[p2++];
            }
            sorted[p1 + p2 - 1] = cur;
        }

        for (int i = 0; i != m + n; i++) {
            nums1[i] = sorted[i];
        }
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        //[1,2,3,0,0,0]
        //3
        //[2,5,6]
        //3
        solution.merge(new int[]{1, 2, 2, 3, 0, 0, 0}, 4, new int[]{2, 5, 8}, 3);
    }
}
