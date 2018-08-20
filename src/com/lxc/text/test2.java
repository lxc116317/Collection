package com.lxc.text;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public class test2 {

	public static void main(String[] args) {
		//需求：在一个集合中存储无序并且重复的字符串，定义一个方法，让其有序(字典顺序)，而且还不能去除重复
		/*分析：
		 *1、创建一个List集合,存储无序且重复的字符串
		 *2、定义一个方法对其排序并保留重复
		 *3、打印List集合
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

	/*定义方法,
	 * 分析：
	 * 1、创建TreeSet集合对象，因为String本身就具有比较功能，但是重复不会保留，所以我们用比较器
	 * 2、将List集合中的所有元素都添加到TreeSet集合中，对其排序，保留重复
	 * 3、清空List集合
	 * 4、将TreeSet集合中排好序的元素添加到list中
	 */
	public static void sort(List<String> list) {
		//1、创建TreeSet集合对象，因为String本身就具有比较功能，但是重复不会保留，所以我们用比较器
		TreeSet<String> ts=new TreeSet<>(new Comparator<String>() {		//使用匿名内部类
			public int compare(String s1, String s2) {
				int num=s1.compareTo(s2);								//比较的是字符串内容
				return num==0 ? 1 : num;	//保留重复//要是内容一模一样(不能存储相同字符串)，所以要加的是非零元素(目的就是存储相同的元素)
			}
			});
		// 2、将List集合中的所有元素都添加到TreeSet集合中，对其排序，保留重复
		ts.addAll(list);
		//3、清空List集合
		list.clear();
		//4、将TreeSet集合中排好序的元素添加到list中
		list.addAll(ts);
		
	}

}
	
		
		



