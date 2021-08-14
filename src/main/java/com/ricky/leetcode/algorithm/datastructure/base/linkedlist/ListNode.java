package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

import lombok.Data;

/**
 *
 * @Description 定义一个通用链表
 * @Author rickypeng
 * @Date 2021/8/14
 */
@Data
public class ListNode {

    /**
     * 节点值
     */
    int val;

    /**
     * 前一个节点
     */
    ListNode prev;

    /**
     * 下一个链表
     */
    ListNode next;

    public ListNode(int val) {
        this.val = val;
    }
}
