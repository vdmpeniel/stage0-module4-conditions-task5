package school.mjc.stage0.conditions.task5;

public class RangeNumbersPrinter {
    public void printRange(int number) {
        String response1 = "number is between 1 and 5";
        String response2 = "number is between 6 and 10";

        String result = switch(number){
            case 1, 2, 3, 4, 5 -> response1;
            case 6, 7, 8, 9, 10 -> response2;
            default -> "out of range";
        };

        System.out.println(result);
    }
}
