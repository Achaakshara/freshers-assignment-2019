package com.credentials;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.clean.User;
import com.userdetails.Userdetails;

public class Usercredentials {

	public Userdetails register(Userdetails usr){
		int c=0,i;
		Connection con=null;
		PreparedStatement ps=null;
		Userdetails usr2=new Userdetails();
		try{
			ps=con.prepareStatement("Select from user_details");
			ResultSet rs=ps.executeQuery();
		}
		catch(SQLException e1){
			e1.printStackTrace();
		}
		if(c==0){
			try{
				ps=con.prepareStatement("insert into user_details(fast_name,last_name,email_id,password,mobile_no) values(?,?,?,?,?)");
					ps.setString(1, usr.getFirstname());
				ps.setString(2, usr.getLastname());
				ps.setString(3, usr.getEmailid());
				ps.setString(4, usr.getPassword());
				ps.setString(5, usr.getMobileno());
				i=ps.executeUpdate();
				
			}
			catch(SQLException e){
				e.printStackTrace();
			}
		}
		return usr2;
		
	}
	public Userdetails login(String emailId,String password){
		Userdetails usr1=null;
		Connection con=null;
		try{
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("select * from user_details");
			while(rs.next()){
				if(rs.getString(1)== emailId && rs.getString(5).equals(password)){
					usr1=new Userdetails();
					usr1.setEmailid(emailId);
					usr1.setFirstname(rs.getString(2));
					usr1.setLastname(rs.getString(3));
					 usr1.setMobileno(rs.getString(4));
					
				}
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		return usr1;
	}
	
}
