public class IndividualCustomer extends Customer{
    private String nationalityNumber;

    private String firstName;

    private String lastName;

    private String phoneNumber;

    public String getNationalityNumber() {
        return nationalityNumber;
    }

    public void setNationalityNumber(String nationalityNumber) {
        this.nationalityNumber = nationalityNumber;
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

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
