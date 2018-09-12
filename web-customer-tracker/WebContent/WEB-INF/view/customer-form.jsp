<%@ taglib prefix= "form" uri= "http://www.springframework.org/tags/form"  %>
<!DOCTYPE html>
<html>
<head>
<title>Adding new customer</title>
<link type = "tex/css"
	rel = "stylesheet"
	href = "${pageContext.request.contextPath}/resources/css/style.css">
	
<link type = "tex/css"
	rel = "stylesheet"
	href = "${pageContext.request.contextPath}/resources/css/add-customer-style.css">
</head>
<body>
<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
		<div id="content">
		<h3> Save Customer</h3>
		<form:form action="saveCustomer" modelAttribute="customers" method = "POST">
		<!-- add association with customers id -->
		<form:hidden path="id"/>
		<table>
		<tbody>
				<tr>
					 <td> <label> Company name:</label></td>
					 <td> <form:input path = "companyName" /> </td>
			    </tr>
			    
				<tr> 
					 <td> <label> Country and City:</label></td>
					 <td><form:input path = "city" /></td>
				</tr>
				
				<tr>	 
					 <td> <label> Contact details:</label></td>
					 <td><form:input path = "contactDetails" /></td>
				</tr> 
				
				<tr>	 
					 <td> <label> Contact person:</label></td>
					 <td><form:input path = "contactPerson" /></td>
				</tr>
					 
				<tr> 	 
					 <td> <label> Result:</label></td>
					 <td><form:input path = "result" /></td>
				</tr> 
				
				<tr>	 
					 <td> <label> Follow-up call:</label></td>
					 <td><form:input path = "followUpCall" /></td>
				</tr> 	
				
				<tr> 
					 <td> <label> Sales Manager:</label></td>
					 <td><form:input path = "salesManager" /></td>
				</tr>
				
				<tr>
					<td> <label></label></td>
					<td><input type = "submit" value ="Save" class ="save" /></td>
				</tr> 
				
			
				</tbody>		
			</table>
		
		</form:form>
		<div style = "clear; both;"></div>
		<p>
			<a href= "${pageContext.request.contextPath}/customer/list"> Back to list</a>
		<p>
	</div>
	
</body>
</html>