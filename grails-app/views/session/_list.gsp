<table>
	<thead>
		<tr>
			<th>Code</th>
			<th>Title</th>
			<th>Site</th>
			<th>Start</th>
			<th>End</th>
			<th>Register</th>
		</tr>
	</thead>
	<tbody>
		<g:each in="${ss}" var="${s}">
			<tr>
				<td>${s.course.code}</td>
				<td>${s.course.title}</td>
				<td>${s.location.city}</td>
				<td>${s.start.format("MMMM d, yyyy")}</td>
				<td>${s.end.format("MMMM d, yyyy")}</td>
				<td><a href="#">todo</a></td>
			</tr>
		</g:each>
	</tbody>
</table>