package com.lnzz.斐波那契数;

/**
 * ClassName：_509_斐波那契数
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/31 12:02
 * @Description:
 */
public class _509_斐波那契数 {
    /**
     * 斐波那契数，通常用 F(n) 表示，形成的序列称为斐波那契数列。该数列由 0 和 1 开始，后面的每一项数字都是前面两项数字的和。也就是：
     * F(0) = 0,   F(1) = 1
     * F(N) = F(N - 1) + F(N - 2), 其中 N > 1.
     * 给定 N，计算 F(N)。
     * <p>
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/fibonacci-number
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int fib(int N) {
        if (N <= 1)
            return N;
        int first = 0;
        int second = 1;
        for (int i = 0; i < N - 1; i++) {
            int sum = first + second;
            first = second;
            second = sum;
        }
        return second;
    }
}
