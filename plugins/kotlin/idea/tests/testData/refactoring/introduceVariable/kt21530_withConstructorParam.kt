// INPLACE_VARIABLE_NAME: test1
fun test() = "123"

open class First(val s: String)
object Second : First(<selection>test()</selection> + "456")

fun foo(test: String) {
    val x = test()
}