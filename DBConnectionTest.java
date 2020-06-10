package op;

import java.sql.*;
import op.*;
import com.mysql.jdbc.Driver;

class DBConnectionTest{
    public static void main(String [] args)
    {
        Connection conn = op.DBConnection.getConnection();

        try
        {
            String query = "Select * From stname";
            Statement st = conn.createStatement();
            ResultSet rst = st.executeQuery(query);

            while(rst.next())
            {
                System.out.println(rst.getString("id")+" "+rst.getString("username"));
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }finally
        {
            try{
                conn.close();
            }catch(SQLException ex)
            {
                ex.printStackTrace();
            }
        }

    }
}
