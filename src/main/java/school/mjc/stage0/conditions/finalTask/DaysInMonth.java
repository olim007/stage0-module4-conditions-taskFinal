package school.mjc.stage0.conditions.finalTask;

public class DaysInMonth {
    public void printDays(int year, int month) {
        if (year > 0 && month > 0 && month < 13) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        System.out.println(31);
                        break;
                    case 4, 6, 9, 11:
                        System.out.println(30);
                        break;
                    case 2:
                        System.out.println(29);
                        break;
                }
            } else {
                switch (month) {
                    case 1, 3, 5, 7, 8, 10, 12:
                        System.out.println(31);
                        break;
                    case 4, 6, 9, 11:
                        System.out.println(30);
                        break;
                    case 2:
                        System.out.println(28);
                }
            }
        } else {
            System.out.println("invalid date");
        }
    }
}
