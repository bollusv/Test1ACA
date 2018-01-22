
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/register")
@MultipartConfig(maxFileSize = 16177216)

public class PlayerRegistration extends HttpServlet{
		
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			// TODO Auto-generated method stub
			response.setContentType("text/html");
			PrintWriter out = response.getWriter();
			String player_id=request.getParameter("p_id");  
			String player_name=request.getParameter("p_name");
			String dob_DD= request.getParameter("DOB_DD");
			String dob_MM= request.getParameter("DOB_MM");
			String dob_YY= request.getParameter("DOB_YY");
			String gender=request.getParameter("gender");
			String district=request.getParameter("district");
			String bloodgroup=request.getParameter("bloodgroup");
			String proficency=request.getParameter("profeciency");
			String Address1=request.getParameter("address1");
			String Address2 = request.getParameter("address2");
			String Zip = request.getParameter("zip");
			String phonenumber=request.getParameter("phonenumber");
			String mailId=request.getParameter("email");
			String injuries=request.getParameter("injuries");
			
			String DOB=dob_YY+""+dob_MM+""+dob_DD;
			String Address=Address1+","+Address2+","+Zip;
			
		   /* PlayerRegistrationPOJO registerpage = new PlayerRegistrationPOJO(player_id,player_name,dob,gender,district,bloodgroup,proficency,Address,phonenumber,mailId,injuries);
		    DAO dbobj= new DAO();
		    try {
				if (dbobj.database(registerpage)) {
					
					response.sendRedirect("main.html");
					
					
				}
				else
					response.sendRedirect("signout.html");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		    */
			System.out.println(player_id + "" +player_name +""+dob_DD+""+dob_MM+""+dob_YY+""+gender+""+district+""+injuries );
			
			String connectionURL = "jdbc:mysql://localhost:3306/cricket_aca";
			String user = "root";
			String pass = "Manu";
	 
			int result = 0;
			Connection con = null;
			Part part = request.getPart("image");
	 
			if(part != null){
				try{
					Class.forName("com.mysql.jdbc.Driver");
				    con = DriverManager.getConnection(connectionURL, user, pass);
				    
				    PreparedStatement ps = con.prepareStatement("insert into data(image) values(?)");
				    InputStream is = part.getInputStream();
				    ps.setBlob(1, is);
				    result = ps.executeUpdate();
				}
				catch(Exception e){
					e.printStackTrace();
				}	
				finally{
					if(con != null){
						try{
							con.close();
						}
						catch(Exception e){
							e.printStackTrace();
						}
					}
				}
		
		
		
		
		}
		}
}

