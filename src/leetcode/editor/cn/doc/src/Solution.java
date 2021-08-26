import java.util.Arrays;

/**
 * 解决方案
 */
public class Solution {


    public static void main(String[] args) {
        Solution solution = new Solution();
        int[] nums = new int[]{-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(solution.maxSubArray2(nums));
    }


    /**
     * 方法二：贪心算法
     * 优化：两个循环变成一个循环
     */
    public int maxSubArray_my2(int[] nums) {
        int sum = nums[0];
        int maxAns = nums[0];
        for (int i = 1; i < nums.length; i++) {
            //sum = sum > 0 ? sum + nums[i]  : nums[i];
            sum = Math.max(sum + nums[i],nums[i]);
            maxAns = Math.max(maxAns,sum);
        }
        return maxAns;
    }

    /**
     * 方法一：贪心算法
     */
    public int maxSubArray1(int[] nums) {
        int curr = 0;  //当前值 指针所在位置
        int maxAns = nums[0];
        for (int num : nums) {
            curr = Math.max(curr + num,num);
            maxAns = Math.max(maxAns,curr);
        }
        return maxAns;
    }

    /**
     * 方法二：动态规划
     */
    public int maxSubArray2(int[] nums) {
        //从数组中去取最大值
        int maxAns = nums[0];   //假设第一个元素是最大值
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0){
                nums[i] += nums[i-1];
            }
            maxAns = Math.max(nums[i], maxAns);
        }
        return maxAns;
    }


}
