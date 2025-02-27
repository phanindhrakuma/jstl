import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/newjstl")
public class newjstl extends HttpServlet{
    private static final long serialVersionUID = 1L;
	
    public newjstl() 
    {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		String Name = "Gowthamraj K";
		
		request.setAttribute("username", Name);
		RequestDispatcher rd = request.getRequestDispatcher("index.jsp");
		rd.forward(request,response);
		
	}
}