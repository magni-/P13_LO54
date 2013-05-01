package lo54

class Location {

	String city
	
    static constraints = {
		city blank: false, unique: true
    }
	
	static mapping = {
		version false
	}
}
