<%--
  Created by IntelliJ IDEA.
  User: HI
  Date: 11/23/2021
  Time: 10:04 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Calculator</h1>
<form  method="post">
    <table>
        <tr>
            <td><input type="text" name="num1"> </td>
            <td><input type="text" name="num2"> </td>
        </tr>
    </table>
    <input type="submit" name="math" value="+">
    <input type="submit" name="math" value="-">
    <input type="submit" name="math" value="*">
    <input type="submit" name="math" value="/">
</form>
Result: ${result}
</body>
</html>
