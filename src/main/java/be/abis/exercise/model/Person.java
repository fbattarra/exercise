package be.abis.exercise.model;

public class Person {

    private int personid;
    private String firstName;
    private String lastName;
    private int age;
    private String emailAddress;
    private String password;
    private String language;

    private Company company;

    public Person() {
    }

    public Person(int personid, String firstName, String lastName, int age, String emailAddress, String password, String language, Company company) {
        this.personid = personid;
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.emailAddress = emailAddress;
        this.password = password;
        this.language = language;
        this.company = company;
    }

    public int getPersonid() {
        return personid;
    }

    public void setPersonid(int personid) {
        this.personid = personid;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public String toString(){

        return this.getFirstName()+" "+this.getLastName()+
                " is "+this.getAge()+" years old and"+
                " works for "+this.getCompany().getName()+
                " in "+this.getCompany().getCompanyAddress().getTown();
    }
}
