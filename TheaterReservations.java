import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class TheaterReservations {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fullName = "";
        String theDate = "";
        int tickets = 0;



        System.out.print("Please enter your name: ");
        fullName = scanner.nextLine();

        String[] flip = fullName.split(" ");

        System.out.print("What date will you be coming (MM/dd/yyyy): ");
        theDate = scanner.nextLine();

        DateTimeFormatter formatter =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");

        LocalDate date = LocalDate.parse(theDate, formatter);


        System.out.print("How many tickets would you like?: ");
        tickets = scanner.nextInt();

        if (tickets < 2){
            System.out.println(tickets + " ticket reserved for " + date + " under " + flip[1] + ", " + flip[0]);
        } else{
            System.out.println(tickets + " tickets reserved for " + date + " under " + flip[1] + ", " + flip[0]);
        }

    }
}
