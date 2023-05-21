package applet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import applet.beats.dao.SelectAudio;
import applet.beats.bean.QBean; 
import java.util.*; 

/**
 * Servlet implementation class Audio_Serv
 */
@WebServlet(name ="Audio_Serv" , urlPatterns = {"/Audio_Serv"})

public class Audio_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Audio_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		SelectAudio selectaudio = new SelectAudio();
		
		ArrayList<QBean>audioreads = selectaudio.getAudioInv();
		
		request.setAttribute("audioreads", audioreads);
		
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/audio.jsp");
		
		dispatcher.forward(request, response);
		
	}

}
