package q6;

import java.util.Scanner; 
public class Assignment1Q6 {
	
    static String userId = "Ajay";
	 static String password = "password";
    public static String loginUser(String username, String pass) {
    	if(username==userId && pass==password) {
    		System.out.println("Welcome "+ userId);
    	}
    	else {
    		System.out.println("You have entered wrong credentials ,please enter the right credentials.");
    	}
		return null;
    	
    	
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    String username;
	    String pass;
		Scanner sc= new Scanner(System.in);  
		for(int i=0;i<3;i++) {
		System.out.print("Enter the username: ");  
		System.out.print("Enter the password: "); 
		//reads the limit from the user  
		username=sc.nextLine(); 
		pass=sc.nextLine(); 
		loginUser(username, pass);
		}
		System.out.println("You have entered wrong credentials 3 times");
	}
}
