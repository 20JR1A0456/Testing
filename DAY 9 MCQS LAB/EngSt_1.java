package lab4;

public class EngSt extends Student1 {
	EngSt(String name , int rollno){
		super(name,rollno);
	}
	void getGrade(int marks) {
		System.out.println("engineering Student:" + name +", Rollno" +rollno);
		if(marks >= 90) {
			System.out.println("Grade: A+");
		}
		else if(marks >= 75) {
			System.out.println("Grade: A");
			
		}else if(marks >= 60) {
			System.out.println("Grade: B");
			
		}else {
			System.out.println("Grade: C");
		}
	}
	

}
