package Patterns;

public class Person {

    private final String firstName;
    private final String lastName;
    private final String middleName;
    private final String streetAddress;
    private final String city;
    private final String state;
    private final boolean isFemale;
    private final boolean isEmployed;
    private final boolean isHomeOwner;

    public Person(
        final String newfirstName,
        final String newlastName,
        final String newmiddleName,
        final String newstreetAddress,
        final String newcity,
        final String newstate,
        final boolean newisFemale,
        final boolean newisEmployed,
        final boolean newisHomeOwner
    )

    {
        this.firstName = newfirstName;
        this.lastName = newlastName;
        this.middleName = newmiddleName;
        this.streetAddress = newstreetAddress;
        this.city = newcity;
        this.state = newstate;
        this.isFemale = newisFemale;
        this.isEmployed = newisEmployed;
        this.isHomeOwner = newisHomeOwner;
    }

    public static class PersonBuilder {

        private String nestedfirstName;
        private String nestedlastName;
        private String nestedmiddleName;
        private String nestedstreetAddress;
        private String nestedcity;
        private String nestedstate;
        private boolean nestedisFemale;
        private boolean nestedisEmployed;
        private boolean nestedisHomeOwner;

        public PersonBuilder setFirstName(String newFirstName) {
            this.nestedfirstName = newFirstName;
            return this;
        }

        public PersonBuilder setLastName(String newLastName) {
            this.nestedlastName = newLastName;
            return this;
        }

        public PersonBuilder setMiddleName(String newMiddlename) {
            this.nestedmiddleName = newMiddlename;
            return this;
        }

        public PersonBuilder setStreetAddress(String newStreetAddress) {
            this.nestedstreetAddress = newStreetAddress;
            return this;
        }

        public PersonBuilder setCity(String newCity) {
            this.nestedcity = newCity;
            return this;
        }

        public PersonBuilder setState(String newState) {
            this.nestedstate = newState;
            return this;
        }

        public PersonBuilder setIsFemale(boolean newIsFemale) {
            this.nestedisFemale = newIsFemale;
            return this;
        }

        public PersonBuilder setIsEmployed(boolean newIsEmployed) {
            this.nestedisEmployed = newIsEmployed;
            return this;
        }

        public PersonBuilder setIsHomeOwner(boolean newIsHomeOwner) {
            this.nestedisHomeOwner = newIsHomeOwner;
            return this;
        }

        public Person createPerson(){
            return new Person(
                    nestedfirstName,
                    nestedlastName,
                    nestedmiddleName,
                    nestedstreetAddress,
                    nestedcity,
                    nestedstate,
                    nestedisFemale,
                    nestedisEmployed,
                    nestedisHomeOwner
            );
        }

    }
}