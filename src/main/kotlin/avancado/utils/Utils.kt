package avancado.utils

fun Double.format(digits: Int) = "%.${digits}f".format(this)