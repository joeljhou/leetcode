//给定一个整数数组，判断是否存在重复元素。 
//
// 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。 
//
// 
//
// 示例 1: 
//
// 
//输入: [1,2,3,1]
//输出: true 
//
// 示例 2: 
//
// 
//输入: [1,2,3,4]
//输出: false 
//
// 示例 3: 
//
// 
//输入: [1,1,1,3,3,4,3,2,4,2]
//输出: true 
// Related Topics 数组 哈希表 排序 👍 457 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {

    /**
     * 官方推荐方法二：哈希表
     * 解答成功: 执行耗时:4 ms,击败了82.66% 的Java用户 内存消耗:42.3 MB,击败了60.19% 的Java用户
     * 时间复杂度：O(N)，其中 N 为数组的长度
     * 空间复杂度：O(N)，其中 N 为数组的长度
     */
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums) {
            if (!set.add(num)) {
                return true;
            }
        }
        return false;
    }

    /**
     * 官方推荐方法一：排序
     * 解答成功: 执行耗时:4 ms,击败了82.66% 的Java用户 内存消耗:41.7 MB,击败了70.82% 的Java用户
     * 时间复杂度：O(NlogN)，其中 N 为数组的长度。需要对数组进行排序。
     * 空间复杂度：O(logN)，其中 N 为数组的长度。注意我们在这里应当考虑递归调用栈的深度
     */
    public boolean containsDuplicate_l1(int[] nums) {
        //排序，从小到大
        Arrays.sort(nums);
        //相邻数据比较，存在相同返回true
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                return true;
            }
        }
        return false;
    }


    /**
     * 个人方法一：利用Set唯一的特性
     * 解答成功: 执行耗时:18 ms,击败了5.68% 的Java用户 内存消耗:41.3 MB,击败了95.35% 的Java用户
     * 时间复杂度：
     * 空间复杂度：
     */
    public boolean containsDuplicate_my1(int[] nums) {
        Set<Integer> set = new TreeSet();
        for (int num : nums) {
            set.add(num);
        }
        return nums.length > set.size();
    }

}
//leetcode submit region end(Prohibit modification and deletion)
