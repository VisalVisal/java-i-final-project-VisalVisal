package FinalProject;

import java.util.HashMap;

public class IDandPassword {
   
	 HashMap<String, String> loginInfo = new HashMap<String,String>();
	 
	 IDandPassword() {
		 
		 loginInfo.put("Visal", "Aupp");
		
	 }
	 
	 
	 protected HashMap getLoginInfo() {
		 return loginInfo;
	 }
	 
	
}
