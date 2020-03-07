package com.oztest.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ztest.DBconnexion.DBConnexion;


@WebServlet("/Accueil2")
public class Accueil2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	public static final String ATT_ERREURS = "erreurs";
	public static final String CHAMP_EMAIL = "email";
	public static final String CHAMP_PASS = "pass";
       
    
    public Accueil2() {
        super();
        
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		    Map<String, String> erreurs = new HashMap<String, String>();    
		    String nom=(String)request.getParameter("nom");
	        String prenom =(String)request.getParameter("prenom");
	        String add =(String)request.getParameter("add");
	        String email =(String)request.getParameter("email");
	        String pass =(String)request.getParameter("pass");
	        request.setAttribute("nom", nom);
	        request.setAttribute("prenom", prenom);
	     
	        
	        try {
				sauverEnBase(nom,prenom,add,email,pass);
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
	        try {
				validationEmail(email);
			} catch (Exception e){
				erreurs.put(CHAMP_EMAIL, e.getMessage());
			}
	        
	        try {
				validationPassword(pass);
			} catch (Exception e){
				erreurs.put(CHAMP_PASS, e.getMessage());
			}
	        request.setAttribute(ATT_ERREURS, erreurs);
	        
	        this.getServletContext().getRequestDispatcher("/WEB-INF/accueil2.jsp").forward(request, response);
		
	}
	public  void sauverEnBase(String nom,String prenom,String add ,String email,String pass) throws ClassNotFoundException, SQLException
	{
		DBConnexion con=new DBConnexion();
			con.connect();
			String sql="INSERT INTO project1 (`nom`,`prenom`,`add`,`email`,`pass`) VALUES ('"+ nom +"','"+ prenom +"','"+ add +"','"+ email +"','"+pass+"')";
			con.prepareStatement(sql);
	        con.preparedStatement.executeUpdate();
	
		
	
	}
	//verification email formulaire
		private void validationEmail(String email)throws Exception{
			if ( email != null && email.trim().length() != 0 ) {
				if ( !email.matches( "([^.@]+)(\\.[^.@]+)*@([^.@]+\\.)+([^.@]+)" ) ) {
					throw new Exception( "Merci de saisir une adresse mail valide." );
				}
			} else {
				throw new Exception( "Merci de saisir une adresse mail." );
			}
		}
		
		private void validationPassword(String pass)throws Exception{
			if ( pass.equals(" ") ) {
				 {
					throw new Exception( " le champ password et obligatoire" );
				}
			
		}
}
}


