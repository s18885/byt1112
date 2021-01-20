import java.util.Date;

public abstract class Person {

    private String name;
    private String surname;
    private Date dateOfBirth;
    private Date dateOfRegistration;
    private Photo profilePhoto;

    protected Person(String name, String surname, Date dateOfBirth) throws NullPointerException {
        setName(name);
        setSurname(surname);
        setDateOfBirth(dateOfBirth);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public Date getDateOfRegistration() {
        return dateOfRegistration;
    }

    public Photo getProfilePhoto() {
        return profilePhoto;
    }

    public void setName(String name) throws NullPointerException {
        if (name == null) throw new NullPointerException("Name cannot be null");
        this.name = name;
    }

    public void setSurname(String surname) throws NullPointerException {
        if (surname == null) throw new NullPointerException("Surname cannot be null");
        this.surname = surname;
    }

    public void setDateOfBirth(Date dateOfBirth) throws NullPointerException {
        if (dateOfBirth == null) throw new NullPointerException("DateOfBirth cannot be null");
        this.dateOfBirth = dateOfBirth;
    }

    public void setDateOfRegistration(Date dateOfRegistration) {
        this.dateOfRegistration = dateOfRegistration;
    }

    public void setProfilePhoto(Photo profilePhoto) {
        this.profilePhoto = profilePhoto;
    }

    abstract public boolean register();

    abstract public boolean login();

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                ", dateOfRegistration=" + dateOfRegistration;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;

        Person person = (Person) o;

        if (!getName().equals(person.getName())) return false;
        if (!getSurname().equals(person.getSurname())) return false;
        if (!getDateOfBirth().equals(person.getDateOfBirth())) return false;
        return getDateOfRegistration().equals(person.getDateOfRegistration());
    }

    @Override
    public int hashCode() {
        int result = getName().hashCode();
        result = 31 * result + getSurname().hashCode();
        result = 31 * result + getDateOfBirth().hashCode();
        result = 31 * result + getDateOfRegistration().hashCode();
        return result;
    }
}