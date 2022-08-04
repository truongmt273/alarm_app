package truongtd.com.alarmapp

import androidx.lifecycle.ViewModel

class AlarmViewModel: ViewModel() {
    fun generateListDayOfWeek(): List<DayOfWeek> {
        return listOf(
            DayOfWeek(0, "2"),
            DayOfWeek(1, "3"),
            DayOfWeek(2, "4"),
            DayOfWeek(3, "5"),
            DayOfWeek(4, "6"),
            DayOfWeek(5, "7"),
            DayOfWeek(6, "C"),
        )
    }
}