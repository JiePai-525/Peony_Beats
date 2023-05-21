package applet;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import applet.beats.dao.SelectBooks;
import applet.beats.bean.QBean; 
import java.util.*; 





/**
 * Servlet implementation class Beats_Serv
 */
@WebServlet(name = "Beats_Serv", urlPatterns ={"/Beats_Serv"})
public class Beats_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	 
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Beats_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

    
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	
    	
    	SelectBooks selectbooks  = new SelectBooks(); 
		ArrayList<QBean> books = selectbooks.getBookInv();
		
	
			request.setAttribute("books", books);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/books.jsp");
			
			dispatcher.forward(request, response);
       
   
    	
    }
    
	
   
	
}
