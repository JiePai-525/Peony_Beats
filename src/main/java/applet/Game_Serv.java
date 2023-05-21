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
import applet.beats.dao.SelectGames;

/**
 * Servlet implementation class Game_Serv
 */
@WebServlet(name ="Game_Serv", urlPatterns = {"/Game_Serv"})
public class Game_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Game_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		
SelectGames selectgames = new SelectGames();
		
		ArrayList<QBean>games = selectgames.getGameInv();
		
		request.setAttribute("games", games);
		
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/games.jsp");
	    
	    dispatcher.forward(request, response);
	    
	}

}
