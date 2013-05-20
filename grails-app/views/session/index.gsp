<html>
	<head>
		<title>LO54 Project</title>
		<link rel="stylesheet" href="${resource(dir: 'css', file: 'main.css')}" type="text/css">
		<!--<g:javascript library="jquery" plugin="jquery"/>-->
		<r:layoutResources />
		<g:javascript src="jquery.simplemodal.1.4.4.min.js" />
		<r:require modules="jquery-validation-ui" />
		<g:javascript src="application.js" />
		<calendar:resources lang="en" theme="tiger"/>
	</head>
	<body>
		<div id="index">
			<g:render template="list"></g:render>
		</div>
		<div id="register" style="display:none; background: #fff">
			<g:render template="register"></g:render>
		</div>
	</body>
</html>