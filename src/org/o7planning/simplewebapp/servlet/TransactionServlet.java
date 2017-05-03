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
            //myClass.method3();
        } else if ("man_1b".equals(button)) {
            //myClass.method3();
        } else if ("man_1c".equals(button)) {
            //myClass.method3();
        } else if ("man_2a".equals(button)) {
            //myClass.method3();
        } else if ("man_2b".equals(button)) {
            //myClass.method3();
        } else if ("man_2c".equals(button)) {
            //myClass.method3();
        } else if ("man_3".equals(button)) {
            //myClass.method3();
        } else if ("man_4".equals(button)) {
            //myClass.method3();
        } else if ("man_5".equals(button)) {
            //myClass.method3();
        } else if ("man_6".equals(button)) {
            //myClass.method3();
        } else if ("man_7".equals(button)) {
            //myClass.method3();
        } else if ("man_8".equals(button)) {
            //myClass.method3();
        } else if ("cus_1".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/one.jsp").forward(request, response);
        } else if ("cus_2".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/two.jsp").forward(request, response);
        } else if ("cus_3".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/three.jsp").forward(request, response);
        } else if ("cus_4".equals(button)) {
        	request.getRequestDispatcher("/WEB-INF/views/customer_transactions/four.jsp").forward(request, response);
        } else if ("cus_5".equals(button)) {
            //myClass.method3();
        } else if ("cus_6".equals(button)) {
            //myClass.method3();
        } else if ("cus_7".equals(button)) {
            //myClass.method3();
        } else if ("cus_8".equals(button)) {
            //myClass.method3();
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