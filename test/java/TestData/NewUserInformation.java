package TestData;

import com.github.javafaker.Faker;

import java.util.Locale;

public class NewUserInformation {
    public NewUserInformation(){
        createNewUser();
    }
    private static String firstName;
    private static String lastName;
    private static String email;
    private static String password;
    Faker faker = new Faker(new Locale("en-US"));


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String userName) {
        firstName = userName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        NewUserInformation.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public void createNewUser(){
        setFirstName(faker.name().firstName());
        setLastName(faker.name().lastName());
        setEmail(getFirstName()+"."+getLastName()+"@mail.com");
        setPassword(getFirstName() + getLastName() + "123#");
    }
}

