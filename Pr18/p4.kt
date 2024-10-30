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

fun main() {
    val events: MutableList<Event> = mutableListOf()
    
    events.add(Event(name = "Wake up", about = "Time to get up", partDay = Daypart.MORNING, late = 0))
    events.add(Event(name = "Eat breakfast", about = "Time for breakfast", partDay = Daypart.MORNING, late = 15))
    events.add(Event(name = "Learn about Kotlin", about = "Study Kotlin programming", partDay = Daypart.AFTERNOON, late = 30))
    events.add(Event(name = "Practice Compose", about = "Practice Jetpack Compose", partDay = Daypart.AFTERNOON, late = 60))
    events.add(Event(name = "Watch latest DevBytes video", about = "Watch the latest video on DevBytes", partDay = Daypart.AFTERNOON, late = 10))
    events.add(Event(name = "Check out latest Android Jetpack library", about = "Explore the new Jetpack library", partDay = Daypart.EVENING, late = 45))

    val eventCount = events.size
    println("Количество запланированных событий: $eventCount")
    
    for (event in events) {
        if (event.late < 60)
        	println("Короткое событие:\n${event.name} - ${event.about} (${event.partDay}, ${event.late} минут)")
    }
}

