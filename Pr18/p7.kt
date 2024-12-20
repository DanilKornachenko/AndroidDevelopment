enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

class Event(
    var name: String = "",
    var about: String = "",
    var partDay: Daypart = Daypart.MORNING,
    var late: Int = 0
)

val Event.durationOfEvent: String
	get() = if (this.late < 60) "short" else "long"

fun main() {
    val events: MutableList<Event> = mutableListOf()
    
    events.add(Event(name = "Wake up", about = "Time to get up", partDay = Daypart.MORNING, late = 0))
    events.add(Event(name = "Eat breakfast", about = "Time for breakfast", partDay = Daypart.MORNING, late = 15))
    events.add(Event(name = "Learn about Kotlin", about = "Study Kotlin programming", partDay = Daypart.AFTERNOON, late = 30))
    events.add(Event(name = "Practice Compose", about = "Practice Jetpack Compose", partDay = Daypart.AFTERNOON, late = 60))
    events.add(Event(name = "Watch latest DevBytes video", about = "Watch the latest video on DevBytes", partDay = Daypart.AFTERNOON, late = 10))
    events.add(Event(name = "Check out latest Android Jetpack library", about = "Explore the new Jetpack library", partDay = Daypart.EVENING, late = 45))

    println("Duration of first event of the day: ${events[0].durationOfEvent}")
}

