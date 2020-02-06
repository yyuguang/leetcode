package com.lnzz.数;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName：_144_二叉树的前序遍历
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/6 16:22
 * @Description:
 */
public class _144_二叉树的前序遍历 {
    /**
     * 给定一个二叉树，返回它的 前序 遍历。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-preorder-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<Integer> preorderTraversal(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        List<Integer> left = preorderTraversal(root.left);
        List<Integer> right = preorderTraversal(root.right);
        List<Integer> list = new ArrayList<>();
        list.add(root.val);
        list.addAll(left);
        list.addAll(right);
        return list;
    }
}
