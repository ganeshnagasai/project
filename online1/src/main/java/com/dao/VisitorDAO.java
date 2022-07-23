package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.entity.Appointment;

public class VisitorDAO {
 private Connection conn;

public VisitorDAO(Connection conn) {
	super();
	this.conn = conn;
}
public boolean addUser(Appointment A)
{
	boolean f=false;
	try {
		String sql="insert into online-1(name,flatnumber,relation,number,time,desc)values(?,?,?,?,?,?)";
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setString(1, A.getName());
		ps.setInt(2, A.getFlatnumber());
		ps.setString(3, A.getRelation());
		ps.setInt(4, A.getNumber());
		ps.setString(5, A.getDesc());
		
		int i=ps.executeUpdate();
		if(i==1) {
			f=true;
		}
		
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return f;
}
}
