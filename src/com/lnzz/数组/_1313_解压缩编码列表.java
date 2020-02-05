package com.lnzz.数组;

import java.util.ArrayList;

/**
 * ClassName：_1313_解压缩编码列表
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/4 11:00
 * @Description:
 */
public class _1313_解压缩编码列表 {

    /**
     * 给你一个以行程长度编码压缩的整数列表 nums 。
     * 考虑每对相邻的两个元素 [a, b] = [nums[2*i], nums[2*i+1]] （其中 i >= 0 ），每一对都表示解压后有 a 个值为 b 的元素。
     * 请你返回解压后的列表。
     * <p>
     * 示例：
     * <p>
     * 输入：nums = [1,2,3,4]
     * 输出：[2,4,4,4]
     * 解释：第一对 [1,2] 代表着 2 的出现频次为 1，所以生成数组 [2]。
     * 第二对 [3,4] 代表着 4 的出现频次为 3，所以生成数组 [4,4,4]。
     * 最后将它们串联到一起 [2] + [4,4,4,4] = [2,4,4,4]。
     *  
     * <p>
     * 提示：
     * <p>
     * 2 <= nums.length <= 100
     * nums.length % 2 == 0
     * 1 <= nums[i] <= 100
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/decompress-run-length-encoded-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */

    public int[] decompressRLElist(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < nums.length; i += 2) {
            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
            }
        }

        return list.stream().mapToInt(Integer::valueOf).toArray();
    }
}
