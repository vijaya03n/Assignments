package q4;

public class Assignment1Q4 {
	
	public static String declareResults( double subject1Marks, double subject2Marks, double subject3Marks) {
		
		if(subject1Marks>60) {
			if(subject2Marks>60) {
				if(subject3Marks>60) {
					System.out.println("passed!!");
				}
			}
		}
		if(subject1Marks>60 && subject2Marks>60) {
			
		}
		
		return null;
		
	}

	public static void main(String[] args) {
		
		
		declareResults(70, 80, 90);
		}

}
