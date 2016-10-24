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
						<span class="sr-only">Toggle navigation</span> <i class="icon-menu"></i>
						Menu
					</button>
					<a class="navbar-brand" href="/">National Library Of Australia</a>
				</div>
	
				<div class="collapse navbar-collapse"
					id="bs-example-navbar-collapse-1">
					<ul class="nav nav-pills">
						<li><a href="/"
							title="Members">Members</a></li>
						<li role="presentation" class="active"><a href="/books"
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
				               	<th class="col-lg-2"># Book No.</th>
				               	<th class="col-lg-3">Title</th>
				               	<th class="col-lg-3">ISBN</th>
				               	<th class="col-lg-4">Author</th>
				           	</tr>
				       	</thead>
				       	
				       	<c:forEach var="book" items="${books}">
	           				<tr>
				               	<td>${book.id}</td>
				               	<td>${book.title}</td>
				               	<td>${book.isbn}</td>
				               	<td>${book.author}</td>
			           		</tr>
	         			</c:forEach>
	         	       	
				   	</table>
	            </div>
	        </div>
	    </div>
		    
	   	
	</body>
</html>