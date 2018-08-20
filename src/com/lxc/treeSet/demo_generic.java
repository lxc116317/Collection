package com.lxc.treeSet;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.TreeSet;

public class demo_generic {

	public static void main(String[] args) {
		//demo();
		TreeSet<Student> ts1=new TreeSet<>(new compareByAge());
		ts1.add(new Student("����",23));
		ts1.add(new Student("����",24));
		ts1.add(new Student("����",25));
		ts1.add(new Student("����",26));
		
		TreeSet<baseStu> ts2=new TreeSet<>(new compareByAge());
		ts2.add(new baseStu("����",23));
		ts2.add(new baseStu("����",24));
		ts2.add(new baseStu("����",25));
		ts2.add(new baseStu("����",26));
		
		System.out.println(ts2);
	}

	private static void demo() {
		//���͹̶��ϱ߽�    ��extends E		�ϱ߽����Student,������baseStu
		ArrayList<Student> list1=new ArrayList<>();
		list1.add(new Student("����",23));
		list1.add(new Student("����",24));
		
		ArrayList<baseStu> list2=new ArrayList<>();
		list2.add(new baseStu("����",25));
		list2.add(new baseStu("����",26));
		
		list1.addAll(list2);
		System.out.println(list1);
	}

}
 class compareByAge implements Comparator<Student>{

	@Override
	public int compare(Student s1, Student s2) {
		int num=s1.getAge()-s2.getAge();
		return num==0?s1.getName().compareTo(s2.getName()):num;
	}
	 
 }
