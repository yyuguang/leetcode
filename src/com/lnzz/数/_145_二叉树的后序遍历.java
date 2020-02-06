package com.lnzz.数;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName：_145_二叉树的后序遍历
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/6 16:36
 * @Description:
 */
public class _145_二叉树的后序遍历 {
    /**
     * 给定一个二叉树，返回它的 后序 遍历。
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-postorder-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<Integer> postorderTraversal(TreeNode root) {
        if (root==null){
            return new ArrayList<>();
        }
        List<Integer> left = postorderTraversal(root.left);
        List<Integer> right = postorderTraversal(root.right);
        List<Integer> list = new ArrayList<>();
        list.addAll(left);
        list.addAll(right);
        list.add(root.val);
        return list;
    }
}
