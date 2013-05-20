class UrlMappings {

	static mappings = {
		"/$controller/$action?/$id?"{
			constraints {
				// apply constraints here
			}
		}

		"/" {
			controller = "session"
			action = "filter"
		}
		"500"(view:'/error')
	}
}
