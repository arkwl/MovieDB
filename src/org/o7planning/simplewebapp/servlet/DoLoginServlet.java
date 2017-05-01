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
 
@WebServlet(urlPatterns = { "/doLogin" })
public class DoLoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
    public DoLoginServlet() {
        super();
    }
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
 
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String id = request.getParameter("id");
         
        UserAccount user = null;
        boolean hasError = false;
        String errorString = null;
 
        if (firstName == null || lastName == null || id == null
                 || firstName.length() == 0 || lastName.length() == 0 || id.length() == 0) {
            hasError = true;
            errorString = "Information invalid!";
        } else {
            Connection conn = MyUtils.getStoredConnection(request);
            try {
              
                user = DBUtils.findUser(conn, firstName, lastName, id);
                 
                if (user == null) {
                    hasError = true;
                    errorString = "Information invalid";
                }
            } catch (SQLException e) {
                e.printStackTrace();
                hasError = true;
                errorString = e.getMessage();
            }
        }
        
        // If error, forward to /WEB-INF/views/login.jsp
        if (hasError) {
            user = new UserAccount();
            user.setFirstName(firstName);
            user.setLastName(lastName);
            user.setId(id);
        
            // Store information in request attribute, before forward.
            request.setAttribute("errorString", errorString);
            request.setAttribute("user", user);
 
       
            // Forward to /WEB-INF/views/login.jsp
            RequestDispatcher dispatcher //
            = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
 
            dispatcher.forward(request, response);
        }
     
        // If no error
        // Store user information in Session
        // And redirect to userInfo page.
        else {
            HttpSession session = request.getSession();
            MyUtils.storeLoginedUser(session, user);
             
            if (user.getUserLevel().equals(UserAccount.CUSTOMER))
        	{
        		response.sendRedirect(request.getContextPath() + "/userInfo");
        	}
        	else if (user.getUserLevel().equals(UserAccount.EMPLOYEE))
        	{
        		response.sendRedirect(request.getContextPath() + "/userInfo");
        	}
        	else if (user.getUserLevel().equals(UserAccount.MANAGER))
        	{
        		response.sendRedirect(request.getContextPath() + "/userInfo");
        	}
        	else 
        	{
        		 user = new UserAccount();
                 user.setFirstName(firstName);
                 user.setLastName(lastName);
                 user.setId(id);
             
                 // Store information in request attribute, before forward.
                 request.setAttribute("errorString", "Malformed User");
                 request.setAttribute("user", user);
      
            
                 // Forward to /WEB-INF/views/login.jsp
                 RequestDispatcher dispatcher //
                 = this.getServletContext().getRequestDispatcher("/WEB-INF/views/loginView.jsp");
      
                 dispatcher.forward(request, response);
        	}
            
            // Redirect to userInfo page.
            // response.sendRedirect(request.getContextPath() + "/userInfo");
        }
    }
 
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }
 
}