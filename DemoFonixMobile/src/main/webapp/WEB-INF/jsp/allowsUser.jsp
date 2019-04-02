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
		input[type=text], select {
		  width: 100%;
		  padding: 12px 20px;
		  margin: 8px 0;
		  display: inline-block;
		  border: 1px solid #ccc;
		  border-radius: 4px;
		  box-sizing: border-box;
		}
		
		input[type=submit] {
		  width: 100%;
		  background-color: #4CAF50;
		  color: white;
		  padding: 14px 20px;
		  margin: 8px 0;
		  border: none;
		  border-radius: 4px;
		  cursor: pointer;
		}
		
		input[type=submit]:hover {
		  background-color: #45a049;
		}
		
		div {
		  border-radius: 5px;
		  background-color: #f2f2f2;
		  padding: 20px;
		}
	</style>
</head>

<body>
	<h3>Java technical challenge  Form</h3>
	<div>
		<form action="search" method="post">
		      
		      <label for="emailAddress">Email Address:</label>
		      <input type="text" id="emailAddress" name="emailAddress" placeholder="Your EMAIL...">
		      
		      <label for="fOrigine">Flight origin</label>
    		  <input type="text" id="fOrigine" name="fOrigine" placeholder="Your origin.."> 
    		  
    		  <label for="flightDestination">Flight Destination</label>
    		  <input type="text" id="flightDestination" name="flightDestination" placeholder="Your Destination.."> 
    		    
		  
		       <label for="frequencies">Choose frequencies</label>
		       <select id="frequencies" name="frequencies">
		       	    <option value="0">--SELE...</option> 
		       	    <c:forEach items="${listFrequencies}" var="month">
		       	          <option value="${month.id}">${month.frequencies}</option>
				    </c:forEach>
				</select>
		      
		      <label for="userToken">User token id</label>
		      <input type="text" id=userToken name="userToken" value="${userToken}" readonly="readonly">
		       
		    <input type="submit" value="SEARCH FIGHT">
			
		</form>
	</div>
</body>
</html>