package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

/**
 * @Description 给你一个链表的头节点 head ，旋转链表，将链表每个节点向右移动 k 个位置。
 * @Link
 * @Author rickypeng
 * @Date 2021/8/15
 */
public class Leetcode61 {

    /**
     * 旋转链表
     * @param head
     * @param k
     * @return
     */
    public ListNode rotateRight(ListNode head, int k) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        if (len == 0 || len == 1) {
            return head;
        }
        k = k % len;
        if(k == 0) {
            return head;
        }
        ListNode start = head;
        ListNode end = head;
        ListNode res = null;
        while(end.next != null) {
            if (k <= 0) {
                start = start.next;
            }
            end = end.next;
            k--;
        }
        res = start.next;
        start.next = null;
        end.next = head;
        return res;
    }
}
