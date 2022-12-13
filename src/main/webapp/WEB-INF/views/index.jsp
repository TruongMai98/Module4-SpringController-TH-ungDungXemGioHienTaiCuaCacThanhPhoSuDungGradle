<%--
  Created by IntelliJ IDEA.
  User: TRUONGMAI
  Date: 12/12/2022
  Time: 11:06 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div>
    <h1>Current local time around the world</h1>
</div>
<div>
    <i>Current time in ${city}: ${date}</i>
</div>
<div>
    <form action="/world-clock" method="get" id="locale">
        <select name="city" id="city" onchange="document.getElementById('locale').submit()">
            <option value="Asia/Ho_Chi_Minh" selected>Select a city</option>
            <option value="Asia/Ho_Chi_Minh">Ho Chi Minh</option>
            <option value="Singapore">Singapore</option>
            <option value="Asia/Hong_Kong">Hong Kong</option>
            <option value="Asia/Tokyo">Tokyo</option>
            <option value="Asia/Seoul">Seoul</option>
            <option value="Europe/London">London</option>
            <option value="Europe/Madrid">Madrid</option>
            <option value="America/New_York">New York</option>
            <option value="Australia/Sydney">Sydney</option>
            <option value="Argentina/Buenos_Aires">Buenos Aires</option>
        </select>
    </form>
</div>
</body>
</html>
