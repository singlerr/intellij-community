internal class A {
    fun foo() {
        privateStatic1()
        privateStatic2()
    }

    companion object {
        fun publicStatic() {
            privateStatic1()
        }

        private fun privateStatic1() {}
        private fun privateStatic2() {}
    }
}
