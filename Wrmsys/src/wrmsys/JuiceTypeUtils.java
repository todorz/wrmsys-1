package wrmsys;

import wrmsys.JuiceType;

import javax.jdo.PersistenceManager;

public class JuiceTypeUtils {
	 public static String insertNew(
		      String firstName, String lastName, String city,
		      String state, String phoneNumber) {

		 
		 JuiceType juicetype = new JuiceType();
		 
		  	juicetype.setJuiceName(juiceName);
		  	
		    
		    PersistenceManager pm = PMF.get().getPersistenceManager();
		    pm.makePersistent(entry);

		    System.out.println(
		        "The ID of the new entry is: " + entry.getId().toString());
		    
		    return entry.getId().toString();
		  }
		  
}
