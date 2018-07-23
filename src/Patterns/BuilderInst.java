package Patterns;

public class BuilderInst {
    void startBuilder(){
        final Person person1 = new Person.PersonBuilder()
                .setFirstName("Андрей")
                .setLastName("Бадин")
                .setMiddleName("Артурович")
                .setStreetAddress("Москва")
                .setStreetAddress("Ленина 1")
                .setState("Москва")
                .setIsFemale(false)
                .setIsEmployed(false)
                .setIsHomeOwner(true)
                .createPerson();
        System.out.println(person1.toString());
    }
}
