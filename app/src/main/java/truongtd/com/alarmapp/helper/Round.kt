package truongtd.com.alarmapp.helper

import java.text.DecimalFormat
import java.text.DecimalFormatSymbols

fun Float.roundToOneDecimal(): Float {
    val symbol = DecimalFormatSymbols()
    symbol.decimalSeparator = '.'
    val df = DecimalFormat("0.#")
    df.decimalFormatSymbols = symbol
    return df.format(this).toFloat()
}
