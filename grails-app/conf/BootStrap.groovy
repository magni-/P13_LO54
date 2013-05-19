import java.text.SimpleDateFormat
import lo54.*

class BootStrap {

    def init = { servletContext ->
		if (!Location.count()) {

			// Locations

			Location belfort = new Location(city: "Belfort")
			belfort.save(failOnError: true)

			Location sevenans = new Location(city: "Sevenans")
			sevenans.save(failOnError: true)

			Location montbeliard = new Location(city: "Montbéliard")
			montbeliard.save(failOnError: true)

			// Courses

			Course bd50 = new Course(code: "BD50", title: "Database Design")
			bd50.save(failOnError: true)

			Course gl51 = new Course(code: "GL51", title: "Software Quality")
			gl51.save(failOnError: true)

			Course gl52 = new Course(code: "GL52", title: "Software Engineering")
			gl52.save(failOnError: true)

			Course lo54 = new Course(code: "LO54", title: "Java EE Development")
			lo54.save(failOnError: true)

			Course lk00 = new Course(code: "LK00", title: "Korean Level 0")
			lk00.save(failOnError: true)

			Course ev02 = new Course(code: "EV02", title: "Energy, Environment, and Substainable Development")
			ev02.save(failOnError: true)

			// Sessions

			Date p13s = new SimpleDateFormat("y-M-d").parse("2013-3-1")
			Date p13e = new SimpleDateFormat("y-M-d").parse("2013-6-30")
			Date a13s = new SimpleDateFormat("y-M-d").parse("2013-9-1")
			Date a13e = new SimpleDateFormat("y-M-d").parse("2014-1-31")

			Session bd50p = new Session(
				start:    p13s,
				end:      p13e,
				location: belfort,
				course:   bd50
			)
			bd50p.save(failOnError: true)

			Session gl51p = new Session(
				start:    p13s,
				end:      p13e,
				location: belfort,
				course:   gl51
			)
			gl51p.save(failOnError: true)

			Session gl52p = new Session(
				start:    p13s,
				end:      p13e,
				location: belfort,
				course:   gl52
			)
			gl52p.save(failOnError: true)

			Session lo54p = new Session(
			  start:    p13s,
			  end:      p13e,
			  location: belfort,
			  course:   lo54
			)
			lo54p.save(failOnError: true)

			Session lo54a = new Session(
				start:    a13s,
				end:      a13e,
				location: belfort,
				course:   lo54
			)
			lo54a.save(failOnError: true)

			Session lk00p = new Session(
				start:    p13s,
				end:      p13e,
				location: sevenans,
				course:   lk00
			)
			lk00p.save(failOnError: true)

			Session lk00a = new Session(
				start:    a13s,
				end:      a13e,
				location: sevenans,
				course:   lk00
			)
			lk00a.save(failOnError: true)

			Session ev02b = new Session(
				start:    p13s,
				end:      p13e,
				location: belfort,
				course:   ev02
			)
			ev02b.save(failOnError: true)

			Session ev02m = new Session(
				start:    p13s,
				end:      p13e,
				location: montbeliard,
				course:   ev02
			)
			ev02m.save(failOnError: true)
		}
    }
    def destroy = {
    }
}
