// LANGUAGE_VERSION: 1.1
// AFTER-WARNING: Parameter 'f' is never used
fun foo(f: (String) -> Int) {}

class Outer {
    fun bar(s: String): Int = s.length

    inner class Inner {
        fun test() {
            foo {<caret> bar(it) }
        }
    }
}

// IGNORE_K2
