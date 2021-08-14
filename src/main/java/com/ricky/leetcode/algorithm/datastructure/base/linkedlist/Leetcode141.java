package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

import java.util.HashSet;
import java.util.Set;

/**
 * @Description 给定一个链表，判断链表中是否有环。
 * @Link https://leetcode-cn.com/problems/linked-list-cycle/submissions/
 * @Author rickypeng
 * @Date 2021/8/14
 */
public class Leetcode141 {

    /**
     * 判断该链表是否有环
     * @param head
     * @return
     */
    public boolean hasCycle(ListNode head) {
        return true;
    }

    /**
     * 解法一 利用哈希表来判断 注意考虑时间复杂度和空间复杂度的问题
     * @param head
     * @return
     */
    public boolean solution1(ListNode head) {
        Set<ListNode> set = new HashSet<ListNode>();
        ListNode cur = head;
        while (cur != null) {
            if (set.contains(cur)) {
                return true;
            }
            set.add(cur);
            cur = cur.next;
        }
        return false;
    }

    /**
     * 解法二 利用快慢指针的方式（推荐）
     * @param head
     * @return
     */
    public boolean solution2(ListNode head) {
        if (head == null || head.next == null) {
            return false;
        }
        ListNode fast = head.next.next;
        ListNode slow = head;
        while (fast != null) {
            if (fast == slow) {
                return true;
            }
            if (fast.next == null) {
                return false;
            }
            fast = fast.next.next;
            slow = slow.next;
        }
        return false;
    }
}
