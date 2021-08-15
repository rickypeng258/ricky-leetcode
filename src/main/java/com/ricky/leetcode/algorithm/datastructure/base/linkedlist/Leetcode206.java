package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

/**
 * @Description 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
 * @Link https://leetcode-cn.com/problems/reverse-linked-list/
 * @Author rickypeng
 * @Date 2021/8/15
 */
public class Leetcode206 {
    public ListNode reverseList(ListNode head) {

        ListNode pre = null;
        ListNode cur = head;
        ListNode tmp = null;
        while(cur!=null) {
            //记录当前节点的下一个节点
            tmp = cur.next;
            //然后将当前节点指向pre
            cur.next = pre;
            //pre和cur节点都前进一位
            pre = cur;
            cur = tmp;
        }
        return pre;

    }
}
