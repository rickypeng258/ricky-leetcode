package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

/**
 * @Description 删除链表的倒数第 N 个结点
 * @Link https://leetcode-cn.com/problems/remove-nth-node-from-end-of-list/
 * @Author rickypeng
 * @Date 2021/8/15
 */
public class Leetcode19 {

    /**
     * 利用双指针法
     * @param head
     * @param n
     * @return
     */
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null || n == 0) {
            return head;
        }
        ListNode res = new ListNode(0);
        res.next = head;
        ListNode start = res;
        ListNode end = head;
        while (end.next != null) {
            if (n <= 1) {
                start = start.next;
            }
            end = end.next;
            n--;
        }
        if(start.next != null) {
            start.next = start.next.next;
        }
        return res.next;
    }
}
