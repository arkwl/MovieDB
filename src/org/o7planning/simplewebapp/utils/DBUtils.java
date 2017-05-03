package org.o7planning.simplewebapp.utils;
 
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import java.sql.Statement;
 
import org.o7planning.simplewebapp.beans.Product;
import org.o7planning.simplewebapp.beans.UserAccount;
 
public class DBUtils {
 
  public static UserAccount findUser(Connection conn, String i_firstName, String i_lastName, String i_id) throws SQLException {
 
      Statement stmt = conn.createStatement();
      ResultSet rs_emp = stmt.executeQuery("SELECT * FROM Employee E, Person P WHERE E.SSN='" + i_id
    		  + "' AND P.firstName = '" + i_firstName + "' AND P.lastName = '" + i_lastName + "'");
      
      Statement stmt_2 = conn.createStatement();
      ResultSet rs_cus = stmt_2.executeQuery("SELECT * FROM Customer C, Person P WHERE C.ID='" + i_id
    		  + "' AND P.firstName = '" + i_firstName + "' AND P.lastName = '" +i_lastName+ "'");
 
      if (rs_emp.next()) {
    	  System.out.println(rs_emp.toString());
          String firstName = rs_emp.getString("firstname");
          String lastName = rs_emp.getString("lastname");
          String id = rs_emp.getString("ssn");
          UserAccount user = new UserAccount();
          user.setFirstName(firstName);
          user.setLastName(lastName);
          user.setId(id);
          
          if (id.equals("789-12-3456")){
        	  user.setUserLevel(UserAccount.MANAGER);
          } else {
        	  user.setUserLevel(UserAccount.EMPLOYEE);
          }
          return user;
      }
      
      if (rs_cus.next()) {
    	  System.out.println(rs_cus.toString());
          String firstName = rs_cus.getString("firstname");
          String lastName = rs_cus.getString("lastname");
          String id = rs_cus.getString("id");
          UserAccount user = new UserAccount();
          user.setFirstName(firstName);
          user.setLastName(lastName);
          user.setId(id);
          user.setUserLevel(UserAccount.CUSTOMER);
          return user;
      }
      return null;
  }
 
  public static UserAccount findUser(Connection conn, String userName) throws SQLException {

	  //testing to make sure it exists
      Statement stmt = conn.createStatement();
      ResultSet rs = stmt.executeQuery("SELECT * FROM PERSON");
 
      if (rs.next()) {
    	  System.out.println(rs.toString());
          String firstName = rs.getString("firstname");
          String lastName = rs.getString("lastname");
          String id = rs.getString("id");
          UserAccount user = new UserAccount();
          user.setFirstName(firstName);
          user.setLastName(lastName);
          user.setId("id");
          return user;
      }
      return null;
  }
 
  public static void queryOneEmp(Connection conn, String orderID, String dateTime, String returnDate, 
		  String accountId, String custRepId, String movieId) throws SQLException {

	  //testing to make sure it exists
      Statement stmt = conn.createStatement();
      String sql_1 = "INSERT INTO Orders (Id, DateTime, ReturnDate) VALUES (" + orderID
    		  + ", '" + dateTime + "', '" + returnDate + "')";
      stmt.executeUpdate(sql_1);
      
      Statement stmt_2 = conn.createStatement();
      String sql_2 = "INSERT INTO Rental (AccountId, CustRepId, OrderId, MovieId) VALUES (" + accountId
    		  + ", " + custRepId + ", " + orderID + ", " + movieId + ")";
      stmt_2.executeUpdate(sql_2);
      
      //put some error handling to see if it has worked
  }
  
  public static void queryTwoAEmp(Connection conn, String ssn, String firstName, String lastName,
		  String address, String zipcode, String telephone, String cc, String rating, String email) throws SQLException {

	  //testing to make sure it exists
      Statement stmt = conn.createStatement();
      String sql_1 = "INSERT INTO Person VALUES ('" + ssn + "', '" + lastName + "', '" + firstName + "', '" + address + "', '" + zipcode + "', '" + telephone + "')";
      stmt.executeUpdate(sql_1);
      
      Statement stmt_2 = conn.createStatement();
      String sql_2 = "INSERT INTO Customer VALUES ('" + ssn + "', '" + email + "', '" + rating + "', '" + cc + "')";
      stmt_2.executeUpdate(sql_2);
      
      //put some error handling to see if it has worked
  }
  
