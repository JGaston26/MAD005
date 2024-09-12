import kotlin.random.Random

fun main() {
    val words1: List<String> = listOf("mobile", "application", "development")
    val words2: List<String> = listOf()
    val randList: List<String> = if(Random.nextInt(1,3) == 1){words1}else{words2}
    val randString: String? = randomElement(randList)
    val substring: String = randString?.substring(0,2) ?: "none"
    println(randString)
    println(randString?.length)
    println(substring)
}
fun getNum(): Int? {
    val random = Random.nextInt(10)
    return if (random < 5) random else null
}
fun randomElement(list : List<String>): String?{
    if(list.isEmpty()){
        return null;
    }
    return list.random()
}
