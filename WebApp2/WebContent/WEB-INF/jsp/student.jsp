<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form"%>
<html>
   <head>
      <title>Spring MVC Form Handling</title>
   </head>
   
   <body>
      <h2>Student Information</h2>
	<form:form method="POST" action = "/WebApp2/addStudent">
		<table>
			<tr>
			<td><form:label path = "name">Name</form:label></td>
			<td><form:input path = "name"></form:input></td>
			</tr>

			<tr>
			<td><form:label path = "age">Age</form:label></td>
			<td><form:input path = "age" ></form:input></td>
			</tr>

			<tr>
			<td><form:label path = "id">ID</form:label></td>
			<td><form:input path = "id"></form:input></td>
			</tr>
			
			<tr>
				<td colspan = "2">
					<input type = "submit" value= "Submit"/>
				</td>
			</tr>
		</table>
	  </form:form>
	</body>
</html>
			
			
   </body>
</html>