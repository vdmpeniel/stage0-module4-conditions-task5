package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {
        String result;
        switch (month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                result = "31";
                break;

            case 2:
                result = "28";
                break;

            case 4:
            case 6:
            case 9:
            case 11:
                result = "30";
                break;

            default:
                result = "wrong number!";
                break;
        }
        System.out.println(result);
    }
}
