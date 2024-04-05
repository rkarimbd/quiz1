package model;

public class PhoneNumber {
    private String number;
    private String Type;

    public PhoneNumber(String number, String Type) {
        this.number = number;
        this.Type = Type;
    }

    public String getNumber() {
        return number;
    }

    public String getType() {
        return Type;
    }
}
