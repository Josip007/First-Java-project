import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number;
        int sum = 0;
        String day;

        while (true) {
            try {
                System.out.println("Please enter a number:");
                String input = scanner.nextLine();
                number = Integer.parseInt(input);

                if (number < 0) {
                    break;
                }

                switch (number % 7) {
                    case 0:
                        day = "Sunday";
                        break;
                    case 1:
                        day = "Monday";
                        break;
                    case 2:
                        day = "Tuesday";
                        break;
                    case 3:
                        day = "Wednesday";
                        break;
                    case 4:
                        day = "Thursday";
                        break;
                    case 5:
                        day = "Friday";
                        break;
                    case 6:
                        day = "Saturday";
                        break;
                    default:
                        day = "New day of the week?";
                }

                System.out.println(day);

                if (number == 0) {
                    continue;
                } else if (number % 2 != 0) {
                    break;
                } else {
                    sum += number;
                }

            } catch (NumberFormatException e) {
                System.out.println("Please enter a number.");
            }
        }

        System.out.println("Sum of all even numbers is: " + sum);



    }
}
