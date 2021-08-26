//给定一个整数数组 nums ，找到一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。 
//
// 
//
// 示例 1： 
//
// 
//输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
//输出：6
//解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。
// 
//
// 示例 2： 
//
// 
//输入：nums = [1]
//输出：1
// 
//
// 示例 3： 
//
// 
//输入：nums = [0]
//输出：0
// 
//
// 示例 4： 
//
// 
//输入：nums = [-1]
//输出：-1
// 
//
// 示例 5： 
//
// 
//输入：nums = [-100000]
//输出：-100000
// 
//
// 
//
// 提示： 
//
// 
// 1 <= nums.length <= 3 * 10⁴ 
// -10⁵ <= nums[i] <= 10⁵ 
// 
//
// 
//
// 进阶：如果你已经实现复杂度为 O(n) 的解法，尝试使用更为精妙的 分治法 求解。 
// Related Topics 数组 分治 动态规划 👍 3608 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    /**
     * 个人方法一：贪心
     * 若前面的一个元素大于0，则将其加到当前的元素上
     * 解答成功: 执行耗时:0 ms,击败了100.00% 的Java用户 内存消耗:38.4 MB,击败了31.95% 的Java用户
     */
    public int maxSubArray_my1(int[] nums) {
        int temp = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (temp>0){
                temp = nums[i] + temp;
                nums[i] = temp;
            }else{
                temp = nums[i];
            }
        }
        //从数组中去取最大值
        int maxAns = nums[0];   //假设第一个元素是最大值
        for (int num : nums) {
            maxAns = Math.max(num,maxAns);
        }
        return maxAns;
    }

    /**
     * 优化个人方法一：贪心 ≈ 官方推荐方法一：贪心
     * 解答成功: 执行耗时:1 ms,击败了92.21% 的Java用户 内存消耗:38.4 MB,击败了52.37% 的Java用户
     */
    public int maxSubArray_l1(int[] nums){
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
     * 官方推荐方法二：动态规划
     * 若当前指针元素之前的和小于0，则丢弃当前元素之前的数列
     * 解答成功: 执行耗时:1 ms,击败了92.21% 的Java用户 内存消耗:38.3 MB,击败了56.27% 的Java用户
     */
    public int maxSubArray(int[] nums){
        //从数组中去取最大值
        int maxAns = nums[0];   //假设第一个元素是最大值
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] > 0)
                nums[i] += nums[i-1];

            maxAns =  Math.max(nums[i],maxAns);
        }
        return maxAns;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
