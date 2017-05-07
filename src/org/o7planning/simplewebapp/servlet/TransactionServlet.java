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
 
@WebServlet(urlPatterns = { "/transaction" })
public class TransactionServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public TransactionServlet() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	String button = request.getParameter("button");
    	if ("home".equals(button)) {
    		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
            
            dispatcher.forward(request, response);
        }
    	
    	if ("help".equals(button)) {
    		RequestDispatcher dispatcher = this.getServletContext().getRequestDispatcher("/WEB-INF/views/help.jsp");
            
            dispatcher.forward(request, response);
        }
    	
    	if ("emp_1".equals(button)) {
    		request.getRequestDispatcher("/WEB-INF/views/employee_transactions/one.jsp").forward(request, response);
        } else if ("emp_2a".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/employee_transactions/twoA.jsp").forward(request, response);
        } else if ("emp_2b".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/employee_transactions/twoB.jsp").forward(request, response);
        } else if ("emp_2c".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/employee_transactions/twoC.jsp").forward(request, response);
        } else if ("emp_3".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/employee_transactions/three.jsp").forward(request, response);
        } else if ("emp_4".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/employee_transactions/four.jsp").forward(request, response);
        } else if ("man_1a".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/oneA.jsp").forward(request, response);
        } else if ("man_1b".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/oneB.jsp").forward(request, response);
        } else if ("man_1c".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/oneC.jsp").forward(request, response);
        } else if ("man_2a".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/twoA.jsp").forward(request, response);
        } else if ("man_2b".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/twoB.jsp").forward(request, response);
        } else if ("man_2c".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/twoC.jsp").forward(request, response);
        } else if ("man_3".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/three.jsp").forward(request, response);
        } else if ("man_4".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/four.jsp").forward(request, response);
        } else if ("man_5a".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/fiveA.jsp").forward(request, response);
        } else if ("man_5b".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/fiveB.jsp").forward(request, response);
        } else if ("man_5c".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/fiveC.jsp").forward(request, response);
        }else if ("man_6".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/six.jsp").forward(request, response);
        } else if ("man_7".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/seven.jsp").forward(request, response);
        } else if ("man_8".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/manager_transactions/eight.jsp").forward(request, response);
        } else if ("cus_1".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/one.jsp").forward(request, response);
        } else if ("cus_2".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/two.jsp").forward(request, response);
        } else if ("cus_3".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/three.jsp").forward(request, response);
        } else if ("cus_4".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/four.jsp").forward(request, response);
        } else if ("cus_5".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/five.jsp").forward(request, response);
        } else if ("cus_6".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/six.jsp").forward(request, response);
        } else if ("cus_7".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/seven.jsp").forward(request, response);
        } else if ("cus_8".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/eight.jsp").forward(request, response);
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