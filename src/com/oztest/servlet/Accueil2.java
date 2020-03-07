package com.oztest.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ztest.DBconnexion.DBConnection;

//TODO A better name for this would be SignUpWelcome
//TODO Refactor all db work out of here
@WebServlet("/Accueil2")
public class Accueil2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
    
    public Accueil2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
		    String nom=(String)request.getParameter("nom");
	        String prenom =(String)request.getParameter("prenom");
	        String add =(String)request.getParameter("add");
	        String email =(String)request.getParameter("email");
	        String pass =(String)request.getParameter("pass");
	        request.setAttribute("nom", nom);
	        request.setAttribute("prenom", prenom);
	     
	        
	        try {
				sauvgarderEnBase(nom,prenom,add,email,pass);
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			} catch (SQLException e) {
				e.printStackTrace();
			}
	        
	        try {
//	        	Class c=Class.forName("com.mysql.jdbc.Driver");
	        	Class.forName("com.mysql.jdbc.Driver");  

	        } catch (ClassNotFoundException e1) {
	        	// TODO Auto-generated catch block
	        	e1.printStackTrace();
	        }
	        
	        
	        this.getServletContext().getRequestDispatcher("/WEB-INF/accueil2.jsp").forward(request, response);
		
	}
	public  void sauvgarderEnBase(String nom,String prenom,String add ,String email,String pass) throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		try {
			conn = DBConnection.getDBConnection();
			String sql="INSERT INTO project1 (`nom`,`prenom`,`add`,`email`,`pass`) VALUES ('"+ nom +"','"+ prenom +"','"+ add +"','"+ email +"','"+pass+"')";
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null)
				conn.close();
		}
		
	
	}
	
}



