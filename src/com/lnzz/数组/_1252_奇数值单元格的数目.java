package com.lnzz.数组;

/**
 * ClassName：_1252_奇数值单元格的数目
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/5 14:59
 * @Description:
 */
public class _1252_奇数值单元格的数目 {
    /**
     * 给你一个 n 行 m 列的矩阵，最开始的时候，每个单元格中的值都是 0。
     * 另有一个索引数组 indices，indices[i] = [ri, ci] 中的 ri 和 ci 分别表示指定的行和列（从 0 开始编号）。
     * 你需要将每对 [ri, ci] 指定的行和列上的所有单元格的值加 1。
     * 请你在执行完所有 indices 指定的增量操作后，返回矩阵中 「奇数值单元格」 的数目。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/cells-with-odd-values-in-a-matrix
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int oddCells(int n, int m, int[][] indices) {
        int[] row = new int[n];
        int[] col = new int[m];
        int rowCnt = 0, colCnt = 0;
        for (int[] it : indices) {
            row[it[0]] ^= 1;
            col[it[1]] ^= 1;
            rowCnt += row[it[0]] == 1 ? 1 : -1;
            colCnt += col[it[1]] == 1 ? 1 : -1;
        }
        return m * rowCnt + n * colCnt - rowCnt * colCnt * 2;
    }
}
