public class CellPhoneApplication {
   private int serialNumber;
   private String model;
   private String carrier;
   private String phoneNumber;
   private String owner;


    public void dial(String phoneNumber){
        System.out.println(owner + " is calling " + phoneNumber);
    }

    public CellPhoneApplication() {
        serialNumber = 0;
        model = "";
        carrier = "";
        phoneNumber = "";
        owner = "";
    }

    public CellPhoneApplication(int serialNumber, String model, String carrier, String phoneNumber, String owner){
        this.serialNumber = serialNumber;
        this.model = model;
        this.carrier = carrier;
        this.phoneNumber = phoneNumber;
        this.owner = owner;
    }



   public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        if (serialNumber >= 1000000 && serialNumber <= 9999999){
            this.serialNumber = serialNumber;
        } else{
            System.out.println("Invalid Serial Number!");
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }
}
