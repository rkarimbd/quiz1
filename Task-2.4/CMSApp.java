import model.Contact;

public class CMSApp {

    public static void main(String[] args) {

        Contact contact = new Contact("Rezaul", "Karim", "Inovexia Ltd", "Sr. Software Engineer");
        contact.addContact("641-233-9385", "Home");
        contact.addEmailAddress("rezaul@inovexialtd.com", "Work");
        System.out.println(contact.toJson());
    }

}
