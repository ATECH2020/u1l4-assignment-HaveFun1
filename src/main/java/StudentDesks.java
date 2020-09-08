import java.util.Scanner;

class StudentDesks {
    public static void main(String[] args) {

        //Creates a new scanner for user input
        Scanner scanner = new Scanner(System.in);

        //Reads ints from user
        int classA = scanner.nextInt();
        int classB = scanner.nextInt();
        int classC = scanner.nextInt();

        /*
         *  your code goes here
         */   
         int classADesk = (classA / 2) + (classA % 2); 
         int classBDesk = (classB  / 2) + (classB % 2);
         int classCDesk = (classC / 2) + (classC % 2);

         System.out.print(classADesk + classBDesk + classCDesk);


        // closing the scanner object
        scanner.close();
    }
}