<html>
	<head>
		<title>LO54 Project</title>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<!--<g:javascript library="jquery" plugin="jquery"/>-->
		<r:layoutResources />
		<g:javascript src="jquery.simplemodal.1.4.4.min.js" />
		<g:javascript src="application.js" />
		<calendar:resources lang="en" theme="tiger"/>
	</head>
	<body>
		<g:if test="${flash.message}">
			<div class="message" style="display: block">${flash.message}</div>
		</g:if>
		<g:if test="${flash.error}">
			<div class="errors" style="display: block">${flash.error}
				<g:hasErrors bean="${client}">
				   <g:renderErrors bean="${client}" as="list" />
				</g:hasErrors>
			</div>
		</g:if>
		<g:formRemote name="filter" update="index" url="[controller: 'Session', action:'index']">
			<table>
				<tr><td>Course Title:</td><td><g:textField name="title" /></td></tr>
				<tr><td>Course City:</td><td><g:select name="city" from="${cities}" noSelection="${['':'']}" width="166px" /></td></tr>
				<tr><td>Earliest Start Date:</td><td><calendar:datePicker name="start" format="%Y%m%d" /></td></tr>
				<tr><td>Latest End Date:</td><td><calendar:datePicker name="end" format="%Y%m%d" /></td></tr>
				<tr><td colspan="2"><g:submitToRemote value="Filter" update="index_t" /></td></tr>
			</table>
		</g:formRemote>
		<div id="index_t">
			<g:render template="list"></g:render>
		</div>
		<div id="register_t" style="display:none; background: #fff">
			<g:render template="register"></g:render>
		</div>
	</body>
</html>