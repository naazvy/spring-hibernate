<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>

<html>

<head>
	<title>List Customers</title>
	
	<!-- reference our style sheet -->

	<link type="text/css"
		  rel="stylesheet"
		  href="${pageContext.request.contextPath}/resources/css/style.css" />

</head>

<body>

	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	
	<div id="container">
	
		<div id="content">
		
			<!-- put new button: Add Customer -->
		
			<input type="button" value="Add Customer"
				   onclick="window.location.href='showFormForAdd'; return false;"
				   class="add-button"
			/>
		
			<!--  add our html table here -->
		
			<table>
				<tr>
					 <th>company name</th>
					 <th>country and city</th>
					 <th>contact details</th>
					 <th>contact person</th>
					  <th>result</th>
					  <th>follow up call</th>
					  <th>sales manager</th>
					  <th>Action</th>
					
				</tr>
				
				<!-- loop over and print our customers -->
				<c:forEach var="tempCustomer" items="${customers}">
				
					<!-- construct an "update" link with customer id -->
					<c:url var="updateLink" value="/customer/showFormForUpdate">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>	
									
				<!-- construct an "DELETE"  -->
					<c:url var="deleteLink" value="/customer/delete">
						<c:param name="customerId" value="${tempCustomer.id}" />
					</c:url>					
					<tr>
						<td> ${tempCustomer.companyName} </td>
						<td> ${tempCustomer.city} </td>
						<td> ${tempCustomer.contactDetails} </td>
						<td> ${tempCustomer.contactPerson} </td>
						<td> ${tempCustomer.result} </td>
						<td> ${tempCustomer.followUpCall} </td>
						<td> ${tempCustomer.salesManager} </td>
					
						<td>
							<!-- display the update link -->
							<a href="${updateLink}">update</a>
						
						<!-- display the delete link -->
							<a href="${deleteLink}" onclick = "if(!(confirm('Do you confirm deleting the customer?'))) return false">delete</a>
						
						</td>
		
					</tr>
				
				</c:forEach>
						
			</table>
				
		</div>
	
	</div>
	

</body>

</html>









