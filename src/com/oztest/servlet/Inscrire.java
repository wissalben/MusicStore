package com.oztest.servlet;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oztest.javabeans.Client;
import com.ztest.DBconnexion.AjouterSelectionnerClient;


@WebServlet("/Inscrire")
public class Inscrire extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public Inscrire() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		this.getServletContext().getRequestDispatcher("/WEB-INF/inscrire.jsp").forward(request, response);


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  
	        
	        
		Client client1 = new Client();
        client1.setNom(request.getParameter("nom"));
        client1.setPrenom(request.getParameter("prenom"));
        client1.setAdd(request.getParameter("add"));
        client1.setEmail(request.getParameter("email"));
        client1.setPass(request.getParameter("pass"));
        
    AjouterSelectionnerClient nouveauclient = new AjouterSelectionnerClient();
    try {
		nouveauclient.sauvgarderEnBase(client1);
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
    try {
		request.setAttribute("clients", nouveauclient.recupererDeBase(client1.getEmail(), client1.getPass()));
	
		
    
    } catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
        
		
		
		
		
		
		
		
		this.getServletContext().getRequestDispatcher("/WEB-INF/accueil2.jsp").forward(request, response);
		
	}
	
		
	
	
	
		


	}


