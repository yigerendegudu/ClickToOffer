package com.nowcoder.oneToten;
/**
 * 
 * @author ������
 *
 *Ҫ��
 *��ʵ��һ����������һ���ַ����еĿո��滻�ɡ�%20�������磬���ַ���ΪWe Are Happy.�򾭹��滻֮����ַ���ΪWe%20Are%20Happy��
 */
public class ClickToOfferProblem02_ReplaceTab {
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("We are Happy");
		System.out.println(replaceSpace(sb));
	}
	 public static String replaceSpace(StringBuffer str) {
		  String s = str.toString().replaceAll(" ", "%20");
		  return s.toString();
	}
}
