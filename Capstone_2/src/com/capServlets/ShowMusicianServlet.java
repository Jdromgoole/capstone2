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

import com.capDomain.Musicians;
import com.capManagers.MusicianManager;

import exceptions.com.DBErrorException;

/**
 * Servlet implementation class ShowMusicianServlet
 */
@WebServlet({ "/ShowMusicianServlet", "/showMusician" })
public class ShowMusicianServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Resource(name = "jdbc/DB")
	DataSource ds;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ShowMusicianServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		String url = "/Musicians.jsp";
		ArrayList<Musicians> musicians = null;

		HttpSession session = request.getSession();

		Boolean loggedInBoolean = (Boolean) session.getAttribute("isLoggedIn");
		if (loggedInBoolean != null) {
			boolean loggedIn = loggedInBoolean.booleanValue();

			if (loggedIn) {

				musicians = new MusicianManager(ds).getMusician();

				if (musicians != null) {
					request.setAttribute("vehicles", musicians);
					request.setAttribute("title", "Musicians");
					url = "/Musicians.jsp";
				}
			}
		}

		getServletContext().getRequestDispatcher(url)
				.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
