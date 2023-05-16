package libsoz;

import java.sql.*;  
import java.util.ArrayList;

public class DB {
    
    public Connection conn;
    
    public boolean connectDB()
    {
        try 
        {
            Class.forName("com.mysql.jdbc.Driver");
            this.conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/libsoz", "root", "");
            return true;
        } 
        catch (Exception e) 
        {
            return false;
        }
    }
    
    public ResultSet getRS(String sql)
    {
        try {
            if (conn == null)
                connectDB();
            
            Statement st = this.conn.createStatement();
            ResultSet rs = st.executeQuery(sql);
            return rs;
        } 
        catch (SQLException err) 
        {
            err.printStackTrace();
            return null;
        }
    }
    
      public boolean Execute(String sql)
    {
        try {
            if (conn == null)
                connectDB();
            
            Statement st = this.conn.createStatement();
            int numberOfAffectedRecord = st.executeUpdate(sql);
            return numberOfAffectedRecord == 1;
        } 
        catch (SQLException err) 
        {
            System.out.println(err.getMessage());
            return false;
        }
    }
    
}
