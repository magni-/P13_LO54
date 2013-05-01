package lo54

class Course {
	
	String id
	String title

    static constraints = {
		title blank: false
    }
	
	static mapping = {
		version false
		id column: 'code', type: 'string', generator: 'assigned'
	}
	
	void setCode(String username) {
		id = username
	}
	
	String setCode() {
		return id
	}
}
