package org.o7planning.simplewebapp.conn;
 
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
 
public class MySQLConnUtils {
 
public static Connection getMySQLConnection()
        throws ClassNotFoundException, SQLException {
  
    // Note: Change the connection parameters accordingly.
    String hostName = "localhost";
    String dbName = "movie_system";  // TODO: change to movie_system
    String userName = "postgres";
    String password = "smolka";
    return getMySQLConnection(hostName, dbName, userName, password);
}
 
public static Connection getMySQLConnection(String hostName, String dbName,
        String userName, String password) throws SQLException,
        ClassNotFoundException {
	
	
    Connection conn = null;
    Statement stmt = null;
    try {
       Class.forName("org.postgresql.Driver");
       conn = DriverManager
          .getConnection("jdbc:postgresql://localhost:5432/movie_system",
          "postgres", "smolka");
       conn.setAutoCommit(false);
       System.out.println("Opened database successfully");

    }
    catch( Exception e){
        System.err.println( e.getClass().getName()+": "+ e.getMessage() );
        System.exit(0);
    }
    return conn;
    
}
}
    