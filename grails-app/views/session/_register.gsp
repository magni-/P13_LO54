<g:form name="register" controller="Client" action="create">
	<g:hiddenField id="sid" name="session_id" value="" />
	Course: <span id="course"></span>
	<f:all bean="${client}" except="session" />
	<g:actionSubmit value="Register" action="create" />
</g:form>