import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class helloServlet
 */
@WebServlet("/helloServlet")
public class helloServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public helloServlet() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String username = request.getParameter("username");
		String password = request.getParameter("password");

	      // Actual logic goes here.
	    PrintWriter out = response.getWriter();
//	    String message = username + " " + password;
	    if (checkValid(username,password))
	    {	    	
		out.println("<h1>" + "User Name= "  + username +"</h1>"); 
	    out.println("<h1>" + "Password= "  + password +"</h1>");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	    }	else {
	    	out.println("Invalid user and pasword combination.");
	    }
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
		private static boolean checkValid(String username, String password) {
			boolean isValid = false;
			if (username.equals("walt") & password.equals("password")){
				isValid=true;  
			}else{
				isValid=false;
			}
			
			return isValid;
		
	}

}
