package javapractice;

public class StudentExam extends Library{
	private int sub1;
	private int sub2;
	
	public StudentExam(int regno,String stdname,String group,int sub1,int sub2,
			int countBooksIssued,int booksDue){
		super(regno,stdname,group,countBooksIssued,booksDue);
		this.sub1 = sub1;
		this.sub2 = sub2;
	}
	
	/* public StudentExam(){
		sub1 = 50;
		sub2 = 50;
	} */
	
	public void display(){
		System.out.println("Student from sub class");
	}
    
	public void output(){
		int total = sub1 + sub2;
		System.out.println(regno+" "+stdname+" "+group+" "+total+" "+countBooksIssued+" "+booksDue);
	}
	public static void main(String[] args) {
		Student student = new Student();
		StudentExam exam = new StudentExam(1001,"Shravya","ETM",70,70,7,2);
		exam.display();
		student.display();
		student = exam;
		student.display();
		exam.output();
		exam.disp();
	}

}
