package com.lxc.treeSet;


import java.util.Comparator;
import java.util.TreeSet;

public class demo1 {

	public static void main(String[] args) {
		//treeSet�����������Զ���Ԫ�ؽ�������ģ�ͬ��Ҳ���Ա�֤Ԫ�ص�Ψһ��
		//demo1();
		
		/*��������
		 * С�Ĵ洢�����(����),��Ĵ洢���ұ�(����),��ȾͲ���(0)
		 * compareTo����,��Tree��������δ洢Ԫ��ȡ����compareTo�����ķ���ֵ
		 * 1������0,������ֻ��һ��Ԫ��
		 * 2�����ظ���,���ϵ���
		 * 3����������,������ô����ôȡ
		 * 
		 * 
		 * ��comparableTo��������0��ʱ�򼯺���ֻ��һ��Ԫ��
		 * ��comparableTo��������������ʱ�򼯺Ͼ���ô����ôȡ
		 * ��comparableTo�������ظ�����ʱ�򼯺ϻᵹ���洢
		 */
		//demo2();
		//demo3();
		//����:���ַ������ճ�������
		TreeSet<String> ts=new TreeSet<>(new compareBylen());
		ts.add("aaaaaaaa");				//TreeSet���add()�����л�Ѵ���Ķ�������ΪComparable����,comparable����compareTo����,����String���ж�compareTo����������ʹ��˵�����ǰ����ֵ�˳������
		ts.add("bbb");					//����compareTo�����������ڽ��ַ������ճ����������������Ƚ�������
		ts.add("mmass");
		ts.add("zsda");
		System.out.println(ts);		
	}


	private static void demo3() {
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student("zhangsan",23));
		ts.add(new Student("lisi",13));
		ts.add(new Student("zhouqi",13));
		ts.add(new Student("wangwu",31));
		ts.add(new Student("zhaoliu",12));
		
		System.out.println(ts);
	}

	
	private static void demo2() {
		//��Ȼ����
		/*TreeSet���add()�����л�Ѵ���Ķ�������ΪComparable����
		 *���ö����comparable()�����ͼ����еĶ���Ƚ�
		 *����comparable()�������صĽ�����д洢 
		 */
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student("����",23));			
		ts.add(new Student("����",13));
		ts.add(new Student("����",13));
		ts.add(new Student("����",31));
		ts.add(new Student("����",12));
		
		System.out.println(ts);
	}

	private static void demo1() {
		TreeSet<Integer> ts=new TreeSet<>();
		ts.add(1);
		ts.add(1);
		ts.add(2);
		ts.add(2);
		ts.add(2);
		ts.add(3);
		
		System.out.println(ts);
	}

}


//�Ƚ���
/*
 *�Ƚ���˳��
 *1������TreeSet��ʱ������ƶ�һ��comparator
 *2�����������Comparator�����������ôTreeSet�ͻᰴ�ձȽ����е�˳������
 *3��add()�����ڲ����Զ�����Comparator�ӿ��е�Compare()������������
 */
class compareBylen implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {			//���ַ������ճ�������
		int num=s1.length()-s2.length();
		return num==0 ?s1.compareTo(s2):num;
	}
	
}