<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<body>
<h2>Hello World!</h2>
haha
</body>
</html>
<%
    Class.forName("com.mysql.jdbc.Driver");

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jn", "root", "root");
    Statement statement = connection.createStatement();
    ResultSet resultSet = statement.executeQuery("select * from jn1_table");
    while (resultSet.next()) {
        out.println(resultSet.getString("name"));
    }

    resultSet.close();
    statement.close();
    connection.close();
%>