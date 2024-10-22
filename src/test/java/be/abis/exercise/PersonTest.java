package be.abis.exercise;

import be.abis.exercise.model.Address;
import be.abis.exercise.model.Company;
import be.abis.exercise.model.Course;
import be.abis.exercise.model.Person;

public class PersonTest {
    public PersonTest() {
    }

    public static void main(String[] args){
        Address address = new Address("rue de Brabant", 24,"1000", "Brussel");

        Company company = new Company("FastLane", "+32123456","123456789",address);

        Person person = new Person(12,"John","Doe",42,"john@doe.com","motdepasse","en",company);


        System.out.println(person.toString());
    }
}
