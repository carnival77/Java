package com.app4;

public class StringTest01 {
	public static void main(String[] args) {
		String str = "I am second to none";

		String num1 = str.replaceAll(" ", "");

		for (int i = 0; i < num1.length(); i++) {
			System.out.print(num1.charAt(i) + " ");
		}
		System.out.print(" ���ڰ��� : " + num1.length());

		int count = 0;

		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') {
				count++;
			}
		}
		System.out.println("\n" + str + " �ܾ�� : " + (count + 1));

	}
}
