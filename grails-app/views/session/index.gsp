<html>
	<head>
		<title>LO54 Project</title>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<calendar:resources lang="en" theme="tiger"/>
	</head>
	<body>
		<g:formRemote name="filter" update="index" url="[controller: 'Session', action:'index']">
			<table>
				<tr><td>Course Title:</td><td><g:textField name="title" /></td></tr>
				<tr><td>Course City:</td><td><g:select name="city" from="${cities}" noSelection="${['':'']}" width="166px" /></td></tr>
				<tr><td>Earliest Start Date:</td><td><calendar:datePicker name="start" format="%Y%m%d" /></td></tr>
				<tr><td>Latest End Date:</td><td><calendar:datePicker name="end" format="%Y%m%d" /></td></tr>
				<tr><td colspan="2"><g:actionSubmit value="Filter" action="index" /></td></tr>
			</table>
		</g:formRemote>
		<br />
		<div id="index">
			<g:render template="list"></g:render>
		</div>
	</body>
</html>