package com.lnzz.数;

/**
 * ClassName：_700_二叉搜索树中的搜索
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/2/9 17:00
 * @Description:
 */
public class _700_二叉搜索树中的搜索 {
    /**
     * 给定二叉搜索树（BST）的根节点和一个值。 你需要在BST中找到节点值等于给定值的节点。 返回以该节点为根的子树。
     * 如果节点不存在，则返回 NULL。
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/search-in-a-binary-search-tree
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public TreeNode searchBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return root;
        } else if (root.val < val) {
            return searchBST(root.right, val);
        } else {
            return searchBST(root.left, val);
        }
    }
}
