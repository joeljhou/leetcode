//给你一个 32 位的有符号整数 x ，返回将 x 中的数字部分反转后的结果。 
//
// 如果反转后整数超过 32 位的有符号整数的范围 [−2³¹, 231 − 1] ，就返回 0。 
//假设环境不允许存储 64 位整数（有符号或无符号）。
//
// 
//
// 示例 1： 
//
// 
//输入：x = 123
//输出：321
// 
//
// 示例 2： 
//
// 
//输入：x = -123
//输出：-321
// 
//
// 示例 3： 
//
// 
//输入：x = 120
//输出：21
// 
//
// 示例 4： 
//
// 
//输入：x = 0
//输出：0
// 
//
// 
//
// 提示： 
//
// 
// -2³¹ <= x <= 2³¹ - 1 
// 
// Related Topics 数学 👍 3221 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    public int reverse(int x) {
        int res = 0;
        while (x != 0) {
            //每次取末尾数字
            int pop = x % 10;
            //超过32位的有符号整数的范围 [−2^231, 2^231−1]就返回0。
            //[-2147483648,2147483647]
            //判断是否 小于 最小32位整数
            if (res < -214748364 || (res == -214748364 && pop > 8)) {
                return 0;
            }
            //判断是否 大于 最大32位整数
            if (res > 214748364 || (res == 214748364 && pop > 7)) {
                return 0;
            }
            res = res * 10 + pop;
            x = x / 10;
        }
        return res;
    }
}

//leetcode submit region end(Prohibit modification and deletion)
