enum class Difficulty {
EASY, MEDIUM, HARD
}

class FillInTheBlankQuestion(
val questionText: String,
val answer: String,
val difficulty: String
)

class TrueOrFalseQuestion(
val questionText: String,
val answer: Boolean,
val difficulty: String
)

class NumericQuestion(
val questionText: String,
val answer: Int,
val difficulty: String
)

class Question<T>(
val questionText: String,
val answer: T,
val difficulty: Difficulty
)

fun main() {
	val question1 = Question<String>("Quoth the raven ___", "nevermore", Difficulty.MEDIUM)
	val question2 = Question<Boolean>("The sky is green. True or false", false, Difficulty.EASY)
	val question3 = Question<Int>("How many days are there between full moons?", 28, Difficulty.HARD)
    
    println("${question1.questionText} Answer: ${question1.answer} Difficulty: ${question1.difficulty}")
    println("${question2.questionText} Answer: ${question2.answer} Difficulty: ${question2.difficulty}")
    println("${question3.questionText} Answer: ${question3.answer} Difficulty: ${question3.difficulty}")
}
