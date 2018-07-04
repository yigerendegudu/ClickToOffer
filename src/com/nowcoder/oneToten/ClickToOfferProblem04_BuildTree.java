package com.nowcoder.oneToten;

import java.util.Arrays;

/**
 * 
 * @author ������
 *����ĳ��������ǰ���������������Ľ�������ؽ����ö�������
 *���������ǰ���������������Ľ���ж������ظ������֡�
 *��������ǰ���������{1,2,4,7,3,5,6,8}�������������{4,7,2,1,5,3,8,6}��
 *���ؽ������������ء�
 *
 *
 *
 *
 */
public class ClickToOfferProblem04_BuildTree {
	
	/**
	 * 
	 * ����Ҫ����������
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode tree = reConstructBinaryTree(new int[] {1,2,4,7,3,5,6,8},new int[] {4,7,2,1,5,3,8,6});
		
	}
	 public static TreeNode reConstructBinaryTree(int [] pre,int [] in) {
		if (pre.length == 0 || in.length ==0) {
			return null;
		}
		TreeNode node = new TreeNode(pre[0]);
		for (int i = 0; i < in.length; i++) {
			if(pre[0] == in[i]) {
				node.left = reConstructBinaryTree(Arrays.copyOfRange(pre, 1, i + 1), Arrays.copyOfRange(in, 0, i));
				node.right = reConstructBinaryTree(Arrays.copyOfRange(pre, i + 1, pre.length), Arrays.copyOfRange(in, i + 1, in.length));
			}
		}
		return node;
	        
	  }
}

