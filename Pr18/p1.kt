class Event {
    var name: String = "";
    var about: String = "";
    var partDay: String = "";
    var late: Int = 0;
}


fun main() {
    val ex = Event().apply {
        name="Иследование Котлина"
        about="Посвятите изучению Kotlin не менее 15 минут в день."
        partDay="Вечер"
        late=15
    }
    println(ex.name + "\n" + ex.about + "\n" + ex.partDay + " " + ex.late)
}
