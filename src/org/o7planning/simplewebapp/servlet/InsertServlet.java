package org.o7planning.simplewebapp.servlet;


import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
 
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
 
import org.o7planning.simplewebapp.beans.UserAccount;
import org.o7planning.simplewebapp.utils.DBUtils;
import org.o7planning.simplewebapp.utils.MyUtils;
 
@WebServlet(urlPatterns = { "/insert" })
public class InsertServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public InsertServlet() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String button = request.getParameter("queryType");
    	Connection conn = MyUtils.getStoredConnection(request);
    	String errorString = null;
    	
    	if ("emp1".equals(button)) {
    		try {
    			String orderId = request.getParameter("orderID");
    			String dateTime = request.getParameter("dateTime");
    			String returnDate = request.getParameter("returnDate");
    			String accountId = request.getParameter("accountId");
    			String custRepId = request.getParameter("custRepId");
    			String movieId = request.getParameter("movieId");
    			
    			DBUtils.queryOneEmp(conn, orderId, dateTime, returnDate, accountId, custRepId, movieId);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/one.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/one.jsp");
	 
	            dispatcher.forward(request, response);
			}
    		//request.getRequestDispatcher("/WEB-INF/views/employee_transactions/one.jsp").forward(request, response);
        } else if ("emp2a".equals(button)) {
        	try {
    			String ssn = request.getParameter("ssn");
    			String firstName = request.getParameter("firstName");
    			String lastName = request.getParameter("lastName");
    			String address = request.getParameter("address");
    			String zipcode = request.getParameter("zipcode");
    			String telephone = request.getParameter("telephone");
    			String cc = request.getParameter("cc");
    			String rating = request.getParameter("rating");
    			String email = request.getParameter("email");
    			
    			DBUtils.queryTwoAEmp(conn, ssn, firstName, lastName, address, zipcode, telephone, cc, rating, email);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/twoA.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/twoA.jsp");
	 
	            dispatcher.forward(request, response);
			}
            //myClass.method2();
        } else if ("emp2b".equals(button)) {
        	try {
    			String ssn = request.getParameter("ssn");
    			String firstName = request.getParameter("firstName");
    			String lastName = request.getParameter("lastName");
    			String address = request.getParameter("address");
    			String zipcode = request.getParameter("zipcode");
    			String telephone = request.getParameter("telephone");
    			String cc = request.getParameter("cc");
    			String rating = request.getParameter("rating");
    			String email = request.getParameter("email");
    			
    			DBUtils.queryTwoBEmp(conn, ssn, firstName, lastName, address, zipcode, telephone, cc, rating, email);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/twoB.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/twoB.jsp");
	 
	            dispatcher.forward(request, response);
			}
            //myClass.method3();
        } else if ("emp2c".equals(button)) {
            //myClass.method3();
        	try {
        		String ssn = request.getParameter("ssn");
    			
    			DBUtils.queryTwoCEmp(conn, ssn);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/twoC.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/employee_transactions/twoC.jsp");
	 
	            dispatcher.forward(request, response);
			}
        } else if ("emp3".equals(button)) {
            //myClass.method3();
        } else if ("emp4".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/employee_transactions/fourResult.jsp").forward(request, response);
        } else if ("man1a".equals(button)) {
        	try {
    			String id = request.getParameter("id");
    			String name = request.getParameter("name");
    			String type = request.getParameter("type");
    			String rating = request.getParameter("rating");
    			String distrfee = request.getParameter("distrfee");
    			String numcopies = request.getParameter("numcopies");
    			
    			DBUtils.queryOneAMan(conn, id, name, type, rating, distrfee, numcopies);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/oneA.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/oneA.jsp");
	 
	            dispatcher.forward(request, response);
			}
        } else if ("man1b".equals(button)) {
        	try {
    			String id = request.getParameter("id");
    			String name = request.getParameter("name");
    			String type = request.getParameter("type");
    			String rating = request.getParameter("rating");
    			String distrfee = request.getParameter("distrfee");
    			String numcopies = request.getParameter("numcopies");
    			
    			DBUtils.queryOneBMan(conn, id, name, type, rating, distrfee, numcopies);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/oneB.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/oneB.jsp");
	 
	            dispatcher.forward(request, response);
			}
        } else if ("man1c".equals(button)) {
        	try {
        		String id = request.getParameter("id");
    			
    			DBUtils.queryOneCMan(conn, id);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/oneC.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/oneC.jsp");
	 
	            dispatcher.forward(request, response);
			}
        } else if ("man2a".equals(button)) {
        	try {
    			String ssn = request.getParameter("ssn");
    			String firstName = request.getParameter("firstName");
    			String lastName = request.getParameter("lastName");
    			String address = request.getParameter("address");
    			String zipcode = request.getParameter("zipcode");
    			String telephone = request.getParameter("telephone");
    			String startDate = request.getParameter("startDate");
    			String customerID = request.getParameter("customerID");
    			String hourlyRate = request.getParameter("hourlyRate");
    			
    			DBUtils.queryTwoAMan(conn, ssn, firstName, lastName, address, zipcode, telephone, startDate, customerID, hourlyRate);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/twoA.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/twoA.jsp");
	 
	            dispatcher.forward(request, response);
			}
        } else if ("man2b".equals(button)) {
        	try {
    			String ssn = request.getParameter("ssn");
    			String firstName = request.getParameter("firstName");
    			String lastName = request.getParameter("lastName");
    			String address = request.getParameter("address");
    			String zipcode = request.getParameter("zipcode");
    			String telephone = request.getParameter("telephone");
    			String startDate = request.getParameter("startDate");
    			String customerID = request.getParameter("customerID");
    			String hourlyRate = request.getParameter("hourlyRate");
    			
    			DBUtils.queryTwoBMan(conn, ssn, firstName, lastName, address, zipcode, telephone, startDate, customerID, hourlyRate);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/twoB.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/twoB.jsp");
	 
	            dispatcher.forward(request, response);
			}
        } else if ("man2c".equals(button)) {
        	//myClass.method3();
        	try {
        		String ssn = request.getParameter("ssn");
    			
    			DBUtils.queryTwoCMan(conn, ssn);
    			request.setAttribute("successString", "Success!");
    			RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/twoC.jsp");
	 
	            dispatcher.forward(request, response);
    			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				errorString = e.getMessage();
				
				request.setAttribute("errorString", errorString);
			       
	            // Forward to /WEB-INF/views/login.jsp
	            RequestDispatcher dispatcher //
	            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/manager_transactions/twoC.jsp");
	 
	            dispatcher.forward(request, response);
			}
        } else if ("man5a".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/fiveAResult.jsp").forward(request, response);
        } else if ("man5b".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/fiveBResult.jsp").forward(request, response);
        } else if ("man5c".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/fiveCResult.jsp").forward(request, response);
        } else if ("man3".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/threeResult.jsp").forward(request, response);
        } else if ("man8".equals(button)) {
            //myClass.method3();
        } else if ("emp4".equals(button)) {
            //myClass.method3();
        } else if ("man8".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/eight.jsp").forward(request, response);
        } else if ("cus1".equals(button)) {
            //myClass.method3();
        } else if ("cus2".equals(button)) {
            //myClass.method3();
        } else if ("cus3".equals(button)) {
            //myClass.method3();
        } else if ("cus4".equals(button)) {
            //myClass.method3();
        } else if ("cus5".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/fiveResult.jsp").forward(request, response);
        } else if ("cus6".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/sixResult.jsp").forward(request, response);
        } else if ("cus7".equals(button)) {
            //myClass.method3();
        } else if ("cus8".equals(button)) {
        	String id = request.getParameter("id");
			
			try {
				DBUtils.queue(conn, id);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			request.setAttribute("successString", "Success!");
			RequestDispatcher dispatcher //
            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/customer_transactions/eight.jsp");
 
            dispatcher.forward(request, response);
        } else {
            // ???
        }
    	
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
}