  public static void queryTwoBEmp(Connection conn, String ssn, String firstName, String lastName,
		  String address, String zipcode, String telephone, String cc, String rating, String email) throws SQLException {
	  
	  
	  // STRICTLY UPDATE ONE AT A TIME
	  String set_person = "SET ";
	  String set_customer = "SET ";
	  
	  if(firstName.length() > 0){
		  set_person += ("FirstName = '" + firstName+"'");
	  } 
	  if (lastName.length() > 0) {
		  set_person += ("LastName = '" + lastName+"'");
	  } 
	  if (address.length() > 0) {
		  set_person += ("Address = '" + address+"'");
	  } 
	  if (zipcode.length() > 0) {
		  set_person += ("ZipCode = '" + zipcode+"'");
	  } 
	  if (telephone.length() > 0) {
		  set_person += ("Telephone = '" + telephone+"'");
	  } 
	  if (cc.length() > 0) {
		  set_customer += ("CreditCardNumber = '" + telephone+"'");
	  }
	  if (rating.length() > 0) {
		  set_customer += ("Rating = '" + rating+"'");
	  } 
	  if (email.length() > 0) {
		  set_customer += ("Email = '" + email+"'");
	  } 
	  
	  if (!set_customer.equals("SET ")){
		  Statement stmt = conn.createStatement();
	      String sql_1 = "UPDATE Customer " + set_customer + " WHERE ID = '"+ ssn +"'";
	      stmt.executeUpdate(sql_1);
	  } 
	  else if (!set_person.equals("SET ")){
		  Statement stmt = conn.createStatement();
	      String sql_1 = "UPDATE Person " + set_person + " WHERE SSN = '"+ ssn + "'";
	      stmt.executeUpdate(sql_1);
	  } else {
		  throw new SQLException();
	  }
	  
      
      //put some error handling to see if it has worked
  }
  
  public static void queryTwoCEmp(Connection conn, String ssn) throws SQLException {
      
      Statement stmt_2 = conn.createStatement();
      String sql_2 = "DELETE FROM Customer WHERE ID = '" + ssn + "'";
      stmt_2.executeUpdate(sql_2);
      
      Statement stmt = conn.createStatement();
      String sql_1 = "DELETE FROM Person WHERE SSN = '" + ssn + "'";
      stmt.executeUpdate(sql_1);
      
      //put some error handling to see if it has worked
  }
  
  public static List<Product> queryProduct(Connection conn) throws SQLException {
      String sql = "Select a.Code, a.Name, a.Price from Product a ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      ResultSet rs = pstm.executeQuery();
      List<Product> list = new ArrayList<Product>();
      while (rs.next()) {
          String code = rs.getString("Code");
          String name = rs.getString("Name");
          float price = rs.getFloat("Price");
          Product product = new Product();
          product.setCode(code);
          product.setName(name);
          product.setPrice(price);
          list.add(product);
      }
      return list;
  }
 
  public static Product findProduct(Connection conn, String code) throws SQLException {
      String sql = "Select a.Code, a.Name, a.Price from Product a where a.Code=?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
      pstm.setString(1, code);
 
      ResultSet rs = pstm.executeQuery();
 
      while (rs.next()) {
          String name = rs.getString("Name");
          float price = rs.getFloat("Price");
          Product product = new Product(code, name, price);
          return product;
      }
      return null;
  }
 
  public static void updateProduct(Connection conn, Product product) throws SQLException {
      String sql = "Update Product set Name =?, Price=? where Code=? ";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getName());
      pstm.setFloat(2, product.getPrice());
      pstm.setString(3, product.getCode());
      pstm.executeUpdate();
  }
 
  public static void insertProduct(Connection conn, Product product) throws SQLException {
      String sql = "Insert into Product(Code, Name,Price) values (?,?,?)";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, product.getCode());
      pstm.setString(2, product.getName());
      pstm.setFloat(3, product.getPrice());
 
      pstm.executeUpdate();
  }
 
  public static void deleteProduct(Connection conn, String code) throws SQLException {
      String sql = "Delete Product where Code= ?";
 
      PreparedStatement pstm = conn.prepareStatement(sql);
 
      pstm.setString(1, code);
 
      pstm.executeUpdate();
  }
 
}