package com.lnzz.数;

/**
 * ClassName：_110_平衡二叉树
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/9 16:49
 * @Description:
 */
public class _110_平衡二叉树 {

    /**
     * 给定一个二叉树，判断它是否是高度平衡的二叉树。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/balanced-binary-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        return determine(root) >= 0 ? true : false;
    }

    private int determine(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int left = determine(root.left);
        int right = determine(root.right);

        if (left < 0 || right < 0 || Math.abs(left - right) > 1) {
            return -1;
        }

        return Math.max(left, right) + 1;
    }
}
