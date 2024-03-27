import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter Month: ");

        String month = scanner.nextLine();

        System.out.println("Please Enter Day: ");
        int day = scanner.nextInt();

        if (isDateValid (month, day)) {
            String season = getSeason (month, day);
            System.out.println("The Season is " + season);
        } else {
            System.out.println("Date not valid");
        }
        scanner.close();
    }
    public static boolean isDateValid (String month, int day) {
        String [] validMonths = {"january", "february", "march", "april","may", "june", "july",
                "august","september","october","november","december"};

        //checking for valid month
        boolean isValidMonth = false;
        for (String ValidMonthName : validMonths) {
            if(month.equals(ValidMonthName)){
                isValidMonth = true;
                break;
            }
        }
        boolean validDay = (day >= 1 && day <= 31);
        return isValidMonth && validDay;
    }
    public static String getSeason (String month, int day) {
        if ((month.equals ("march") && day >= 20) || (month.equals ("june") && day <= 20 ||
                month.equals("april") || month.equals("may"))){
            return "Spring";

        } else if ((month.equals ("june") && day >=21 || month.equals("september") && day <=21) ||
                (month.equals("july") || month.equals("august"))) {
            return "summer";

        } else if ((month.equals ("september") && day >=22) || (month.equals("december") &&
                day <= 20) || (month.equals("october") || month.equals("november"))) {
            return "Autumn";

        } else {

            return "Winter";
        }
    }
}