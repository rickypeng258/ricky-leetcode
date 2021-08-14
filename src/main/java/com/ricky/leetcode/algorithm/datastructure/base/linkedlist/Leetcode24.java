package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

/**
 * @Description 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 * @Link https://leetcode-cn.com/problems/swap-nodes-in-pairs/
 * @Author rickypeng
 * @Date 2021/8/14
 */
public class Leetcode24 {

    /**
     * 链表问题一般解决思路考虑双指针
     * @param head
     * @return
     */
    public ListNode swapPairs(ListNode head) {

        ListNode dummyHead = new ListNode(0);
        dummyHead.next = head;
        ListNode temp = dummyHead;
        while (temp.next != null && temp.next.next != null) {
            ListNode node1 = temp.next;
            ListNode node2 = temp.next.next;
            temp.next = node2;
            node1.next = node2.next;
            node2.next = node1;
            temp = node1;
        }
        return dummyHead.next;
    }
}
