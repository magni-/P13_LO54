package lo54

class SessionController {

    def index() {
		[
			ss: Session.list(sort: "start", order: "asc")
		]
	}
}
