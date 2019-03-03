<%@ include file="commen/header.jspf"%>
<%@ include file="commen/navigation.jspf"%>
<c:choose>
	<c:when test="${mode == 'MODE_WELCOME'}">
		<div class="container">
			<div class="jumbotron text-center">
				<h1>Welcome To Elhusary Center</h1>
				<h3>Follow me</h3>
				<h1>
					<span class="glyphicon glyphicon-thumbs-up"></span>
				</h1>
			</div>
		</div>
	</c:when>
</c:choose>


<c:choose>
	<c:when test="${mode == 'MODE_REGISTER_DONE'}">
		<div class="container text-center">
			<h1>successfully registered ${name}</h1>
			<h1>
				<span class="glyphicon glyphicon-ok"></span>
			</h1>
		</div>
	</c:when>
</c:choose>
<%@ include file="commen/footer.jspf"%>