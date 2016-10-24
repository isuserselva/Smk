$( document ).ready(function($) {
	
	console.log( "ready!" );
	
	$( ".displayDetails" ).click(function() {
		
		getCheckOutsByUserId($(this).attr('id'));
	});

});

function getCheckOutsByUserId(id) {
	
	console.log("checkOutsByUserId");
	console.log("id"+id);
	
	$.ajax({
		type : "GET",
		contentType : "application/json",
		url : "checkOutsByUserId",
		data : {userId:id},
		dataType : 'json',
		timeout : 100000,
		success : function(data) {
			console.log("SUCCESS: ", data);
			display(data);
		},
		error : function(e) {
			console.log("ERROR: ", e);
			display(e);
		},
		done : function(e) {
			console.log("DONE");
		}
	});
}

function display(data) {
	
	var obj = data;
	
	var html = "<table  class='table table-striped' id='Results'>"+
   	"<thead>"+
       	"<tr>"+
           	"<th># Book No.</th>"+
           	"<th>Title</th>"+
           	"<th>ISBN</th>"+
           	"<th>Author</th>"+
           	"<th>Borrowed Date</th>"+
           	"<th>Due Date</th>"+
           	"<th>Overdue(Y/N)</th>"+
       	"</tr>"+
   	"</thead>";
	
	jQuery.each(obj.checkOuts, function(i, checkOut) {
		
		html = html +	"<tr>"+
				           	"<td>"+checkOut.book.id+"</td>"+
				           	"<td>"+checkOut.book.title+"</td>"+
				           	"<td>"+checkOut.book.isbn+"</td>"+
				           	"<td>"+checkOut.book.author+"</td>"+
							"<td>"+parseJsonDate(checkOut.borrowedDate)+"</td>"+
						    "<td>"+parseJsonDate(checkOut.dueDate)+"</td>"+
						    "<td>"+isOverdue(checkOut.overDueFlag)+"</td>"+
						"</tr>";
	});
	
	html = html + "</table>";
	
	$('#myModalLabel').html("<h4>Books checked out by User"+obj.givenName+", "+obj.lastName+"</h4>");
	$('#tableBody').html(html);
	$('#myModal').modal('show');
}

function parseJsonDate(jsonDateString) {
	return $.datepicker.formatDate("dd/mm/yy", new Date(parseInt(jsonDateString
			.toString().replace('/Date(', ''))));
}

function isOverdue(overDue){
	if(overDue == true){
		return 'Y';
	}
	return 'N';
}
