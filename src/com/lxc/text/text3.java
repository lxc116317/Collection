package com.lxc.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class text3 {

	public static void main(String[] args) {
		//�Ӽ��̽���һ���ַ�������������������ַ�������������������룺helloitcast,��ӡ����acehillostt
		/*������
		 * 1������Scanner����
		 * 2�����ַ���ת�����ַ�����
		 * 3������TreeSet����,����Ƚ������ַ����򲢱����ظ�
		 * 4�������ַ�����,��ÿһ���ַ��洢��TreeSet������
		 * 5������TreeSet���ϣ�����ӡÿһ���ַ�
		 */
		//1������Scanner����
		Scanner sc=new Scanner(System.in);
		System.out.println("������һ���ַ���:");
		String line=sc.nextLine();
		//2�����ַ���ת�����ַ�����
		char[] arr=line.toCharArray();
		//3������TreeSet����,����Ƚ������ַ����򲢱����ظ�
		TreeSet<Character> ts=new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num=c1.compareTo(c2);
				return num==0?1:num;
			}
		});
		//4�������ַ�����,��ÿһ���ַ��洢��TreeSet������
		for(char c:arr) {								//��ǿforѭ������������  ������ ��������Ŀ��
			ts.add(c);
		}
		//5������TreeSet���ϣ�����ӡÿһ���ַ�
		for(Character c:ts) {
			System.out.print(c);
		}
	}
	

}
