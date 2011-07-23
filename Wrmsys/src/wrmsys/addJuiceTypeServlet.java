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

class AddJuiceTypeServlet extends HttpServlet {

	    private static final Logger log = Logger.getLogger(addJuiceTypeServlet.class.getName());

	    public void doPost(HttpServletRequest req, HttpServletResponse resp)
	                throws IOException {

	        JuiceTypeUtils.insert(req.getParameter("juiceName"), req.getParameter("juiceColour"), req.getParameter("juiceDescription"));
	        
	        resp.sendRedirect("/addJuiceType.jsp");
	    }
	}


