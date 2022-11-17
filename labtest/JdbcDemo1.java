// Viral Dangar

// 1)Prepare Students Table with Sid,Sname,Marks,Course In Oracle Sql ?
//2)CRUD OPERATIONS [insert,update,delete,select] on Students table?

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo1 {


    public static void main(String[] args) throws SQLException {
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/demo3","root","1234");
        Statement st=con.createStatement();
        st.executeUpdate("create table student(sid int,sname varchar(50),marks int,Course varchar(50))");
        int rs=st.executeUpdate("insert into student values(1,'viral',90,'java'),(2,'Jack',80,'sql')");
        if(rs>0)
        {
            System.out.println("Row inserted");
        }
        else
        {
            System.out.println("Ron can't inserted");
        }
        int rs1=st.executeUpdate("update student set sname='Rohit' where sid=2");
         System.out.println(rs1+"Row updated");
         int rs2=st.executeUpdate("delete from student where sid=2");
        System.out.println(rs2+"Row deleted");
        ResultSet rs3=st.executeQuery("select * from student");
        while(rs3.next())
        {
            System.out.println(rs3.getInt(1)+" "+rs3.getString(2)+" "+rs3.getInt(3)+""+rs3.getString(4));
        }
        con.close();
    }

}
