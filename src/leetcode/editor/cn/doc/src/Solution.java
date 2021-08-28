import java.util.ArrayList;
import java.util.List;

/**
 * 解决方案
 */
public class Solution {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < i + 1; j++) {
                if (i == 0 || j==0 || i == j) {
                    row.add(1);
                } else {
                    row.add(ret.get(i-1).get(j - 1) + ret.get(i-1).get(j));
                }
            }
            ret.add(row);
        }
        return ret;
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generate(5));
    }

}
