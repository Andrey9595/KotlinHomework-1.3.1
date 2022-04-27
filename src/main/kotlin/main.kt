fun main() {
    val time = 86400L
    println(agoToText(time))

}

fun agoToText(time: Long): String {
    return when (time) {
        in 0..60 -> "был(а) только что"
        in 61..60 * 60 -> "${minutes(time)} "
        in 60 * 60 + 1..24 * 60 * 60 - 1 -> "${hours(time)} "
        in 24 * 60 * 60 ..24 * 60 * 60 * 2 - 1 -> "сегодня"
        in 24 * 60 * 60 * 2 ..24 * 60 * 60 * 3 - 1 -> "вчера"
        in 24 * 60 * 60 * 3 ..24 * 60 * 60 * 4 - 1 -> "давно"
        else -> "Очень давно"
    }
}

fun hours(time: Long): String {
    val hours = time / 3600
    if (hours == 1L || hours == 21L)
        return "$hours час назад"
    else if (hours in 2L..4L || hours in 22L..23L)
        return "$hours часа назад"
    else if (hours in 5L..20L)
        return "$hours часов назад"
    return "Очень давно1"

}

fun minutes(time: Long): String {
    val minutes = time / 60
    if (minutes == 1L || minutes == 21L || minutes == 31L || minutes == 41L || minutes == 51L) {
        return "$minutes минуту назад"
    } else if (minutes in 2L..4L || minutes in 22L..24L || minutes in 32L..34L || minutes in 42..44 || minutes in 52..54)
        return "$minutes минуты назад"
    else if (minutes in 5L..20L || minutes in 25..30 || minutes in 35..40 || minutes in 45..50 || minutes in 55..59)
        return "$minutes минут назад"
    return "Очень давно2"
}
