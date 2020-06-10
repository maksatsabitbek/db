
public class Main {

    public static void main(String[] args) throws SQLException {
        Connection con = Database.getInstance().getConnection();
        Statement myCon = con.createStatement();
        ResultSet myRs = myCon.executeQuery("select * from stname");

        while (true){
            try {
                if (!myRs.next()) break;
            } catch (SQLException e) {
                e.printStackTrace();
            }
            System.out.println(myRs.getString(1)+","+myRs.getString(2));
        }
    }
}
