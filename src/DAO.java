

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;



public class DAO {
	
	public boolean database(PlayerRegistrationPOJO playerreg) throws Exception {
		
		String user = "Bapuji@cricketaca";
        String password = "Bollub@79";
        boolean result=false;
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
        }
        catch (ClassNotFoundException e)
        {
            throw new ClassNotFoundException("MySQL JDBC driver NOT detected in library path.", e);
        }

        System.out.println("MySQL JDBC driver detected in library path.");
        Connection connection = null;
        try
        {
        	String url =String.format("jdbc:mysql://cricketaca.mysql.database.azure.com:3306/players?verifyServerCertificate=true&useSSL=true&requireSSL=false; user=%s;password=%s;",user,password);
         
            // Set connection properties.
            Properties properties = new Properties();
            properties.setProperty("user", user);
            properties.setProperty("password", password);
            properties.setProperty("useSSL", "true");
            properties.setProperty("verifyServerCertificate", "true");
            properties.setProperty("requireSSL", "false");

            // get connection
            connection = DriverManager.getConnection(url, properties);
        }
        catch (SQLException e)
        {
            throw new SQLException("Failed to create connection to database.", e);
        }
        if (connection != null) 
        { 
            System.out.println("Successfully created connection to database.");

            // Perform some SQL queries over the connection.
            try
            {
                // Drop previous table of same name if one exists.
                Statement statement = connection.createStatement();
                

                // Create table.
                
                String sql;
               //sql=INSERT INTO `players`.`reg_player` (`player_id`, `name`, `dob`, `gender`, `district`, `phoneno`, `emailid`, `blood_group`, `proficency`, `history_iinjuries`, `address`) VALUES ('10002', 'kalyani seedrala', '20/08/1992', 'female', 'guntur', '+919848340467', 'kalyani@gmail.com', 'O+', 'bastman', 'nothing much', '1800 rhodes rd kent oh-44240');

                sql="SELECT * FROM payment.signin where username='srivarshabollu123@gmail.com' and password='Manu24varsha';";
                //sql = "SELECT * FROM players.login where username='"+ logindata.getUsername()+"' and password='"+logindata.getPassword()+"'";
                ResultSet rs = statement.executeQuery(sql);
                result= rs.next(); 
                System.out.println(result);
            }
            catch (SQLException e)
            {
                throw new SQLException("Encountered an error when executing given sql statement.", e);
            }       
        }
        else {
            System.out.println("Failed to create connection to database.");
        }
        System.out.println("Execution finished.");
        return result;
    }

	

}
