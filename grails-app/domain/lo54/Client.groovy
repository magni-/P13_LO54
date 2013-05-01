package lo54

class Client {
	
	String lastname
	String firstname
	String address
	String phone
	String email
	Integer session_id

    static constraints = {
		lastname blank: false
		firstname blank: false
		address blank: false
		phone blank: false
		session_id blank: false
    }
	
	static mapping = {
		version false
	}
}
