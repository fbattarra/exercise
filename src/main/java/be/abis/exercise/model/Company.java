package be.abis.exercise.model;

public class Company {

    private String name;
    private String telephoneNumber;
    private String vatNr;

    private Address companyAddress;

    public Company() {
    }

    public Company(String name, String telephoneNumber, String vatNr, Address companyAddress) {
        this.name = name;
        this.telephoneNumber = telephoneNumber;
        this.vatNr = vatNr;
        this.companyAddress = companyAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public String getVatNr() {
        return vatNr;
    }

    public void setVatNr(String vatNr) {
        this.vatNr = vatNr;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }
}
