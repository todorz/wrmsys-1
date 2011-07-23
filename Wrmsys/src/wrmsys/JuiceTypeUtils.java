package wrmsys;

import wrmsys.JuiceType;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class JuiceTypeUtils {
	 public static String insertNew(
		      String juiceName, String juiceColour, String juiceDescription) {

		 PersistenceManager pm = PMF.get().getPersistenceManager();	 
	 JuiceType juicetype = new JuiceType("crap","ass","mofo");
		 
	 juicetype.setJuiceName("ass");
	 juicetype.setJuiceColor("shit");
		  	juicetype.setJuiceDescription("shit");
//		    
//		    PersistenceManager pm = PMF.get().getPersistenceManager();
		    pm.makePersistent(juicetype);

//		    System.out.println(
//		        "The ID of the new entry is: " + juicetype.getJuiceTypeId().toString());
		    
//		    return juicetype.getJuiceTypeId().toString();
return "shit";
	 }
		  
}


