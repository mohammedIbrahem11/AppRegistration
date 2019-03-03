<%@ include file="commen/header.jspf"%>
<%-- <%@ include file="commen/navigation.jspf"%> --%>
<div class="container text-center">
	<h3>Login User</h3>
	<hr>
	<form class="form-horizontal" action="login" method="POST">
		<c:if test="${not empty error }">
			<div class="alert alert-danger">
				<c:out value="${error}"></c:out>
			</div>
		</c:if>
		<div class="form-group">
			<label class="control-label col-md-3">Email</label>
			<div class="col-md-7">
				<input type="text" class="form-control" name="email" />
			</div>
		</div>

		<div class="form-group">
			<label class="control-label col-md-3">Password</label>
			<div class="col-md-7">
				<input type="password" class="form-control" name="password" />
			</div>
		</div>

		<div class="form-group">
			<input type="submit" class="btn btn-primary" value="Login" />
		</div>
	</form>

</div>


<%@ include file="commen/footer.jspf"%>