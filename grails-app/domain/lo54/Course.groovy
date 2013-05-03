package lo54

class Course {

	String code
	String title

	static hasMany = [sessions: Session]

    static constraints = {
		code blank: false, unique: true
		title blank: false
    }
	
	static mapping = {
		version false
	}
}
