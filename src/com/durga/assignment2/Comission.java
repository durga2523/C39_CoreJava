package com.durga.assignment2;
import java.util.Scanner;
public class Comission {
	 private String name;
	    private String address;
	    private String phone;
	    private int salesAmount;

	    
	    public void acceptDetails() {
	        Scanner sc = new Scanner(System.in);
	        
	        System.out.print("Enter name: ");
	        name = sc.nextLine();
	        
	        System.out.print("Enter address: ");
	        address = sc.nextLine();
	        
	        System.out.print("Enter phone: ");
	        phone = sc.nextLine();
	        
	        System.out.print("Enter sales amount: ");
	        salesAmount = sc.nextInt();
	        
	        sc.close();
	    }

	    public void calculateCommission() {
	        double commission;
	        
	        if (salesAmount >= 100000) {
	            commission = salesAmount * 0.10;
	        } else if (salesAmount >= 50000) {
	            commission = salesAmount * 0.05;
	        } else if (salesAmount >= 30000) {
	            commission = salesAmount * 0.03;
	        } else {
	            commission = 0;
	        }
	        
	        System.out.println("Commission is: " + commission);
	    }

	    
	    public static void main(String[] args) {
	        Comission commissionEmployee = new Comission();
	        commissionEmployee.acceptDetails();
	        commissionEmployee.calculateCommission();
	    }
}
