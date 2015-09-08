<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style>
		body, input{
			font-family: Calibri, Arial;
		}
		table#contact {
			border-collapse: collapse;
			width:550px;
		}
		th {
			height: 40px;
			background-color: #ffee55;
		}
	</style>
	<title>Contact Manager - Struts2 Hibernate Example</title>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<h1>Contact Manager</h1>
<s:actionerror/>

<s:form action="add" method="post">
	<s:textfield name="driver.firstName" label="Firstname"/>
	<s:textfield name="driver.lastName" label="Lastname"/>
	<s:textfield name="driver.address" label="address"/>
	<s:textfield name="driver.cuil" label="cuil"/>
	<s:textfield name="driver.phone" label="phone"/>
	<s:textfield name="driver.numberLicence" label="numberLicence"/>
	<s:submit value="Add Driver" align="center"/>
</s:form>


<h2>Contacts</h2>
<table id="contact" border="1">
<tr>
	<th>Name</th>
		
	<th>Delete</th>
</tr>
<s:iterator value="contactList" var="contact">
	<tr>
		<td><s:property value="lastName"/>, <s:property value="firstName"/> </td>	
		<td><a href="delete?id=<s:property value="id"/>">delete</a></td>
	</tr>	
</s:iterator>
</table>

</body>
</html>