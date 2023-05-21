package applet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import applet.beats.dao.SelectTeas;
import applet.beats.bean.QBean; 
import java.util.*; 

/**
 * Servlet implementation class Audio_Serv
 */
@WebServlet(name ="Tea_Serv" , urlPatterns = {"/Tea_Serv"})

public class Tea_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Tea_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SelectTeas selectteas = new SelectTeas();
		
		ArrayList<QBean>teas = selectteas.getTeaInv();
		
		request.setAttribute("teas", teas);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/teas.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
