<%@ include file="commen/header.jspf"%>
<%@ include file="commen/navigation.jspf"%>
<div class="container text-center">
	<h3>Available Courses</h3>
	<hr>
	<div class="table-responsive">
		<table class="table table-striped table-boarder">
			<thead>
				<tr> 
					<th>ID</th>
					<th>CourseName</th>
					<th>Description</th>
					<th>Publish Date</th>
					<th>Last Updated</th>
					<th>Total Hours</th>
					<th>Instructor</th>
					<th>Register</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach var="obj" items="${courses}">
					<tr>
						<td>${obj.id }</td>
						<td>${obj.courseName }</td>
						<td>${obj.description }</td>
						<td>${obj.publishDate }</td>
						<td>${obj.lastUpdated }</td>
						<td>${obj.totalHours}</td>
						<td>${obj.instructor}</td>
						<td><a href="/edit-user?id=${user.id }"> <span class="glyphicon glyphicon-pencil"></span></a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>

	</div>

</div>

<%@ include file="commen/footer.jspf"%>