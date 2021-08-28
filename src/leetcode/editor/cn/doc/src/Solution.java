import java.util.Arrays;

/**
 * 解决方案
 */
public class Solution {

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

    public static void main(String[] args) {
        Solution solution = new Solution();
    }

}
