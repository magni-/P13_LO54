package lo54

import grails.validation.ValidationException

class ClientController {
	
    def create() throws ValidationException {
		Client client = new Client(
			firstname: params.firstname,
			lastname:  params.lastname,
			address:   params.address,
			phone:     params.phone,
			email:     params.email,
			session:   Session.get(params.session_id)
		)
		try {
		    client.save(failOnError: true)            
		    flash.message = "Successfully registered for course!"
		}
		catch (ValidationException e) {
		    flash.error = "Error(s)!"
		}	
		finally {
			forward(controller: "session", action: "filter", model: [client: client])
		}
	}
	
	def reset() {
		Client.list()*.delete(flush: true)
		redirect(controller: "session", action: "filter")
	}
}
