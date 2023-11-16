import java.util.Scanner;

public class getUserName {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstName = safeInput.getNonZeroLengthString(scanner, "Enter your first name: ");
        String lastName = safeInput.getNonZeroLengthString(scanner, "Enter your last name: ");
        System.out.print("\nYour full name is: " + firstName + " " + lastName);

        int favInteger = safeInput.getInt(scanner, "Enter your favorite integer: ");
        System.out.print("\nYour favorite integer is: " + favInteger);
        double favNumber = safeInput.getDouble(scanner, "Enter your favorite number: ");
        System.out.print("\nYour favorite number is: " + favNumber);

        int birthYear = safeInput.getRangedInt(scanner, "Enter your birth year: ", 1950, 2015);
        int birthMonth = safeInput.getRangedInt(scanner, "Enter your birth month: ", 1, 12);
        int birthDay = safeInput.getRangedInt(scanner, "Enter your birth day: ", 1, 31);
        int birthHour = safeInput.getRangedInt(scanner, "Enter the hour you were born: ",1, 24);
        int birthMinute = safeInput.getRangedInt(scanner, "Enter the minute you were born: ", 1, 59);
        System.out.print("\nYou were born on: " + birthMonth + "/" + birthDay + "/" + birthYear + ". At the time: " +
                 birthHour + ":" + birthMinute);

        boolean again = true;
        double sum = 0.00;

        while(again){
            double itemPrice = safeInput.getRangedDouble(scanner, "Enter the price of your item: ", .50, 10.00);
            sum = sum + itemPrice;
            again = safeInput.getYNConfirm(scanner, "Do you have more items?");
        }
        System.out.printf("Your total is: $" + "%.2f%n", sum);


        String SSN = safeInput.getRegExString(scanner, "Enter your SSN: ", "\\d{3}-\\d{2}-\\d{4}");
        String ucStudentID = safeInput.getRegExString(scanner, "Enter your UC Student M number: ", "(M|m)\\d{5}$");
        String menu = safeInput.getRegExString(scanner, "Enter menu choice (Open, Save, View, Quit): ", "[OoSsVvQq]$");
        System.out.print("\nYour SSN is: " + SSN + "\nYour UC Student M number is: " + ucStudentID + "\nYou chose " + menu);

    }
}