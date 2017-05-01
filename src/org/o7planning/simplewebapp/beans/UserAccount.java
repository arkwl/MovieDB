package org.o7planning.simplewebapp.beans;
 
public class UserAccount {
 
   public static final String GENDER_MALE ="M";
   public static final String GENDER_FEMALE = "F";
   
   public static final String CUSTOMER = "customer";
   public static final String EMPLOYEE = "employee";
   public static final String MANAGER = "manager";
   
   private String firstName;
   private String lastName;
   private String id;
   private String userLevel;
 
   public UserAccount() {
        
   }
    
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public String getUserLevel() {
		return userLevel;
	}
	
	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}
}