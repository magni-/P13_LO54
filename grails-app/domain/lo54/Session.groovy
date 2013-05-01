package lo54

class Session {
	
	Date start
	Date end
	String course_code
	Integer location_id

    static constraints = {
		start blank: false
		end blank: false
		course_code blank: false
		location_id blank: false
    }
	
	static mapping = {
		version false
	}
}
