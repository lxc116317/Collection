package com.lxc.text;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class text1 {

	public static void main(String[] args) {
		/*
		 * �������е��ظ�Ԫ��ȥ��
		 * ������
		 * 1������List���ϴ洢���ɸ��ظ�Ԫ��
		 * 2���������巽��ȥ���ظ�
		 * 3����ӡһ��List����
		 */
		//1������List���ϴ洢���ɸ��ظ�Ԫ��
		ArrayList<String> list=new ArrayList<>();
		list.add("a");
		list.add("a");
		list.add("a");
		list.add("b");
		list.add("b");
		list.add("b");
		list.add("c");
		list.add("c");
		list.add("c");
	
		//2���������巽��ȥ���ظ�
		getSingle(list);
		
		//3����ӡһ��List����
		System.out.println(list);
	}
	/*
	 * ������ȥ��List�����е��ظ�Ԫ��
	 * 1������һ��LinkedHashSet����
	 * 2����List�����е�����Ԫ�ض���ӵ�LinkedHashSet����
	 * 3����List�����е�Ԫ�����					
	 * 4����LinkedHashSet�����е�Ԫ����ӻص�List������
	 */

	public static void getSingle(List<String> list) {
		//1������һ��LinkedHashSet����
		LinkedHashSet<String> lsh=new LinkedHashSet<>();
		//2����List�����е�����Ԫ�ض���ӵ�LinkedHashSet����
		lsh.addAll(list);
		//3����List�����е�Ԫ�����
		list.clear();
		//4����LinkedHashSet�����е�Ԫ����ӻص�List������
		list.addAll(lsh);
		
	}

}
