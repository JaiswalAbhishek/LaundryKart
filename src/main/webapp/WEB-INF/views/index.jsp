<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
	<title>LaundryKart.com</title>
    <link href="<c:url value="/resources/css/LaundryKart.css"/>"  rel="stylesheet">
    <link href="<c:url value="/resources/css/LaundryKart.css"/>"  rel="stylesheet">
    
    <link rel="stylesheet" href="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.12.1/css/all.min.css"/>">
     <script src="<c:url value="https://cdnjs.cloudflare.com/ajax/libs/Chart.js/2.5.0/Chart.min.js"/>"></script>
     
</head>
<body>

	<input type="checkbox" id="check">
  	
	<header>
	      <label for="check">
	        <i class="fas fa-bars" id="sidebar_btn"></i>
	      </label>

	      <div class="left_area">
	        <h3>Laundry <span>Kart</span></h3>
	      </div>

	      <div class="right_area">
	        <a href="#" class="logout_btn">Logout</a>
	      </div>
	 </header>

	 <div class="sidebar">
	      <center>
	        <img src="<c:url value="/resources/img/maxresdefault.jpg"/>" class="profile_image" alt="">
	        <h4>MANAGER</h4>
	      </center>
	      <p onclick="getDashboardData()"><i class="fas fa-chart-area"></i><span>Dashboard</span></p>
	     <!-- <a href="#"><i class="fas fa-cogs"></i><span>Components</span></a>-->
	      <p onclick="getCompanySection()"><i class="fas fa-table"></i><span>Company</span></p>
	      <p onclick="getPurchasingData()"><i class="fas fa-th"></i><span>Purchase</span></p>
	      <p onclick="getDataAboutUs()"><i class="fas fa-info-circle"></i><span>About</span></p>
	      <p onclick="getSettingsCOnfiguration()"><i class="fas fa-sliders-h"></i><span>Settings</span></p>
    </div>

    <div class="content">
		<div id="dashboard-content" class="admin-content">
			<h2>This section will have Analytics part or Analysis Reports in form of chart,PieCHart on sales</h2>
			
				<div id="line-graph-container">
					<canvas id="lineChart" ></canvas>
				</div>
							
			
		</div>
		<div id="company-content" class="admin-content">
			<h2>Section where mangers can setup a new Store or Employee data.</h2>

			<h3>STORE(s)</h3>
			<!--START: All Store Detaild along with Managers -->	
			<table>
				 <tr>
				    <th>Store Name</th>
				    <th>Address</th>
				    <th>Contact No</th>
				    <th>Managed By</th>
				  </tr>
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
<tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
<tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
<tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
<tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
<tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 
				 <tr>
				 	<td>LaundryKart,Kundunhalli</td>
				 	<td>#6, Reddy Square, ECC Road, Whitefield, LandMark: Behind Bhagini Restaurant, Bengaluru, Karnataka 560066</td>
				 	<td>9742597145</td>
				 	<td>Kunal Reddy</td>
				 </tr>
				 



			</table>
