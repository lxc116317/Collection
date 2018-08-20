package com.lxc.treeSet;


import java.util.Comparator;
import java.util.TreeSet;

public class demo1 {

	public static void main(String[] args) {
		//treeSet集合是用来对对象元素进行排序的，同样也可以保证元素的唯一性
		//demo1();
		
		/*二叉树：
		 * 小的存储在左边(负数),大的存储在右边(正数),相等就不存(0)
		 * compareTo方法,在Tree集合中如何存储元素取决于compareTo方法的返回值
		 * 1、返回0,集合中只有一个元素
		 * 2、返回负数,集合倒序
		 * 3、返回正数,集合怎么存怎么取
		 * 
		 * 
		 * 当comparableTo方法返回0的时候集合中只有一个元素
		 * 当comparableTo方法返回正数的时候集合就怎么存怎么取
		 * 当comparableTo方法返回负数的时候集合会倒数存储
		 */
		//demo2();
		//demo3();
		//需求:将字符串按照长度排序
		TreeSet<String> ts=new TreeSet<>(new compareBylen());
		ts.add("aaaaaaaa");				//TreeSet类的add()方法中会把存入的对象提升为Comparable类型,comparable里有compareTo方法,而在String类中对compareTo方法进行了使用说明，是按照字典顺序排序
		ts.add("bbb");					//所以compareTo方法不适用于将字符串按照长度排序，所以引进比较器方法
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
		//自然排序
		/*TreeSet类的add()方法中会把存入的对象提升为Comparable类型
		 *调用对象的comparable()方法和集合中的对象比较
		 *根据comparable()方法返回的结果进行存储 
		 */
		TreeSet<Student> ts=new TreeSet<>();
		ts.add(new Student("张三",23));			
		ts.add(new Student("张三",13));
		ts.add(new Student("李流",13));
		ts.add(new Student("王五",31));
		ts.add(new Student("赵六",12));
		
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


//比较器
/*
 *比较器顺序：
 *1、创建TreeSet的时候可以制定一个comparator
 *2、如果传入了Comparator的子类对象，那么TreeSet就会按照比较器中的顺序排序
 *3、add()方法内部会自动调用Comparator接口中的Compare()方法进行排序
 */
class compareBylen implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {			//将字符串按照长度排序
		int num=s1.length()-s2.length();
		return num==0 ?s1.compareTo(s2):num;
	}
	
}