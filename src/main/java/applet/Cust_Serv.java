package applet;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import applet.beats.bean.QBean;
import applet.beats.dao.Customer;



/**
 * Servlet implementation class Cust_Serv
 */
@WebServlet(name ="Cust_Serv", urlPatterns ={"/Cust_Serv"})
public class Cust_Serv extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Cust_Serv() {
        super();
        // TODO Auto-generated constructor stub
    }

    
    
    Customer customer = new Customer();
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 * 
	 */
    
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		
		String f_name = request.getParameter("f_name");
		String l_name = request.getParameter("l_name");
		String address = request.getParameter("address");
		Integer phone = Integer.parseInt(request.getParameter("phone"));
		String email = request.getParameter("email");
		String city = request.getParameter("city");
		String state = request.getParameter("state");
		Integer zip = Integer.parseInt(request.getParameter("zip"));
		Integer card_info = Integer.parseInt(request.getParameter("card_info"));
		
		
		QBean qbean = new QBean(); 
		
		
		qbean.setFName(f_name);
		qbean.setLName(l_name);
		qbean.setAddress(address);
		qbean.setPhone(phone);
		qbean.setEmail(email);
		qbean.setCity(city);
		qbean.setState(state);
		qbean.setZip(zip);
		qbean.setCardInfo(card_info);
		
		
		try {
		
			
			customer.customerInfo(qbean);
				
		
		}
		
		catch (ClassNotFoundException e) {
		
			e.printStackTrace(); 
			
		
		}
		
	
		
		response.sendRedirect("CustInfo_Serv");
		

			}
	}


