import java.io.File
import kotlin.io.extension as ext

fun foo(file: File): String {
    return file.ex<caret>
}

// IGNORE_K2
// COMPLETION_TYPE: SMART
// EXIST: { lookupString: "ext", itemText: "ext", tailText: " for File (kotlin.io.extension)", icon: "org/jetbrains/kotlin/idea/icons/field_value.svg"}
