package com.nowcoder.oneToten;
/**
 * 
 * @author 刘海娇
 *
 *要求：
 *请实现一个函数，将一个字符串中的空格替换成“%20”。例如，当字符串为We Are Happy.则经过替换之后的字符串为We%20Are%20Happy。
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
