import java.sql.*;

/**
 * Created by jiangnan on 16/5/30.
 */
public class MySQLConn {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jn", "root", "root");
        Statement statement = connection.createStatement();

        int row1=statement.executeUpdate("INSERT INTO jn1_table (NAME) VALUES ('abc')");

        int row2=statement.executeUpdate("UPDATE jn1_table SET NAME ='123' WHERE name='abc'");

        ResultSet resultSet = statement.executeQuery("select * from jn1_table");
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }
        resultSet.close();

        int row3=statement.executeUpdate("DELETE FROM jn1_table WHERE name ='123' ");

        System.out.println("SELECT:");
        ResultSet resultSet2 = statement.executeQuery("select * from jn1_table");
        while (resultSet2.next()){
            System.out.println(resultSet2.getString("name"));
        }

        resultSet2.close();

        statement.close();
        connection.close();
    }
}
