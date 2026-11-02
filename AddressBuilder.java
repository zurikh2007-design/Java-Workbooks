import java.util.Scanner;


public class AddressBuilder {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StringBuilder info = new StringBuilder();

        String fullName;
        String bStreet;
        String bCity;
        String bState;
        String bZip;
        String sStreet;
        String sCity;
        String sState;
        String sZip;

        String total;

        System.out.print("Full name: ");
        fullName = scanner.nextLine();
        System.out.print("");
        System.out.print("Billing Street: ");
        bStreet = scanner.nextLine();
        System.out.print("Billing City: ");
        bCity= scanner.nextLine();
        System.out.print("Billing State: ");
        bState = scanner.nextLine();
        System.out.print("Billing Zip: ");
        bZip = scanner.nextLine();
        System.out.println();
        System.out.print("Shipping Street: ");
        sStreet = scanner.nextLine();
        System.out.print("Shipping City: ");
        sCity = scanner.nextLine();
        System.out.print("Shipping State: ");
        sState = scanner.nextLine();
        System.out.print("Shipping Zip: ");
        sZip = scanner.nextLine();
        System.out.println();

        info.append("Billing Street: " + bStreet);
        info.append("\n");
        info.append("Billing City: " + bCity);
        info.append("\n");
        info.append("Billing State: " + bState);
        info.append("\n");
        info.append("Billing Zip: " + bZip);
        info.append("\n");
        info.append("\n");
        info.append("Shipping Street: " + sStreet);
        info.append("\n");
        info.append("Shipping City: " + sCity);
        info.append("\n");
        info.append("Shipping State: " + sState);
        info.append("\n");
        info.append("Shipping Zip: " + sZip);

        total = info.toString();
        System.out.println("=====================");
        System.out.println(fullName);
        System.out.println("=====================");
        System.out.println("");
        System.out.println(total);
    }




}
