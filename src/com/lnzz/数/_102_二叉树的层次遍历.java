package com.lnzz.数;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * ClassName：_102_二叉树的层次遍历
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/6 16:39
 * @Description:
 */
public class _102_二叉树的层次遍历 {
    /**
     * 给定一个二叉树，返回其按层次遍历的节点值。 （即逐层地，从左到右访问所有节点）。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/binary-tree-level-order-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        int currCount = 1; // 记录当前层的结点数
        int nextCount = 0; // 记录下一层的结点数
        List<Integer> list = new ArrayList<>();

        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            list.add(node.val);
            currCount--;
            if (node.left != null) {
                queue.offer(node.left);
                nextCount++;
            }
            if (node.right != null) {
                queue.offer(node.right);
                nextCount++;
            }
            if (currCount == 0) {
                currCount = nextCount;
                nextCount = 0;
                res.add(list);
                list = new ArrayList<>();
            }
        }
        return res;
    }
}
