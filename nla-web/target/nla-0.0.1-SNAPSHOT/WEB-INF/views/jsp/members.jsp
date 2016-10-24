<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>


<html>
	<head>
		<meta name="viewport" content="width=device-width, initial-scale=1">
    	<title>National Library of Australia</title>
		
		<!-- Bootstrap CSS -->
	    <link href="<c:url value="/resources/css/bootstrap.css" />" rel="stylesheet">
	    
	   	<link href="<c:url value="/resources/css/nla.css" />" rel="stylesheet">
    	
    	<!-- Scripts jQuery & Bootstrap -->
	    <script src="<c:url value="/resources/js/jquery-3.1.1.min.js" />"></script>
	    <script src="<c:url value="/resources/js/jquery-ui.min.js" />"></script>
	    <script src="<c:url value="/resources/js/bootstrap.js" />"></script>
	    
	    <!-- Custom Scripts -->
	    <script src="<c:url value="/resources/js/main.js" />"></script>
		
		<link rel="icon" href="data:;base64,iVBORw0KGgo=">
	</head>
	<body>

		<nav class="navbar navbar-default" role="navigation">
			<div class="container">
	
				<div class="navbar-header">
					<button type="button" class="navbar-toggle" data-toggle="collapse"
						data-target="#bs-example-navbar-collapse-1">
						<span class="sr-only">Toggle navigation</span> 
					</button>
					<a class="navbar-brand" href="/">National Library Of Australia</a>
				</div>
	
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav nav-pills">
						<li role="presentation" class="active"><a href="/"
							title="Members">Members</a></li>
						<li><a href="/books"
							title="Books">Books</a></li>		
					</ul>
				</div>
			</div>
		</nav>
		
		<!-- Page Content -->
	    <div class="container">
	        <div class="row">
	            <div class="col-lg-12">
	               
				  	<table  class="table table-striped">
				       	<thead>
				           	<tr>
				               	<th># Member No.</th>
				               	<th>First name</th>
				               	<th>Last name</th>
				               	<th>Phone No.</th>
				               	<th>E-mail</th>
				               	<th>Details</th>
				           	</tr>
				       	</thead>
				       	
				       	<c:forEach var="member" items="${members}">
	           				<tr>
				               	<td>${member.userId}</td>
				               	<td>${member.givenName}</td>
				               	<td>${member.lastName}</td>
				               	<td>${member.phoneNumber}</td>
				               	<td>${member.email}</td>
				               	<c:choose>
					               	<c:when test="${fn:length(member.checkOuts) > 0}">
					               		<td><input type="button" id="${member.userId}" class="displayDetails" value="Show Books Lent"/></td>
					               	</c:when>
					               	<c:otherwise>
					               		<td>No Books Lent</td>
					               	</c:otherwise>
				               	</c:choose>
			           		</tr>
	         			</c:forEach>
	         	       	
				   	</table>
	            </div>
	        </div>
	    </div>
		    
	   	<!-- Modal -->
	


		<div class="modal fade" role="dialog" id="myModal" tabindex="-1"
			aria-labelledby="myModalLabel" style="display: none;">
			<div class="modal-dialog modal-lg" role="document">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal"
							aria-label="Close">
							<span aria-hidden="true">×</span>
						</button>
						<h4 class="modal-title" id="myModalLabel"></h4>
					</div>
					<div class="modal-body" id="tableBody">
						
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					</div>
				</div>
			</div>
		</div>
	</body>
</html>