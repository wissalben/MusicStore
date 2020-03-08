package com.ztest.DBconnexion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.oztest.javabeans.Client;

public class ClientDao {
	
	public List<Client> recupererClientDeBase(String email,String pass) throws ClassNotFoundException, SQLException
	{    List<Client> clients = new ArrayList<Client>();
		Connection conn = null;
		 Statement statement = null;
	     ResultSet resultat = null;
	    
		try {
			conn = DBConnection.getDBConnection();
			
		    statement = conn.createStatement();

		            
		    String sql="SELECT nom,prenom,email,pass FROM project1 WHERE email='"+email+"' AND pass='"+ pass +"';";
		    resultat = statement.executeQuery(sql);

		            
		            if (resultat.next()) {

		            	
		            		 String nom = resultat.getString("nom");
		                     String prenom = resultat.getString("prenom");
		                     
		                     Client client = new Client(); 
		                     client.setNom(nom);
		                     client.setPrenom(prenom);
		                     clients.add(client);
		                   
		                }
		          
		            
		        
		        } catch (SQLException e) {
		        
		                                 }
		finally {
            
            try {
                if (resultat != null)
                    resultat.close();
                if (statement != null)
                    statement.close();
                if (conn != null)
                    conn.close();
            }
            catch (SQLException e) {
		        
            }
	            }
		return clients;
}
	public  void sauvgarderClientEnBase(Client client) throws ClassNotFoundException, SQLException
	{
		Connection conn = null;
		
		try {
			conn = DBConnection.getDBConnection();
			
			String sql="INSERT INTO project1 (`nom`,`prenom`,`add`,`email`,`pass`) VALUES ('"+ client.getNom() +"','"+ client.getPrenom() +"','"+ client.getAdd() +"','"+ client.getEmail() +"','"+client.getPass()+"')";
			
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
