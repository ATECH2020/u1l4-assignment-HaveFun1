import java.util.Scanner;

class SecondsPastMidnight {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads int from user
        int sec = scanner.nextInt();
        int hours; 
        int mins;

        //Your code goes here
        hours = sec / 3600;
        mins = sec / 60;
        System.out.print(hours + " " + mins);

        // closing the scanner object
        scanner.close();
    }
}