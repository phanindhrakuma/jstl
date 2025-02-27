import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.Filter;

@WebFilter("/addfilter")
public class namefilter implements Filter{

  
    
    public void destroy(){

    }

    public void doFilter(ServletRequest request , ServletResponse response , FilterChain chain) throws IOException, ServletException{

        PrintWriter out = response.getWriter();

        HttpServletRequest req = (HttpServletRequest) request;

        String aname = request.getParameter("aname");

        if(aname.length()>3)
            chain.doFilter(request, response);
        else
            out.println("invalid input name  ");


    }
    public void init(FilterConfig fConfig) {

    }
}
