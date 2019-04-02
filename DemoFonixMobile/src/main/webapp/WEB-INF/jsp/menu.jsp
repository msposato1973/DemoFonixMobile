<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
#customers {
	font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

#customers td, #customers th {
	border: 1px solid #ddd;
	padding: 8px;
}

#customers tr:nth-child(even) {
	background-color: #f2f2f2;
}

#customers tr:hover {
	background-color: #ddd;
}

#customers th {
	padding-top: 12px;
	padding-bottom: 12px;
	text-align: left;
	background-color: #4CAF50;
	color: white;
}
</style>
<body>
	
    <form action="sendMail" method="post">
    
    <input type="hidden" id="emailAddress" name="emailAddress" value="${allowsUser.emailAddress}">
    <input type="hidden" id="fOrigine" name="fOrigine" value="${allowsUser.fOrigine}">
    <input type="hidden" id="flightDestination" name="flightDestination" value="${allowsUser.flightDestination}">
    <input type="hidden" id="description" name="description" value="${allowsUser.description}">
    <input type="hidden" id="frequencies" name="frequencies" value="${allowsUser.frequencies}">
    
        <p> Well Done : ${emailAddress}</p>
		<p> ${msg}</p>
		<table id="customers">
				<tr>
					<th>Destination</th>
					<th>Origin</th>
					<th>Flight Date</th>
					<th>Flight Num.</th>
					<th>Price.</th>
				</tr>
				<c:forEach items="${listflight}" var="item">
					<tr>
						<td>${item.destination}</td>
						<td>${item.origin}</td>
						<td>${item.flightDate}</td>
						<td>${item.flightNumber}</td>
						<td>${item.price}</td>
					</tr>
				 </c:forEach>
		</table>
		 <input type="submit" value="SEND MAIL To....">
	</form>
</body>
</html>