package wrmsys;

import wrmsys.JuiceType;

import javax.jdo.PersistenceManager;
import javax.jdo.Query;

public class JuiceTypeUtils {
	 public static String insertNew(
		      String juiceName, String juiceColour, String juiceDescription) {

	
	 JuiceType juicetype = new JuiceType();
		 
	 juicetype.setJuiceName(juiceName);
	 juicetype.setJuiceColor(juiceColour);
		  	juicetype.setJuiceDescription(juiceDescription);
	    
		    PersistenceManager pm = PMF.get().getPersistenceManager();
		    pm.makePersistent(juicetype);

		    System.out.println(
		        "The ID of the new entry is: " + juicetype.getJuiceTypeId().toString());
		    
		    return juicetype.getJuiceTypeId().toString();
	
	 }
		  
}


