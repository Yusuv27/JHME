package MHJAVAException.data;

public class User {
    protected String Surname;
    protected String Name;
    protected String MiddleName;
    protected String DateOfBirth;
    protected String PhoneNumber;
    protected String Gender;
    public User(String Surname,String Name,String MiddleName,String DateOfBirth,String PhoneNumber,String Gender){
        this.Surname=Surname;
        this.Name=Name;
        this.MiddleName=MiddleName;
        this.DateOfBirth=DateOfBirth;
        this.PhoneNumber=PhoneNumber;
        this.Gender=Gender;
    }

    public String getSurname() {
        return Surname;
    }

    public void setSurname(String surname) {
        Surname = surname;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getMiddleName() {
        return MiddleName;
    }

    public void setMiddleName(String middleName) {
        MiddleName = middleName;
    }

    public String getDateOfBirth() {
        return DateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        DateOfBirth = dateOfBirth;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String gender) {
        Gender = gender;
    }
}
