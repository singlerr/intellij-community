// "Change parameter 'x' type of function 'bar.foo' to '(String) -> Int'" "true"
package bar
fun foo(w: Int = 0, x: (String) -> Int, y: Int = 0, z: (Int) -> Int = {42}) {
    foo(1, {(a: String) -> 42}<caret>, 1)
}
