package model;

public class EmailAddress {
    private String address;
    private String Type;

    public EmailAddress(String address, String Type) {
        this.address = address;
        this.Type = Type;
    }

    public String getAddress() {
        return address;
    }

    public String getType() {
        return Type;
    }
}
