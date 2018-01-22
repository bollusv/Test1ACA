


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Login")

public class UserValidation extends HttpServlet{
		
		

		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String UserName=request.getParameter("uname");  
			String Password=request.getParameter("password");
			String Admin="bollu";
			String APassword="aca";

			System.out.println(UserName);
			System.out.println(Password);
            
			
			
		    
		    try {
				if (UserName.equals(Admin) && Password.equals(APassword)) {
					response.sendRedirect("home.html");
					}
				
				else
					{
					   out.println("<script type=\"text/javascript\">");
					   out.println("location='index.html';");
					   out.println("alert('User or password incorrect');");
					   out.println("</script>");
					}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    
		   
		
		
		
		}
	

}
