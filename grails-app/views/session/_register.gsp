<g:form name="register" controller="Client" action="create" style="width: 400px; text-align: center; margin: 20px">
	<g:hiddenField id="sid" name="session_id" value="" />
	<br />
	<span id="course" style="font-weight: bold"></span>
	<f:all bean="${newclient}" except="session" />
	<br />
	<g:actionSubmit value="Register" action="create" style="margin-bottom: 20px" />
</g:form>