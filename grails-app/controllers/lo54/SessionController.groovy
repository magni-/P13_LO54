package lo54

import java.text.SimpleDateFormat

class SessionController {

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
				gt('start', new SimpleDateFormat('yyyyMMdd').parse(params.start))
			}
			if (params.end) {
				lt('end', new SimpleDateFormat('yyyyMMdd').parse(params.end))
			}
		}
		[ss: sessions]
	}
}
