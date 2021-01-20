
public class Pet {

    private String name;
    private int age;
    private String gender;

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public void setName(String name) throws NullPointerException {
        if (name == null) throw new NullPointerException("Name cannot be null");
        this.name = name;
    }
    public void setAge(int age) throws NullPointerException {
        if (age == 0) throw new NullPointerException("Age cannot be null");
        this.age = age;
    }
    public void setGender(String gender) throws NullPointerException {
        if (gender == null) throw new NullPointerException("Gender cannot be null");
        this.gender = gender;
    }


    public boolean editInfo() {
        if(age < 0) return false;
        System.out.println("Edit pet" + name);
        return true;
    }

    public boolean delete() {
        if(age < 0) return false;
        System.out.println("Deleting pet");
        return true;
    }

    public static Pet createPet()
    {
        return new Pet("Name",1,"Gender");
    }

}