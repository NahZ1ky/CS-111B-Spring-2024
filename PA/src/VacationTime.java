public interface VacationTime {
    final int STANDARD_VACATION = 14;
    default int vacation() {
        return STANDARD_VACATION;
    }
}
