package model;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.List;

public class Contact {
    private String firstName;
    private String lastName;
    private String company;
    private String jobTitle;
    private List<PhoneNumber> phoneNumbers;
    private List<EmailAddress> emailAddresses;

    public Contact(String firstName, String lastName, String company, String jobTitle) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.company = company;
        this.jobTitle = jobTitle;
        this.phoneNumbers = new ArrayList<>();
        this.emailAddresses = new ArrayList<>();
    }

    public void addContact(String number, String label) {
        phoneNumbers.add(new PhoneNumber(number, label));
    }

    public void addEmailAddress(String address, String label) {
        emailAddresses.add(new EmailAddress(address, label));
    }

    public String toJson() {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        return gson.toJson(this);
    }
}
