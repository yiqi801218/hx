<%@ page import="java.sql.Connection" %>
<%@ page import="java.sql.DriverManager" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="java.sql.ResultSet" %>
<html>
<body>
<h2>Hello World!</h2>
hahaha111

<form method="get" action="/servlet/myservlet">
    First name:
    <input type="text" name="firstname" id="first" />
    <br />
    Last name:
    <input type="text" name="lastname" id="last"/>

    <input type="button" value="save" onclick="saveData()" />
</form>

<script>
    function saveData(){
        var fir=document.getElementById("first").value;
        location.href="/index.jsp?first="+fir;
    }
</script>

</body>
</html>
<%
    out.println(request.getParameter("first"));
    Class.forName("com.mysql.jdbc.Driver");

    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/jn", "root", "root");
    Statement statement = connection.createStatement();
    statement.executeUpdate("insert INTO jn1_table (NAME) VALUES ('"+request.getParameter("first")+"')");
    ResultSet resultSet = statement.executeQuery("select * from jn1_table");
    while (resultSet.next()) {
        out.println(resultSet.getString("name"));
    }

    resultSet.close();
    statement.close();
    connection.close();
%>