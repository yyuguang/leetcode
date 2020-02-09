package com.lnzz.数;

import java.util.ArrayList;
import java.util.List;

/**
 * ClassName：_590_N叉树的后序遍历
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/9 17:18
 * @Description:
 */
public class _590_N叉树的后序遍历 {
    /**
     * 给定一个 N 叉树，返回其节点值的后序遍历。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/n-ary-tree-postorder-traversal
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public List<Integer> res = new ArrayList<>();

    public List<Integer> postorder(Node root) {
        result(root);
        return res;
    }

    private void result(Node root) {
        if (root == null) {
            return;
        }
        for (int i = 0; i < root.children.size(); i++) {
            postorder(root.children.get(i));
        }
        res.add(root.val);
    }
}
