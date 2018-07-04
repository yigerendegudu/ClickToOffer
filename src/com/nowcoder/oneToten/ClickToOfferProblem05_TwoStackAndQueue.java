package com.nowcoder.oneToten;

import java.util.Stack;

/**
 * ������ջ��ʵ��һ�����У���ɶ��е�Push��Pop������ �����е�Ԫ��Ϊint���͡�
 * @author ������
 *
 */
public class ClickToOfferProblem05_TwoStackAndQueue {
	Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    
    public int pop() {
    	if (stack2.isEmpty() && stack1.isEmpty()) {
    		throw new NullPointerException();
		}else if (stack2.isEmpty()) 
			while (!stack1.isEmpty()) {
				stack2.push(stack1.pop());
			}
    	return stack2.pop();
		}
}
