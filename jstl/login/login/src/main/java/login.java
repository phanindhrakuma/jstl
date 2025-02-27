import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/addfilter")
public class login extends HttpServlet {
    
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{

        PrintWriter out = response.getWriter();
        String uname = request.getParameter("uname");
        String pass = request.getParameter("pass");

        deo data = new deo();
        

        try {
            if(data.check(uname, pass)){

                HttpSession session = request.getSession();
                session.setAttribute("username", uname);
                response.sendRedirect("welcome.jsp");
            }
            else{
                response.sendRedirect("index.jsp");
            }
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        
    }
}
