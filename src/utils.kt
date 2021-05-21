import java.util.*

object CapitalizeHelper {
    fun String.capitalizeString(): String = split(" ").joinToString(" ") { it.lowercase(Locale.getDefault())
        .replaceFirstChar { if (it.isLowerCase()) it.titlecase(Locale.getDefault()) else it.toString() } }
}