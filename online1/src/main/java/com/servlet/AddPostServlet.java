package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.DB.DBConnect;
import com.dao.VisitorDAO;
import com.entity.Appointment;

@WebServlet("/appointment")
public class AddPostServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private VisitorDAO VisitorDAO;
	private Object dao;

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	try {
		String name=req.getParameter("name");
		int flatnumber=req.getParameter("flatnumber");
		String relation=req.getParameter("relation");
		String number=req.getParameter("number");
		String desc=req.getParameter("desc");
		
		Appointment A=new Appointment(desc, 0, desc, 0, desc);
		A.setName(name);
		A.setFlatnumber(flatnumber);
		A.setRelation(relation);
		A.setNumber(number);
		A.setDesc(desc);
		
		HttpSession session=req.getSession();
		
		VisitorDAO = new VisitorDAO(DBConnect.getConn());
		 boolean f= dao.appointment();
		if(f)
		{
			session.setAttribute("msg","Details added Sucessfully...");
			resp.sendRedirect("appointment.jsp");
		}else {
			session.setAttribute("msg","Something Went Wronh On Server");
			resp.sendRedirect("appointment.jsp");
		}
	}catch(Exception e) {
		e.printStackTrace();
	}

}
}
