package capServlets.com;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		getServletContext().getRequestDispatcher("/Login.jsp").forward(
				request, response);

	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("emailAddress");
		String password = request.getParameter("password");

		if ((name.equalsIgnoreCase("jakeDromgoole@123.com") && (password
				.equalsIgnoreCase("abc")))) {
			HttpSession theSession = request.getSession();
			theSession.setAttribute("isLoggedIn", true);
			request.setAttribute("name", name);
			response.sendRedirect("/Capstone_2/index.jsp");
		} else {

			getServletContext().getRequestDispatcher("/Login.jsp")
					.forward(request, response);
		}
	}

}
