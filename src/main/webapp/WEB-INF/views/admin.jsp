<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
	<!DOCTYPE html>
	<html>
	<head>
	<meta charset="ISO-8859-1">
	<title>LaundryKart.com</title>
<!-- 	<style type="text/css"> -->
		
<!-- 	</style> -->
<link href="<c:url value="/resources/css/style.css"/>"    rel="stylesheet">

	</head>
	<body>
	
	<div class="laundry-container">
		<div class="laundry-header"></div>
		<div class="laundry-body">
			<div class="dashboard">
				<div id="order" onclick="makeAnOrderForNewEquipement()">Create an Order</div>
				<div id="create-employee" onclick="displayEmployeeForm()">Add a new Employee</div>
				<div id="setup-store" onclick="setupAndViewStore()">View/Setup Store(s)</div>
				<div id="inventory" onclick="getAllInventory()">Services</div>
			</div>
			<div class="dashboard-container">
				<div id="order-container" class="dashboard-container-inner">Order Form</div>
				<div id="employee-container" class="dashboard-container-inner">
					<div id="userRegistrationForm">
					            <h1  id="mainHead">Enter details of New Employee</h1>
					            <!-- <h5 id="descHead">Sign up for your Learning Platform</h5> -->
					            <form:form modelAttribute="employee" action="account" method="POST">
					            
					            <table>
							          	<tr>
							            	<td>  
							            		 <form:label for="employeeSSN" path="employeeSSN" cssErrorClass="error">Social Security Number</form:label>
											</td>
							            	<td>
							            		<form:input path="employeeSSN" /> <form:errors path="employeeSSN" />
							            	</td>
							            </tr>
	
										<tr>
							            	<td>  
							            		<form:label for="firstName" path="firstName" cssErrorClass="error">First Name</form:label>
											</td>
							            	<td>
							            		<form:input path="firstName" /> <form:errors path="firstName" />
							        		</td>
							            </tr>
					            
							          	<tr>
							            	<td> 
							            		<form:label for="lastName" path="lastName" cssErrorClass="error">Last Name</form:label>
											</td>
							            
							            	<td>
							            		<form:input path="lastName" /> <form:errors path="lastName" />
							            	</td>
							            </tr>
										<tr>
							            	<td>  
							            			<form:label for="gender" path="gender" cssErrorClass="error">Gender</form:label>
							            	</td>
							            	<td>
							            			<form:input path="gender" /> <form:errors path="gender" />
							            	</td>
							            </tr>
							          	<tr>
							            	<td>  
							            		<form:label for="Address" path="Address" cssErrorClass="error">Address</form:label>
											</td>
							            	<td>
							            		<form:input path="Address" /> <form:errors path="Address" />
							            	</td>
							            </tr>
										<tr>
							            	<td>  
							            		<form:label for="emailID" path="emailID" cssErrorClass="error">Email Id</form:label>
											</td>
							            
							            	<td>
							            		<form:input path="emailID" /> <form:errors path="emailID" />
							            	</td>
							            </tr>
					            
					            		<tr>
							            	<td>  
							            		<form:label for="salary" path="salary" cssErrorClass="error">Salary</form:label>
											</td>
							            	<td>
							            		<form:input path="salary" /> <form:errors path="salary" />
							            	</td>
							            </tr>
							            
					            		<tr>
							            	<td> 
							            		<form:label for="jobTitle" path="jobTitle" cssErrorClass="error">Job Title</form:label>
											</td>
							            	<td>
							            		<form:input path="jobTitle" /> <form:errors path="jobTitle" />
					        	 			</td>
							            </tr>
					           </table>
					        			   <input type="Submit" name="saveUser" value="Register"/>
					   			   </form:form>
					</div>
	
				</div>
				<div id="setup-store-container" class="dashboard-container-inner">
					<p>Store Details</p>
					<button class="open-button" onclick="openFormToAddNewStore()">Add new Store</button>
				
					<table class="tableblk">
						<tr><th>Store ID</th><th>Store Address</th><th>Contact Number 1</th><th>Contact Number 2</th></tr>
						
						<c:forEach var="store" items="${storeList}">
								<tr>		
									<td>${store.storeID}</td>
									<td>${store.storeAddress}</td>
									<c:forEach var="contact" items="${store.storeContactNumberList}">
										<td>${contact}</td>
									</c:forEach>
								</tr>
						</c:forEach>
					</table>
				
				<div class="store-form-popup" id="storeForm">
					<h2> Store Details</h2>
					<form:form modelAttribute="store" action="newStore" method="POST" class="form-container">
					 
					 	<form:label for="storeID" path="storeID" cssErrorClass="error">Enter Store ID</form:label>
						<form:input path="storeID" /> <form:errors path="storeID" />
						
						<form:label for="storeAddress" path="storeAddress" cssErrorClass="error">Enter Store Address</form:label>
						<form:input path="storeAddress" /> <form:errors path="storeAddress" />
						
						<form:label for="storeContactNumberList" path="storeContactNumberList" cssErrorClass="error">Enter Contact Number</form:label>
						<form:input path="storeContactNumberList" /> <form:errors path="storeContactNumberList" />
						
						<button type="submit" class="btn">Add Store</button>
						<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
					
					 	
						</form:form>
			
				</div>
				
	
			</div>
				<div id="inventory-container" class="dashboard-container-inner">History Data</div>
		</div>
	</div>
		<div class="laundry-footer"></div>	
	</div>
	
	<script type="text/javascript">
		function makeAnOrderForNewEquipement(){
			document.getElementById("order-container").style.display="block";
			var block = document.getElementsByClassName("dashboard-container-inner");
			block[1].style.display="none";block[2].style.display="none";block[3].style.display="none";
		}
		function displayEmployeeForm(){
			document.getElementById("employee-container").style.display="block";
			var block = document.getElementsByClassName("dashboard-container-inner");
			block[0].style.display="none";block[2].style.display="none";block[3].style.display="none";
	
		}
		function setupAndViewStore(){
			document.getElementById("setup-store-container").style.display="block";
			var block = document.getElementsByClassName("dashboard-container-inner");
			block[0].style.display="none";block[1].style.display="none";block[3].style.display="none";
		}
		function getAllInventory(){
			document.getElementById("inventory-container").style.display="block";
			var block = document.getElementsByClassName("dashboard-container-inner");
			block[0].style.display="none";block[1].style.display="none";block[2].style.display="none";
		}
	
		function openFormToAddNewStore(){
			document.getElementById("storeForm").style.display = "block";
		}

		function closeForm() {
		  document.getElementById("storeForm").style.display = "none";
		}
		
	</script>
	</body>
	</html>