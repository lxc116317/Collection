package com.lxc.text;

import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

public class text3 {

	public static void main(String[] args) {
		//从键盘接收一个字符串，程序对其中所有字符进行排序，例如键盘输入：helloitcast,打印出：acehillostt
		/*分析：
		 * 1、创建Scanner对象
		 * 2、将字符串转换成字符数组
		 * 3、创建TreeSet集合,传入比较器对字符排序并保留重复
		 * 4、遍历字符数组,将每一个字符存储在TreeSet集合中
		 * 5、遍历TreeSet集合，并打印每一个字符
		 */
		//1、创建Scanner对象
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入一个字符串:");
		String line=sc.nextLine();
		//2、将字符串转换成字符数组
		char[] arr=line.toCharArray();
		//3、创建TreeSet集合,传入比较器对字符排序并保留重复
		TreeSet<Character> ts=new TreeSet<>(new Comparator<Character>() {

			@Override
			public int compare(Character c1, Character c2) {
				int num=c1.compareTo(c2);
				return num==0?1:num;
			}
		});
		//4、遍历字符数组,将每一个字符存储在TreeSet集合中
		for(char c:arr) {								//增强for循环：数据类型  变量名 ：遍历的目标
			ts.add(c);
		}
		//5、遍历TreeSet集合，并打印每一个字符
		for(Character c:ts) {
			System.out.print(c);
		}
	}
	

}
