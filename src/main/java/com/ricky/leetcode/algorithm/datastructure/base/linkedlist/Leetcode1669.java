package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

/**
 * @Description 给你两个链表 list1 和 list2 ，它们包含的元素分别为 n 个和 m 个。
 * @Link https://leetcode-cn.com/problems/merge-in-between-linked-lists/
 * @Author rickypeng
 * @Date 2021/8/15
 */
public class Leetcode1669 {

    /**
     * @param list1
     * @param a
     * @param b
     * @param list2
     * @return
     */
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        // 判空
        if (list1 == null || list2 == null || a > b) {
            return null;
        }
        ListNode list1StartBefore = list1;
        ListNode list1EndBefore = list1;
        while(b > 0) {
            if (a > 1) {
                if (list1StartBefore.next != null) {
                    list1StartBefore = list1StartBefore.next;
                }
            }

            if (list1EndBefore.next != null) {
                list1EndBefore = list1EndBefore.next;
            }
            a--;
            b--;
        }
        ListNode list2EndBefore = list2;
        while (list2EndBefore.next != null) {
            list2EndBefore = list2EndBefore.next;
        }
        list1StartBefore.next = list2;
        list2EndBefore.next = list1EndBefore.next;
        return list1;
    }

}
