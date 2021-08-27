import java.util.Arrays;

/**
 * 解决方案
 */
public class Solution {

    /**
     * 官方推荐方法二：排序 + 双指针
     */
    public int[] intersect(int[] nums1, int[] nums2) {
        //排序
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int length1 = nums1.length, length2 = nums2.length;
        int[] intersection = new int[Math.min(length1, length2)];
        //定义双指针
        int index1 = 0, index2 = 0, index = 0;
        while (index1 < length1 && index2 < length2) {
            //比较两个数组中的数字,将指向较小数字的指针右移一位
            if (nums1[index1] < nums2[index2]) {
                index1++;
            } else if (nums2[index2] < nums1[index1]) {
                index2++;
            } else {
                //如果两个数字相等，将该数字添加到答案,指针都右移一位
                intersection[index++] = nums1[index1];
                index1++;
                index2++;
            }
        }
        return Arrays.copyOfRange(intersection, 0, index);
    }


    public static void main(String[] args) {
        Solution solution = new Solution();


    }

}
