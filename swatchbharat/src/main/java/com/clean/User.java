package com.clean;

import java.util.Scanner;

import com.credentials.Usercredentials;
import com.userdetails.Userdetails;

public class User {
	
public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	Userdetails usr=new Userdetails();
	Usercredentials credentials=new Usercredentials();
	while(true){
		System.out.println("1) Register\n 2)Login");
		int ch= sc.nextInt();
		switch(ch){
		case 1:
			System.out.println("Enter first name");
			usr.setFirstname(sc.next());
			System.out.println("Enter last name");
			usr.setLastname(sc.next());
			System.out.println("Enter emailid");
			usr.setEmailid(sc.next());
			System.out.println("Enter password");
			usr.setPassword(sc.next());
			System.out.println("Enter mobile number");
			usr.setMobileno(sc.next());
			Userdetails details=credentials.register(usr);
		case 2:
			System.out.println("Enter emailid");
			String emailid = sc.next();
			System.out.println("Enter password");
			String pass=sc.next();
			Userdetails details1=credentials.login(emailid ,pass);
			System.out.println("Enter 1) Type 2) Brand 3)Quantity 4)Weight");
		}
	}
}


 
	
}

