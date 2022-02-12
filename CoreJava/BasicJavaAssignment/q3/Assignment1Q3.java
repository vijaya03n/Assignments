package q3;

import java.util.Scanner;

public class Assignment1Q3 {
	
	
	 static double simpleInterest(double principalAmount,int time,double interestRate){
		
		
		return (principalAmount*time*interestRate)/100;
	}
     static double compoundInterest(double principalAmount,int time,double interestRate){
		
    	 return (principalAmount*(Math.pow((1+interestRate/100),time))-principalAmount);
    	
    }


	public static void main(String[] args) {
		
		
		int principalAmount,time,interestRate; 
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the values: ");  
	 
		principalAmount=sc.nextInt(); 
		time=sc.nextInt(); 
		interestRate=sc.nextInt(); 
		
		double si=simpleInterest(principalAmount,time,interestRate);
		System.out.println(si);
		
		double ci=compoundInterest(principalAmount,time,interestRate);
		System.out.println(ci);
		
		
	}

}
