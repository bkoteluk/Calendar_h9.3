package pl.homework.lib;

public class CalendarConverter {
    public final static int MONDAY = 1;
    public final static int TUESDAY = 2;
    public final static int WEDNESDAY = 3;
    public final static int THURSDAY = 4;
    public final static int FRIDAY = 5;
    public final static int SATURDAY = 6;
    public final static int SUNDAY = 7;

    public static String convertDayToString(int dayNumber) {
        String result = "";
        switch (dayNumber) {
            case MONDAY :
                result = "Poniedziałek";
                break;
            case TUESDAY :
                result = "Wtorek";
                break;
            case WEDNESDAY :
                result = "Środa";
                break;
            case THURSDAY :
                result = "Czwartek";
                break;
            case FRIDAY :
                result = "Piątek";
                break;
            case SATURDAY :
                result = "Sobota";
                break;
            case SUNDAY :
                result = "Niedziela";
                break;
        }
        return result;
    }
}
