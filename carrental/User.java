import java.util.*;
import java.io.*;

public class User {
	private String Name, userName, contact, emailId;

	public User() {
		Name = "";
		userName = "";
		contact = "";
		emailId = "";
	}

	public void setUser(String N, String c, String eI){
		Name = N;
		contact = c;
		emailId = eI;
	}

	public String getName() {
		return Name;
	}

	public String getUserName() {
		return userName;
	}

	public String getContact() {
		return contact;
	}

	public String getEmailId() {
		return emailId;
	}
}
