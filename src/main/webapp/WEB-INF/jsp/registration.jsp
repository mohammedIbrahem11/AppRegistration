
<%@ include file="commen/header.jspf"%>
<%@ include file="commen/navigation.jspf"%>

<c:choose>
	<c:when test="${mode == 'MODE_REGISTER' }">
		<div class="container text-center">
			<h3>New Registration</h3>
			<form class="form-horizontal" action="save-user" method="POST">
				<input type="hidden" name="id" /> <input type="hidden" name="id" />
				<div class="form-group">
					<label class="control-label col-md-3">Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="name" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">Email</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="email" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">user Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="userName" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">password</label>
					<div class="col-md-3">
						<input type="password" class="form-control" name="password" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">birth Date</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="birthDate" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">Gender</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="gender" />
					</div>
				</div>

				<!-- <div class="form-group">
					<label class="control-label col-md-3">Course Id</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="courseId" />
					</div>
				</div> -->

				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Register" />
				</div>

			</form>
		</div>
	</c:when>
</c:choose>

<c:choose>
	<c:when test="${mode == 'MODE_COURSE_REGISTRATION' }">
		<div class="container text-center">
			<h3>New Registration</h3>
			<form class="form-horizontal" action="save-user" method="POST">
				<input type="hidden" name="id" /> 
				<input type="hidden" name="id"/>

				<div class="form-group">
					<label class="control-label col-md-3">Course Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="courseName" value="${courses.courseName}"/>
					</div>
				</div>
				
				<div class="form-group">
					<label class="control-label col-md-3">Course Description</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="courseName" value="${courses.description}"/>
					</div>
				</div>
				
				<input type="hidden" name="publishDate" />
				<input type="hidden" name="lastUpdated" />
				<input type="hidden" name="totalHours" />
				<input type="hidden" name="instructor" />
				
				<div class="form-group">
					<label class="control-label col-md-3">Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="name" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">Email</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="email" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">user Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="userName" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">password</label>
					<div class="col-md-3">
						<input type="password" class="form-control" name="password" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">birth Date</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="birthDate" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">Gender</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="gender" />
					</div>
				</div>

				<!-- <div class="form-group">
					<label class="control-label col-md-3">Course Id</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="courseId" />
					</div>
				</div> -->

				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Register" />
				</div>

			</form>
		</div>
	</c:when>
</c:choose>

<c:choose>
	<c:when test="${mode == 'MODE_UNREGISTER' }">
		<div class="container text-center">
			<h3>Enter UserName to Unregister</h3>
			<form class="form-horizontal" action="unregister-user" method="POST">
				<div class="form-group">
					<label class="control-label col-md-3">user Name</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="userName" />
					</div>

				</div>
				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="UnRegister" />
				</div>
			</form>
		</div>
	</c:when>
</c:choose>

<c:choose>
	<c:when test="${mode == 'MODE_UPDATE' }">
		<div class="container text-center">
			<h3>Update User</h3>
			<form class="form-horizontal" action="save-user" method="POST">
				<input type="hidden" name="id" value="${users.id}" />
				<div class="form-group">
					<label class="control-label col-md-3">UserName</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="userName"
							value="${users.userName}" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">FirstName</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="firstName"
							value="${users.firstName}" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">LastName</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="lastName"
							value="${users.lastName}" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">Age</label>
					<div class="col-md-3">
						<input type="text" class="form-control" name="age"
							value="${users.age}" />
					</div>
				</div>

				<div class="form-group">
					<label class="control-label col-md-3">Password</label>
					<div class="col-md-7">
						<input type="text" class="form-control" name="password"
							value="${users.password}" />
					</div>
				</div>

				<div class="form-group">
					<input type="submit" class="btn btn-primary" value="Update" />
				</div>

			</form>
		</div>
	</c:when>
</c:choose>
<%@ include file="commen/footer.jspf"%>