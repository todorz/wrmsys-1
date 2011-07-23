package wrmsys;

import javax.servlet.http.HttpServlet;
import java.io.IOException;
import java.util.Date;
import java.util.logging.Logger;
import javax.jdo.PersistenceManager;
import javax.servlet.http.*;
import com.google.appengine.api.users.User;
import com.google.appengine.api.users.UserService;
import com.google.appengine.api.users.UserServiceFactory;
import wrmsys.JuiceType;
import wrmsys.PMF;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@SuppressWarnings("serial")
public class AddJuiceTypeServlet extends HttpServlet {

	    private static final Logger log = Logger.getLogger(AddJuiceTypeServlet.class.getName());

	    public void doPost(HttpServletRequest req, HttpServletResponse resp)
	                throws IOException {
	        JuiceTypeUtils.insertNew(req.getParameter("juicename"), req.getParameter("juicecolour"), req.getParameter("juicedescription"));
  
	        
	resp.sendRedirect("/addJuiceType.jsp");
	    }
	}


