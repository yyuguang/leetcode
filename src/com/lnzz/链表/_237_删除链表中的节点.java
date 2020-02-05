package com.lnzz.链表;

/**
 * ClassName：_237_删除链表中的节点
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/31 12:05
 * @Description:
 */
public class _237_删除链表中的节点 {

    /**
     * 请编写一个函数，使其可以删除某个链表中给定的（非末尾）节点，你将只被给定要求被删除的节点。
     *
     * 现有一个链表 -- head = [4,5,1,9]，它可以表示为:
     *
     *
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/delete-node-in-a-linked-list
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */


    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
