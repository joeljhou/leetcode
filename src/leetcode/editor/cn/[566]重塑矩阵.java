//在 MATLAB 中，有一个非常有用的函数 reshape ，它可以将一个 m x n 矩阵重塑为另一个大小不同（r x c）的新矩阵，但保留其原始数据。 
//
//
// 给你一个由二维数组 mat 表示的 m x n 矩阵，以及两个正整数 r 和 c ，分别表示想要的重构的矩阵的行数和列数。 
//
// 重构后的矩阵需要将原始矩阵的所有元素以相同的 行遍历顺序 填充。 
//
// 如果具有给定参数的 reshape 操作是可行且合理的，则输出新的重塑矩阵；否则，输出原始矩阵。 
//
// 
//
// 示例 1： 
//
// 
//输入：mat = [[1,2],[3,4]], r = 1, c = 4
//输出：[[1,2,3,4]]
// 
//
// 示例 2： 
//
// 
//输入：mat = [[1,2],[3,4]], r = 2, c = 4
//输出：[[1,2],[3,4]]
// 
//
// 
//
// 提示： 
//
// 
// m == mat.length 
// n == mat[i].length 
// 1 <= m, n <= 100 
// -1000 <= mat[i][j] <= 1000 
// 1 <= r, c <= 300 
// 
// Related Topics 数组 矩阵 模拟 👍 232 👎 0


//leetcode submit region begin(Prohibit modification and deletion)
class Solution {
    /**
     * 官方推荐方法一：二维数组的一维表示
     * 解答成功: 执行耗时:0 ms,击败了100.00% 的Java用户 内存消耗:39.3 MB,击败了47.22% 的Java用户
     */
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        int m = mat.length;       //获取矩阵的行数
        int n = mat[0].length;    //获取矩阵的列数
        if (m * n != r * c) {     //数据量不一致，无法转换
            return mat;
        }

        //定义一个一维数组存储矩阵数据
        int[][] ans = new int[r][c];

        //遍历矩阵
        for (int i = 0; i < m * n; i++) {
            ans[i / c][i % c] = mat[i / n][i % n];
        }
        return ans;
    }
}
//leetcode submit region end(Prohibit modification and deletion)
