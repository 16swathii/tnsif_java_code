package org.tnsif.sf.c2tc.oops;
class Person
{
		private int age;
		private String name;
		
		public void setAge(int age) {
			this.age = age;
		}
		public int getAge() {
			return age;
		}
		public void setName(String name) {
			this.name = name;
		}
		public String getName() {
			return name;
		}
		
}
public class After_encapsulation {

		public static void main(String[] args) {
			Person obj=new Person();
			obj.setAge(12);
			obj.setName("Swathi");
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
			
			obj.setAge(16);
			obj.setName("Anusha");
			System.out.println(obj.getAge());
			System.out.println(obj.getName());
			

		}

	
}
