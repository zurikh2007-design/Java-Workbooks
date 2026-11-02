import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        CellPhoneApplication phone1 = new CellPhoneApplication();
        CellPhoneApplication phone2 = new CellPhoneApplication();
        CellPhoneApplication phone3 = new CellPhoneApplication(1234123, "Iphone 18", "T-mobile", "123-456-7890", "Stanley Harris");
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your serial number?: ");
        phone1.setSerialNumber(scanner.nextInt());
        scanner.nextLine();

        System.out.print("What model is the phone?: ");
        phone1.setModel(scanner.nextLine());


        System.out.print("Who is the carrier?: ");
        phone1.setCarrier(scanner.nextLine());

        System.out.print("What is the phone number?: ");
        phone1.setPhoneNumber(scanner.nextLine());
        phone2.setPhoneNumber("408-460-3318");

        System.out.print("Who is the owner of the phone?: ");
        phone1.setOwner(scanner.nextLine());
        phone2.setOwner("Chandrea Harris");

        System.out.println("");

        System.out.println(phone1.getSerialNumber());
        System.out.println(phone1.getModel());
        System.out.println(phone1.getCarrier());
        System.out.println(phone1.getPhoneNumber());
        System.out.println(phone1.getOwner());

        System.out.println("");
        display(phone1);
        System.out.println("");
        display(phone2);
        System.out.println("");
        display(phone3);

        System.out.println("");
        phone2.dial(phone1.getPhoneNumber());

        System.out.println("");
        phone1.dial(phone2.getPhoneNumber());

        System.out.println("");
        phone1.dial(phone3.getPhoneNumber());
    }


    public static void display(CellPhoneApplication phone){
        System.out.println(phone.getOwner());
        System.out.println(phone.getPhoneNumber());
    }




}
