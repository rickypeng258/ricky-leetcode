package com.ricky.leetcode.algorithm.datastructure.base.linkedlist;

import java.util.*;

/**
 * @Description 给你一个长度为 n 的链表，每个节点包含一个额外增加的随机指针 random ，该指针可以指向链表中的任何节点或空节点
 * @Link https://leetcode-cn.com/problems/copy-list-with-random-pointer/
 * @Author rickypeng
 * @Date 2021/8/15
 */
public class Leetcode138 {
    public Node copyRandomList(Node head) {
        Map<Node, Node> copyMap = new HashMap<Node, Node>();
        return solution1(head, copyMap);
    }

    /**
     * 解法一：使用深度遍历
     * @param node
     * @return
     */
    public Node solution1(Node node, Map<Node, Node> copyMap) {
        if (node == null) {
            return node;
        }
        if (copyMap.containsKey(node)) {
            return copyMap.get(node);
        }
        Node copyNode = new Node(node.val);
        copyMap.put(node, copyNode);
        copyNode.next = solution1(node.next, copyMap);
        copyNode.random = solution1(node.random, copyMap);
        return copyNode;
    }
}
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}