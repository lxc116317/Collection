package com.lxc.text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class test2 {

	public static void main(String[] args) {
		//������һ�������д洢�������ظ����ַ���������һ����������������(�ֵ�˳��)�����һ�����ȥ���ظ�
		/*������
		 *1������һ��List����,�洢�������ظ����ַ���
		 *2������һ�������������򲢱����ظ�
		 *3����ӡList����
		 */
		ArrayList<String> list=new ArrayList<>();
		list.add("aaa");
		list.add("aaaa");
		list.add("aaa");
		list.add("b");
		list.add("bbbbb");
		list.add("b");
		list.add("cc");
		list.add("accccc");
		
		sort(list);
		
		System.out.println(list);

	}

	/*���巽��,
	 * ������
	 * 1������TreeSet���϶�����ΪString����;��бȽϹ��ܣ������ظ����ᱣ�������������ñȽ���
	 * 2����List�����е�����Ԫ�ض���ӵ�TreeSet�����У��������򣬱����ظ�
	 * 3�����List����
	 * 4����TreeSet�������ź����Ԫ����ӵ�list��
	 */
	public static void sort(List<String> list) {
		//1������TreeSet���϶�����ΪString����;��бȽϹ��ܣ������ظ����ᱣ�������������ñȽ���
		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {		//ʹ�������ڲ���
			public int compare(String s1, String s2) {
				int num=s1.compareTo(s2);								//�Ƚϵ����ַ�������
				return num==0 ? 1 : num;	//�����ظ�//Ҫ������һģһ��(���ܴ洢��ͬ�ַ���)������Ҫ�ӵ��Ƿ���Ԫ��(Ŀ�ľ��Ǵ洢��ͬ��Ԫ��)
			}
			});
		// 2����List�����е�����Ԫ�ض���ӵ�TreeSet�����У��������򣬱����ظ�
		ts.addAll(list);
		//3�����List����
		list.clear();
		//4����TreeSet�������ź����Ԫ����ӵ�list��
		list.addAll(ts);
		
	}

}
	
		
		



