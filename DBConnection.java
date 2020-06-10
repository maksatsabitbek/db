package op;

import java.sql.*;
import com.mysql.jdbc.Driver;

class DBConnection
{
    private static Connection conn;

    private DBConnection(){}

    public static Connection getConnection()
    {
        try
        {
            if(conn==null)
            {
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection("jdbc:mysql://localhost:3307/javadb?useUnicode=true&serverTimezone=UTC&useSSL=true&verifyServerCertificate=false","root","12345");
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }

        return conn;
    }
}
