

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/refresh"})
public class refresh extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out=response.getWriter();
        out.println("TestServlet days hi at"+new Date());
        try {
            
            String AccName=request.getParameter("AccName");
            String AccNum=request.getParameter("AccNum");
            String Branch=request.getParameter("Branch");
            String Place=request.getParameter("Place");
            String date=request.getParameter("date");
            
            
           
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet refresh</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Customer Account Details</h2>");
            out.println("<font face=6>Dear User</br>");
            out.println("Your Information<br><br>");
            out.println("Account Name:"+AccName+"</br>");
            out.println("Account Number:"+AccNum+"<br>");
            out.println("Branch:"+Branch+"<br>");
            out.println("Place:"+Place+"<br>");
            out.println("date:"+date+"</br></font>");
            
           
            out.println("</body>");
            out.println("</html>");
        }
        finally
        {
            out.close();
        }
    }

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
