public class TwelveDaysOfChristmas {
    public static void main(String[] args) {
        // Array to store the gifts for each day
        String[] gifts = {
                "a Partridge in a Pear Tree",
                "Two Turtle Doves",
                "Three French Hens",
                "Four Calling Birds",
                "Five Gold Rings",
                "Six Geese a-Laying",
                "Seven Swans a-Swimming",
                "Eight Maids a-Milking",
                "Nine Ladies Dancing",
                "Ten Lords a-Leaping",
                "Eleven Pipers Piping",
                "Twelve Drummers Drumming"
        };

        // Loop through the twelve days
        for (int day = 1; day <= 12; day++) {
            System.out.printf("On the %s day of Christmas, my true love gave to me:\n", getDay(day));

            // Print the gifts for the current day
            for (int i = day; i >= 1; i--) {
                if (i == 1 && day != 1) {
                    System.out.print("and ");
                }
                System.out.println(gifts[i - 1]);
            }

            System.out.println();
        }
    }

    // Method to get the day in string format
    private static String getDay(int day) {
        switch (day) {
            case 1:
                return "first";
            case 2:
                return "second";
            case 3:
                return "third";
            case 4:
                return "fourth";
            case 5:
                return "fifth";
            case 6:
                return "sixth";
            case 7:
                return "seventh";
            case 8:
                return "eighth";
            case 9:
                return "ninth";
            case 10:
                return "tenth";
            case 11:
                return "eleventh";
            case 12:
                return "twelfth";
            default:
                return "";
        }
    }
}
