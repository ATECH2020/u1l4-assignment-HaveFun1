import java.util.Scanner;

class AnalogClock {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int hourHandDegree = scanner.nextInt();


        /*
         *  your code goes here
         */
         //Finds the amount of mins from the hour hand degree
         int notFullHour = hourHandDegree % 30;
         int remindingDegree = notFullHour / 6;
         int reminder = notFullHour % 6;
         int min = (remindingDegree * 12) + (reminder * 2); 

         //convert the mins into degree
         int minHandDegree = min * 6;

         System.out.print(minHandDegree);
         
        // closing the scanner object
        scanner.close();
    }
}