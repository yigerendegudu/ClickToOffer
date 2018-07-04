package com.nowcoder.oneToten;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author 刘海娇
 *
输入一个链表，从尾到头打印链表每个节点的值。。
 */
public class ClickToOfferProblem03_PrintListNode {
	public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
		ArrayList<Integer> list = new ArrayList<>();
		ListNode next = null;
		ListNode pre =null;
		while (listNode != null) {
			next = listNode.next;
			listNode.next = pre;
			pre = listNode;
			listNode = next;
		}
		while (pre != null) {
			list.add(pre.val);
			pre = pre.next;
		}
		return list;
        
    }
}


