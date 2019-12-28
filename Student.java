package javapractice;

public class Student {
	protected int regno;
	protected String stdname;
	protected String group;
	 /* public Student() {
		 regno = 1001;
		 stdname = "Shravya";
		 group = "ETM";
	 } */
	 public Student(){
		 
	 }
	 public void display() {
		 /* System.out.println(regno+stdname+group); */
		 System.out.println("Student from superclass");
	 }

	 public Student(int regno,String stdname,String group){
		 super();
		 this.regno = regno;
		 this.stdname = stdname;
		 this.group = group;
	 }
}
