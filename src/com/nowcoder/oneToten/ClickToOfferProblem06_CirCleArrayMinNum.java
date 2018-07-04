package com.nowcoder.oneToten;
/**
 * ��һ�������ʼ�����ɸ�Ԫ�ذᵽ�����ĩβ�����ǳ�֮Ϊ�������ת��
 * ����һ���ǵݼ�����������һ����ת�������ת�������СԪ�ء�
 * ��������{3,4,5,1,2}Ϊ{1,2,3,4,5}��һ����ת�����������СֵΪ1��
 * NOTE������������Ԫ�ض�����0���������СΪ0���뷵��0
 * @author ������
 *
 */
public class ClickToOfferProblem06_CirCleArrayMinNum {
	public int minNumberInRotateArray(int [] array) {
		if (array.length == 0) {
			return 0;
		}
		int min = array[0];
		for (int i = 0; i < array.length; i++) {
			if(min > array[i]) {
				min = array[i];
			}
		}
		return min;
	    
    }
	public static int minNumberInRotateArray02(int [] array) {
		if (array.length == 0) {
			return 0;
		}
		int left = 0;
		int right = array.length -1;
		int middle = -1;
		while (array[left] >= array[right]) {
			if (right - left == 1) {
				middle = right;
				break;
			}
			middle = left + (right - left) >> 2;
			if(array[middle] >= array[left]) {
				left = middle;
			}
			if (array[middle] <= array[right]) {
				right = middle;
			}
		} 
		return array[middle];
	}
}
