package com.lxc.treeSet;

        public class Student implements Comparable<Student>{
		private String name;
		private int age;
		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		public Student(String name, int age) {
			super();
			this.name = name;
			this.age = age;
		}
		/**
		 * @return the name
		 */
		public String getName() {
			return name;
		}
		/**
		 * @param name the name to set
		 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 * @return the age
		 */
		public int getAge() {
			return age;
		}
		/**
		 * @param age the age to set
		 */
		public void setAge(int age) {
			this.age = age;
		}
		
		@Override
		public String toString() {
			return "Student [name=" + name + ", age=" + age + "]";
		}
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + age;
			result = prime * result + ((name == null) ? 0 : name.hashCode());
			return result;
		}
		
		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Student other = (Student) obj;
			if (age != other.age)
				return false;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			return true;
		}
		
		@Override
		public int compareTo(Student o) {
			//按照年龄来排序
			/*int num=this.age-o.age;						//根据年龄大小来排序,年龄是主要因素
			return num==0?this.name.compareTo(o.name):num;			//姓名是次要因素 这里不能使用equals方法。因为接收的是int类型，而equals方法返回的是boolean
		*/
		//按照姓名来排序
			/*int num=this.name.compareTo(o.name);
			return num==0 ?this.age-o.age:num;
		
		*/
		//按照姓名长度来排序
			int length=this.name.length()-o.name.length();		//比较姓名长度是主要因素
			int num=length==0 ?this.name.compareTo(o.name):length;//比较姓名内容是次要条件
			return num==0?this.age-o.age:num;					//比较年龄是次要条件
		
		}
		
}
