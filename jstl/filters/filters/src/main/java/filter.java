import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addfilter")
public class filter extends HttpServlet {
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{

        PrintWriter out = response.getWriter();

        int aid = Integer.parseInt(request.getParameter("aid"));
        String aname = request.getParameter("aname");

        out.println("hello "+aname);
    }
}
