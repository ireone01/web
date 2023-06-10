package control;

import dao.DAO;
import entity.Product;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Admin
 */
@WebServlet(name = "CartControl", urlPatterns = {"/CartControl"})
public class CartControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
       String id =request.getParameter("id");
       Cookie arr[] =request.getCookies();
       String txt="";
       for(Cookie o : arr){
           if(o.getName().equals("id")){
               txt =txt + o.getValue();
               o.setMaxAge(0);
               response.addCookie(o);
           }
       }
       if(txt.isEmpty()){
           txt=id;
       }else{
           txt=txt+"," + id;
       }
       Cookie c= new Cookie("id" ,txt);
       c.setMaxAge(60*60*24);
       response.addCookie(c);
       response.sendRedirect("print");
    }
}