package lo54

class Client {

	String lastname
	String firstname
	String address
	String phone
	String email

	static belongsTo = [session: Session]

    static constraints = {
		lastname blank: false
		firstname blank: false
		address blank: false
		phone blank: false, matches: "[0-9]+[x[0-9]+]?"
		email nullable: true, email: true
		lastname unique: ['firstname', 'session']
    }

	static mapping = {
		version false
	}
}