<div id="about-us-header">
				<h2>LaundryKart Store Locator</h2>
				<h5>LaundroKart is happy to announce, that we are now operating in most parts of Bangalore!</h5>

				<h5>You can walk in to any LaundroKart store with your Laundry and we will be more than happy to help you.</h5>
			</div>
		
			<div id="store-location-container">
				
				<div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div>

				<div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div>
				<div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div><div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div><div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div><div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div>
			</div>

	
			<!--END: All Store Detaild along with Managers-->	
	
			<!--START: ALll Employee Data-->	
			<!--END:  All Employee Data-->	
		
	


			<!--START: Button to add New Employee and Store -->
			<div class="employee-form-popup" id="employeeForm">
					<h2> Add New Employee</h2>
					<form:form modelAttribute="employee" action="employee" method="POST" class="form-container">
					 
					 	<form:input placeholder="Enter Employee SSN" path="employeeSSN" />
						<form:input placeholder="Enter First Name" path="firstName" /> 
						<form:input placeholder="Enter Last Name" path="lastName" />
						<form:input placeholder="Enter Address" path="Address" />
						<form:input placeholder="Gender" path="gender" /> 
						<form:input placeholder="Enter Email ID" path="emailID" />
						<form:input placeholder="Salary" path="Address" /> 
						<form:input placeholder="Enter Job Title" path="jobTitle" /> 
						
					<button type="submit" class="btn">Add Employee</button>
					<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
				</form:form>
					
					
					
			</div>	

			<div class="store-form-popup" id="storeForm">
					<h2> Add New Store</h2>
				<form:form modelAttribute="store" action="store" method="POST" class="form-container employee-form-container">
					 
				 	<form:input placeholder="Enter Store ID" path="storeID" />
					<form:input placeholder="Enter Store Address" path="storeAddress" /> 
					
					<form:input placeholder="Enter Store Contact No." path="storeContactNumberList" /> 
					
					
					<button type="submit" class="btn">Add Store</button>
					<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
				</form:form>	
			</div>

					<button class="open-button employee-btn" onclick="openFormToAddEmployee()">Add Employee</button>
					<button class="open-button" onclick="openFormToAddNewStore()">Add Store</button>
			<!--END:  Button to add New Employee and Store -->
		</div>


		<div id="purchase-content" class="admin-content">
			<h2>This section is where Managers can purchase a equipement.</h2>


			<!----->
			<h3>Purchase(s)</h3>
			<!--START: All Store Detaild along with Managers -->	
			<table id="purchase-table">
				 <tr>
				    <th>Order No</th>
				    <th>Order Description</th>
				    <th>Purchased on</th>
				    <th>For Store</th>
				  </tr>
				 <tr>
				 	<td>OR11</td>
				 	<td>Godrej Washing Machine</td>
				 	<td>22-04-2020</td>
				 	<td>LaundryKart,Whitefield</td>
				 </tr> 	

				 <tr>
				 	<td>OR12</td>
				 	<td>Dryer Machine</td>
				 	<td>23-04-2020</td>
				 	<td>LaundryKart,Kundunhalli</td>
				 </tr> 	

				 <tr>
				 	<td>OR13</td>
				 	<td>Generator Machine</td>
				 	<td>23-04-2020</td>
				 	<td>LaundryKart,Marathalli</td>
				 </tr> 	

				 
			</table>
				<div class="purchase-form-popup" id="purchaseForm">
					<h2> Buy a new Equipment</h2>
					
					<form:form modelAttribute="equipement" action="equipement" method="POST" class="form-container">
					 	<form:input placeholder="Equipement" path="equipementName" />
						<form:input placeholder="Enter quantity required" path="quanityRequired" /> 
						<button  onclick="updatePurchaseHistory()" class="btn">Buy Now</button>
					   	<button type="button" class="btn cancel" onclick="closeForm()">Close</button>
					</form:form>
				</div>
					<button class="open-button purchase-btn" onclick="openFormToPlaceOrder()">Order a New Equipement</button>
		</div>
		<!--END: Purchase section-->
		<div id="about-us" class="admin-content">
			<h3>About us section.</h3>


			<div id="about-us-header">
				<h2>LaundryKart Store Locator</h2>
				<h5>LaundroKart is happy to announce, that we are now operating in most parts of Bangalore!</h5>

				<h5>You can walk in to any LaundroKart store with your Laundry and we will be more than happy to help you.</h5>
			</div>
		
			<div id="store-location-container">
				
				<div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div>

				<div class="store-location">
					<h3>MAP API</h3>
					<div class="store-location-details">
						<h2>LaundroKart, Jakkur Main Road</h2>
						<p>#24, Surabhi Layout, Jakkur Main Rd, opp. to VDB apartments, Yelahanka, Bengaluru, Karnataka 560064</p>
						<button class="store-btn">Get Direction</button>
						<button class="store-btn">Know More</button>
						<p>Contact Store:099168 58888</p>
					</div>					
				</div>
			</div>
			<div id="store-btn">
				<input type="checkbox" id="store-check">
				<p id="create-store-txt">Add new Store</p>
	  		      <label for="store-check">
					  <i class="fas fa-industry" id="create-store-btn"></i>
			      </label>
		  	</div>

		  	<div id="user-btn">
				<input type="checkbox" id="user-check">
				<p id="create-user-txt">Add an Employee</p>
	  		      <label for="user-check">
					  <i class="fas fa-user" id="create-user-btn"></i>
			      </label>
		  	</div>
	
		  		
		  		

		  	

		</div>

		<div id="settings" class="admin-content">
			<h3>Settings section.</h3>
		</div>				
     </div>

