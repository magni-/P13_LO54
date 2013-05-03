package lo54

class Location {

	String city
	
	static hasMany = [sessions: Session]

    static constraints = {
		city blank: false, unique: true
    }
	
	static mapping = {
		version false
	}
}
