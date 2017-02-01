import java.util.Calendar

class CalendarTimeCheck(calendar: Calendar) extends TimeCheck {
  override def check(): Boolean = {
    val hour = calendar.get(Calendar.HOUR_OF_DAY)

    // TODO: Ideally make these configurable
    return hour >= 21 || hour <= 6
  }
}
