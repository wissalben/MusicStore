package com.oztest.servlet;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ztest.DBconnexion.AjouterSelectionnerClient;
import com.ztest.DBconnexion.DBConnection;


@WebServlet("/Identifier")
public class Identifier extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
    public Identifier() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/identifier.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email=(String)request.getParameter("email");
        String pass =(String)request.getParameter("pass");
       
        AjouterSelectionnerClient client = new AjouterSelectionnerClient();
        try {
			request.setAttribute("clients", client.recupererDeBase(email, pass));
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
      
     
       
        
        this.getServletContext().getRequestDispatcher("/WEB-INF/accueil2.jsp").forward(request, response);
	


}
	
	
}
