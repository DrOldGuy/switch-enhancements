package switcher;

import java.time.DayOfWeek;

public class SwitchEnhancements {
  /**
   * 
   * @param args
   */
  public static void main(String[] args) {
    new SwitchEnhancements().run();
  }

  private void run() {
    normalSwitch(DayOfWeek.WEDNESDAY);
    arrowNotation(DayOfWeek.WEDNESDAY);
    arrowNotationWithReturn(DayOfWeek.TUESDAY);
  }

  private void arrowNotationWithReturn(DayOfWeek day) {
    System.out.printf("Day %s has length of %d.%n", day,
        arrowNotationWithReturnSwitchLengthOfDay(day));
  }

  private int arrowNotationWithReturnSwitchLengthOfDay(
      DayOfWeek day) {
    return switch(day) {
      case SUNDAY, MONDAY, FRIDAY -> 6;
      case THURSDAY, SATURDAY -> 8;
      case TUESDAY -> 7;
      case WEDNESDAY -> {
        int nine = 9;
        yield nine;
      }
    };
  }

  private void arrowNotation(DayOfWeek day) {
    System.out.printf("Day %s has length of %d.%n", day,
        arrowNotationSwitchLengthOfDay(day));
  }

  private int arrowNotationSwitchLengthOfDay(DayOfWeek day) {
    int lengthOfDay = -1;

    switch(day) {
      case SUNDAY, MONDAY, FRIDAY -> lengthOfDay = 6;
      case THURSDAY, SATURDAY -> lengthOfDay = 8;
      case TUESDAY -> lengthOfDay = 7;
      case WEDNESDAY -> {
        int nine = 9;
        lengthOfDay = nine;
      }
    }

    return lengthOfDay;
  }

  private void normalSwitch(DayOfWeek day) {
    System.out.printf("Day %s has length of %d.%n", day,
        normalSwitchLengthOfDay(day));
  }

  private int normalSwitchLengthOfDay(DayOfWeek day) {
    int lengthOfDay = -1;

    switch(day) {
      case SUNDAY:
      case MONDAY:
      case FRIDAY:
        lengthOfDay = 6;
        break;

      case THURSDAY:
      case SATURDAY:
        lengthOfDay = 8;
        break;

      case TUESDAY:
        lengthOfDay = 7;
        break;

      case WEDNESDAY:
        lengthOfDay = 9;
        break;
    }

    return lengthOfDay;
  }
}
