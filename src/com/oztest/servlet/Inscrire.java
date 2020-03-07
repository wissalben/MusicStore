package com.oztest.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ztest.DBconnexion.DBConnection;


@WebServlet("/Inscrire")
public class Inscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Inscrire() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscrire.jsp").forward(request, response);


	}
}

