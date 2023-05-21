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
import applet.beats.dao.CustInfo;


/**
 * Servlet implementation class Cust_Serv
 */
@WebServlet(name ="CustInfo_Serv", urlPatterns ={"/CustInfo_Serv"})
public class CustInfo_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CustInfo_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		
		CustInfo custinfo  = new CustInfo(); 
		ArrayList<QBean> customers = custinfo.getCustList();
		
	
			request.setAttribute("customers", customers);
			
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/customer.jsp");
			
			dispatcher.forward(request, response);
 
			
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	

}
