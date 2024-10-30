enum class Daypart {
    MORNING,
    AFTERNOON,
    EVENING
}

class Event {
    var name: String = "";
    var about: String = "";
    var partDay: Daypart = Daypart.MORNING
    var late: Int = 0;
}


fun main() {
    val ex = Event().apply {
        name="Иследование Котлина"
        about="Посвятите изучению Kotlin не менее 15 минут в день."
        partDay= Daypart.EVENING
        late=15
        
    }
    println(ex.name + "\n" + ex.about + "\n" + ex.partDay + " " + ex.late)
}
