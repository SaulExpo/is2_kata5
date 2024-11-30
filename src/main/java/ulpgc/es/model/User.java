package ulpgc.es.model;

public class User {

    public enum Gender{
        Male,
        Female
    }

    private final String name;
    private final String surname;
    private final String email;
    private final Gender gender;
    private byte[] photo;

    public User(String name, String surname, String email, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.gender = gender;
    }

    public void setPhoto(byte[] photo) {
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public Gender getGender() {
        return gender;
    }

    public byte[] getPhoto() {
        return photo;
    }
}
