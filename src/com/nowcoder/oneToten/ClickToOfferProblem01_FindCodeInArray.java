package com.nowcoder.oneToten;
/**
 * 
 * @author ������
 *
 *Ҫ��
 *��һ����ά�����У�ÿһ�ж����մ����ҵ�����˳������ÿһ�ж����մ��ϵ��µ�����˳������
 *�����һ������������������һ����ά�����һ���������ж��������Ƿ��и�������
 */
public class ClickToOfferProblem01_FindCodeInArray {
	public static void main(String[] args) {
		//7,[[1,2,8,9],[2,4,9,12],[4,7,10,13],[6,8,11,15]]
		int array [][] = new int[][]{{1, 2, 8, 9},{2, 4, 9, 12},{4, 7, 10, 13},{6, 8, 11, 15}};
		System.out.println(Find02(7, array));
	}
	
	public static boolean Find01(int target, int [][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[0].length; j++) {
				if (array[i][j] == target ) {
					return true;
				}
			}
		}
		return false;
 
    }
	public static boolean Find02(int target, int [][] array) {
		int i = 0;
		int j = array[0].length - 1;
		while(i <= array.length -1 && j >= 0) {
			if (array[i][j] > target ) {
				j--;
			}else if (array[i][j]== target ) {
				return true;
			}else if (array[i][j] < target ) {
				i++;
			}
		}
		return false;
 
    }
	
}
