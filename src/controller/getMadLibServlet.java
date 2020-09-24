package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.MadLibs;

/**
 * Servlet implementation class getMadLibServlet
 */
@WebServlet("/getMadLibServlet")
public class getMadLibServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public getMadLibServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String personName = request.getParameter("personName");
		String verb = request.getParameter("verb");
		String adjective  = request.getParameter("adjective");
		String adverb = request.getParameter("adverb");
		
		MadLibs madlib = new MadLibs(personName, verb, adjective, adverb);
		
		request.setAttribute("madlibInstance", madlib);
		getServletContext().getRequestDispatcher("/result.jsp").forward(request, response);
	}

}
