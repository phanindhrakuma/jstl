import java.sql.*;
public class deo {
    String url ="jdbc:mysql://localhost:3306/aliens";  // the url for the my sql and 3306 is the default port and / aliens is the database name 
    String userName = "root"; // username of the my sql
    String password = "PanduPanduPandu@123"; // password of the my sql
    String Query = "select * from login where username=? and pass=?"; // mysql query
    public boolean check(String uname, String pass) throws Exception{

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");  // jdbc driver name 
            Connection /*instance*/ con = DriverManager.getConnection(url, userName, password); // it is static and get connection is method 
            // connection is the instance so we cant create the obj so we use the drivermanager.get connection
            PreparedStatement st = con.prepareStatement(Query);
            st.setString(1, uname);
            st.setString(2, pass);
            ResultSet rs = st.executeQuery(); // executing the query
            if(rs.next()){
                return true;
            }
            st.close();  // closing the connection for the st and con
            con.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
        
        return false;
    }
}
