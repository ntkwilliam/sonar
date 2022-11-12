import com.github.javafaker.Faker;

public class Main {

    private static final Faker faker = new Faker();

    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName(faker.name().firstName());
        person.setLastName(faker.name().lastName());
        person.setEmail(faker.internet().emailAddress());
        person.setPhoneNumber(faker.phoneNumber().cellPhone());

        System.out.println(person);

    }

}
