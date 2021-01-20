import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PetTest {

    private Pet pet;
    private String name;
    private int age;
    private String gender;

    @Before
    public void setUp(){
        name = "Name";
        age = 2;
        gender = "M";
        pet = new Pet(name,age,gender);
    }

    @Test
    public void setTest(){
        String newName = "NewName";
        assertEquals(name,pet.getName());
        pet.setName(newName);
        assertEquals(newName,pet.getName());

        int newAge = 2;
        assertEquals(age,pet.getAge());
        pet.setAge(newAge);
        assertEquals(newAge,pet.getAge());

        String newGender = "NewGender";
        assertEquals(gender,pet.getGender());
        pet.setGender(newGender);
        assertEquals(newGender,pet.getGender());
    }

    @Test
    public void editInfoTest(){
        assertTrue(pet.editInfo());
        pet.setAge(-5);
        assertFalse(pet.editInfo());
    }

    @Test
    public void deleteTest()
    {
        assertTrue(pet.delete());
        pet.setAge(-5);
        assertFalse(pet.delete());
    }

    @Test
    public void createPetTest()
    {
        Pet newPet = Pet.createPet();
        assertEquals("Name",newPet.getName());
        assertEquals(1,newPet.getAge());
        assertEquals("Gender",newPet.getGender());
    }


}
