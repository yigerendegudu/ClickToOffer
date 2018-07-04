package com.nowcoder.oneToten;

import java.util.ArrayList;
import java.util.Stack;

/**
 * 
 * @author ������
 *
����һ��������β��ͷ��ӡ����ÿ���ڵ��ֵ����
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


