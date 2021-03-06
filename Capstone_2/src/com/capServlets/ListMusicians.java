package com.capServlets;



import java.io.IOException;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.annotation.Resource;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sql.DataSource;

import edu.austincc.databaseManagers.VehiclesManager;
import edu.austincc.domain.Vehicle;
import edu.austincc.exceptions.DBErrorException;

/**
 * Servlet implementation class ListVehiclesServlet
 */
@WebServlet({ "/ListVehiclesServlet", "/listVehicles" })
public class ListVehiclesServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	@Resource(name="jdbc/DB")
	DataSource ds;
	
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListVehiclesServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String url = "/index.jsp";
		ArrayList<Vehicle> vehicles = null;
		
		HttpSession session = request.getSession();
		
		Boolean loggedInBoolean = (Boolean) session.getAttribute("isLoggedIn");
		if ( loggedInBoolean != null ) {
			boolean loggedIn = loggedInBoolean.booleanValue();
			 
			if ( loggedIn ) {
				
				try {
					vehicles = new VehiclesManager(ds).getVehicles();			
				} catch (DBErrorException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
					url = "/dberror.jsp";
					getServletContext().getRequestDispatcher(url).forward(request, response);
					return;
				}

				if (vehicles != null) {
					request.setAttribute("vehicles", vehicles);
					request.setAttribute("title", "Vehicles");
					url = "/WEB-INF/vehicles.jsp";
				}
			}
		}
		
		getServletContext().getRequestDispatcher(url).forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
