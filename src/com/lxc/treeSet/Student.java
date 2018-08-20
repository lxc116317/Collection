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
			//��������������
			/*int num=this.age-o.age;						//���������С������,��������Ҫ����
			return num==0?this.name.compareTo(o.name):num;			//�����Ǵ�Ҫ���� ���ﲻ��ʹ��equals��������Ϊ���յ���int���ͣ���equals�������ص���boolean
		*/
		//��������������
			/*int num=this.name.compareTo(o.name);
			return num==0 ?this.age-o.age:num;
		
		*/
		//������������������
			int length=this.name.length()-o.name.length();		//�Ƚ�������������Ҫ����
			int num=length==0 ?this.name.compareTo(o.name):length;//�Ƚ����������Ǵ�Ҫ����
			return num==0?this.age-o.age:num;					//�Ƚ������Ǵ�Ҫ����
		
		}
		
}