<script type="text/javascript">

	function getDashboardData(){

		document.getElementById("dashboard-content").style.display = "block";
		var block = document.getElementsByClassName("admin-content");
			block[1].style.display="none";block[2].style.display="none";block[3].style.display="none";
			block[4].style.display="none";
		

	}
	function getCompanySection(){
		document.getElementById("company-content").style.display = "block";
		var block = document.getElementsByClassName("admin-content");
			block[0].style.display="none";block[2].style.display="none";block[3].style.display="none";
			block[4].style.display="none";
	}
	function getPurchasingData(){
		document.getElementById("purchase-content").style.display = "block";var block = document.getElementsByClassName("admin-content");
			block[0].style.display="none";block[1].style.display="none";block[3].style.display="none";
			block[4].style.display="none";
	}
	function getDataAboutUs(){
		document.getElementById("about-us").style.display = "block";
		var block = document.getElementsByClassName("admin-content");
		block[0].style.display="none";block[1].style.display="none";block[2].style.display="none";
		block[4].style.display="none";
	}
	function getSettingsCOnfiguration(){

		document.getElementById("settings").style.display = "block";
		var block = document.getElementsByClassName("admin-content");
		block[0].style.display="none";block[1].style.display="none";block[2].style.display="none";
		block[3].style.display="none";
	}

	function openFormToAddNewStore(){
			document.getElementById("storeForm").style.display = "block";
	}
	
	function openFormToAddEmployee(){
		document.getElementById("employeeForm").style.display = "block";
	}
	
	function openFormToPlaceOrder(){
		document.getElementById("purchaseForm").style.display = "block";
	}
	
	function closeForm() {
		  document.getElementById("storeForm").style.display = "none";
		  document.getElementById("employeeForm").style.display = "none";
			document.getElementById("purchaseForm").style.display = "none";
	}

	function updatePurchaseHistory(){
		//purchase-table
			var table = document.getElementById("purchase-table");
 		 	var row = table.insertRow(1);
  			var cell1 = row.insertCell(0);
  			var cell2 = row.insertCell(1);
  			var cell3 = row.insertCell(2);
  			var cell4 = row.insertCell(3);
  			cell1.innerHTML = "OR14";
  			cell2.innerHTML = "Haier Washine Machine";
  			cell3.innerHTML = "24-04-2020";
  			cell4.innerHTML = "Laundrykart,Marathalli";

	}	


</script>
<script type="text/javascript">
		
		var ctx = document.getElementById('lineChart').getContext('2d');
		var chart = new Chart(ctx, {
		    // The type of chart we want to create
		    type: 'line',

		    // The data for our dataset
		    data: {
		        labels: ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul','Aug','Sept','Oct','Nov','Dec'],

		        datasets: [
		        	{
			            label: 'Sales-2018',
			            backgroundColor: 'rgb(255, 99, 132)',
			            borderColor: 'rgb(255, 99, 132)',
			            data: [10, 10, 5, 12, 20, 30, 45,26,13],
			            fill:false,
			            lineTension:0.1,


		        	},
		        	{
			            label: 'Sales-2019',
			            backgroundColor: 'rgb(172, 99, 132)',
			            borderColor: 'rgb(172, 99, 132)',
			            data: [20.3, 28, 35, 18, 45, 59, 69,35,78],
			            fill:false,
			            lineTension:0.1

		        	}
		        ]
		    },
		   

		    // Configuration options go here
		    options: {}
    				

		});


	</script>
</body>
</html>