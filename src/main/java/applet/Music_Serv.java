package applet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.*; 
import applet.beats.dao.SelectMusic;
import applet.beats.bean.QBean;

/**
 * Servlet implementation class Music_Serv
 */
@WebServlet(name ="Music_Serv", urlPatterns = {"/Music_Serv"})
public class Music_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Music_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		SelectMusic selectmusic = new SelectMusic();
		
		ArrayList<QBean>music = selectmusic.getMusicInv();
		
		request.setAttribute("music", music);
		
	    RequestDispatcher dispatcher = request.getRequestDispatcher("/music.jsp");
	    
	    dispatcher.forward(request, response);
	    
		
	}

}
