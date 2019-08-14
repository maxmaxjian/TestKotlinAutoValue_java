import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue

fun main() {
//    val animal = Animal.create("dog", 4)
    val animal = Dog("John", 4)
    println("$animal")
    println("${animal.name}")

//    val json = "{\"name\":\"James\", \"numOfLegs\": 4}"
    val json = """{"name": "James", "numOfLegs": 4}"""
    val mapper = jacksonObjectMapper()
    val dog = mapper.readValue<Dog>(json)
    println("dog = $dog")
}