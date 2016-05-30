import java.sql.*;

/**
 * Created by jiangnan on 16/5/30.
 */
public class MySQLConn {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
//        Class.forName("com.mysql.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jn", "root", "root");
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery("select * from jn1_table");
        while (resultSet.next()){
            System.out.println(resultSet.getString("name"));
        }

        resultSet.close();
        statement.close();
        connection.close();
    }
}
