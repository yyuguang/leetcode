package com.lnzz.链表;

import java.util.HashSet;
import java.util.Set;

/**
 * ClassName：_141_环形链表
 *
 * @author 冷暖自知
 * @version 1.0
 * @date 2020/1/31 14:27
 * @Description:
 */
public class _141_环形链表 {

    /**
     * 给定一个链表，判断链表中是否有环。
     * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。
     * 如果 pos 是 -1，则在该链表中没有环。
     * <p>
     * 进阶：
     * 你能用 O(1)（即，常量）内存解决此问题吗？
     * <p>
     * 来源：力扣（LeetCode）
     * 链接：https://leetcode-cn.com/problems/linked-list-cycle
     * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
     */
    public boolean hasCycle(ListNode head) {
        Set<ListNode> nodesSeen = new HashSet<ListNode>();
        while (head != null) {
            if (nodesSeen.contains(head)) {
                return true;
            } else {
                nodesSeen.add(head);
            }
            head = head.next;
        }
        return false;
    }
}
