package lo54

class Session {
	
	Date start
	Date end

    static belongsTo = [course: Course, location: Location]
	static hasMany   = [clients: Client]

	static constraints = {
		start blank: false
		end blank: false
    }
	
	static mapping = {
		version false
	}
}
