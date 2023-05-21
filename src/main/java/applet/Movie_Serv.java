package applet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import applet.beats.bean.QBean;
import applet.beats.dao.SelectMovies;

/**
 * Servlet implementation class Movie_Serv
 */
@WebServlet(name ="Movie_Serv", urlPatterns = {"/Movie_Serv"})
public class Movie_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Movie_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
SelectMovies selectmovies = new SelectMovies();
		
		ArrayList<QBean>movies = selectmovies.getMovieInv();
		
		request.setAttribute("movies", movies);
		
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/movies.jsp");
	    
	    dispatcher.forward(request, response);
	    
	}

}
