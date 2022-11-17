////Prepared Statement,Statement interface methods on Students Table?
// viral Dangar
import java.sql.*;

public class JdbcDemo2 {
    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo3","root","1234");
        PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");
        ps.setInt(1,1);
        ps.setString(2,"viral");
        ps.setInt(3,95);
        ps.setString(4,"java");
        int n=ps.executeUpdate();
        System.out.println(n+" Result inserted");
        con.close();
    }
}
