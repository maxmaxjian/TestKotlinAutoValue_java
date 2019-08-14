import com.google.auto.value.AutoValue

@AutoValue
abstract class Animal(
    val name: String,
    val numOfLegs: Int) {

    companion object {
//        fun create(name: String, numOfLegs: Int) = AutoValue_Animal(name, numOfLegs)
    }
}