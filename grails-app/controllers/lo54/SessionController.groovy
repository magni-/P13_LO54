package lo54

import java.text.SimpleDateFormat

class SessionController {

	def filter() {
		index()
	}

    def index() {
		def criteria = Session.createCriteria()
		def sessions = criteria.list {
			if (params.title) {
				course {
					ilike('title', "%${params.title}%")
				}
			}
			if (params.city) {
				location {
					eq('city', params.city)
				}
			}
			if (params.start) {
				gt('start', new SimpleDateFormat('MM/dd/yyyy').parse(params.start_value))
			}
			if (params.end) {
				lt('end', new SimpleDateFormat('MM/dd/yyyy').parse(params.end_value))
			}
		}
		[ss: sessions, cities: Location.list(), client: new Client()]
	}
}
