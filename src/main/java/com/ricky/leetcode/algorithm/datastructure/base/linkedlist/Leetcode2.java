package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

/**
 * @Description
 * 给你两个 非空 的链表，表示两个非负的整数。它们每位数字都是按照 逆序 的方式存储的，并且每个节点只能存储 一位 数字。
 * 请你将两个数相加，并以相同形式返回一个表示和的链表。
 * 你可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * @Link https://leetcode-cn.com/problems/add-two-numbers/
 * @Author rickypeng
 * @Date 2021/5/20
 */
public class Leetcode2 {


    public static void main(String[] args) {
        ListNode fl0 = new ListNode(2);
        ListNode fl1 = new ListNode(4);
        fl0.next = fl1;
        ListNode fl2 = new ListNode(3);
        fl1.next = fl2;

        ListNode sl0 = new ListNode(5);
        ListNode sl1 = new ListNode(6);
        sl0.next = sl1;
        ListNode sl2 = new ListNode(4);
        sl1.next = sl2;
        Leetcode2 leetcode2 = new Leetcode2();
        leetcode2.addTwoNumbers(fl0, sl0);
    }

    /**
     *
     * @param l1
     * @param l2
     * @return
     */
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode c1 = l1;
        ListNode c2 = l2;
        ListNode res = new ListNode(0);
        ListNode cur = res;
        int tmp = 0;
        while(c1 != null || c2 != null) {
            int sum = 0;
            if(c1 == null) {
                sum = tmp + c2.val;
                c2 = c2.next;
            }else if(c2 == null) {
                sum = c1.val + tmp;
                c1 = c1.next;
            }else {
                sum = c1.val + tmp + c2.val;
                c1 = c1.next;
                c2 = c2.next;
            }

            cur.next= sum >= 10 ? new ListNode(sum%10) : new ListNode(sum);
            tmp = sum>=10 ?sum/10 : 0;
            cur  = cur.next;
        }
        if(tmp != 0) {
            cur.next = new ListNode(tmp);
        }
        return res.next;
    }
}
