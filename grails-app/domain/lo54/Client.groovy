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
		phone blank: false
		email nullable: true
    }

	static mapping = {
		version false
	}
}
