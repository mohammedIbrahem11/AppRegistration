<%@ include file="commen/header.jspf"%>
<%@ include file="commen/navigation.jspf"%>
<div class="container text-center">
	<h3>All Users</h3>
	<hr>
	<div class="table-responsive">
		<table class="table table-striped table-boarder">
			<thead>
				<tr>
					<th>ID</th>
					<th>Name</th>
					<th>Email</th>
					<th>User Name</th>
					<th>Password</th>
					<th>Birth Date</th>
					<th>Nationality</th>
					<th>gender</th>
					<th>Unregister</th>
				</tr>

			</thead>
			<tbody>
				<c:forEach var="user" items="${users}">
					<tr>
						<td>${user.id }</td>
						<td>${user.name }</td>
						<td>${user.email }</td>
						<td>${user.userName }</td>
						<td>${user.password }</td>
						<td>${user.birthDate}</td>
						<td>${user.nationality}</td>
						<td>${user.gender}</td>
						<%-- <td><a href="/edit-user?id=${user.id }"> <span class="glyphicon glyphicon-pencil"></span></a></td> --%>
						<td><a href="/delete-user?id=${user.id }"> <span class="glyphicon glyphicon-trash"></span></a></td>
					</tr>

				</c:forEach>
			</tbody>
		</table>

	</div>

</div>

<%@ include file="commen/footer.jspf"%>