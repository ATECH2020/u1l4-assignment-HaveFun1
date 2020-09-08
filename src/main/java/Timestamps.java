import java.util.Scanner;

class Timestamps {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hours1 = scanner.nextInt();
        int minutes1 = scanner.nextInt();
        int seconds1 = scanner.nextInt();
        int hours2 = scanner.nextInt();
        int minutes2 = scanner.nextInt();
        int seconds2 = scanner.nextInt();


        /*
         *  your code goes here
         */
         int deltaH = hours2 - hours1;
         int deltaM = minutes2 - minutes1;
         int deltaS = seconds2 - seconds1;
         int secDeltaH = deltaH * 3600;
         int secDeltaM = deltaM * 60;
         int totalSecs = secDeltaH + secDeltaM + deltaS;
         System.out.print(totalSecs);

        // closing the scanner object
        scanner.close();
    }
}