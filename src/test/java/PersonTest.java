import junit.framework.TestCase;
import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

public class PersonTest extends TestCase {

    private final Person person = new User("Bob", "Fast", new Date());

    @Test
    public void testTestGetName() {
        assertEquals("Bob", person.getName());
    }

    @Test
    public void testGetSurname() {
        assertEquals("Fast", person.getSurname());
    }

    @Test
    public void testGetDateOfBirth() {
        assertEquals(new Date().getYear(), person.getDateOfBirth().getYear());
        assertEquals(new Date().getMonth(), person.getDateOfBirth().getMonth());
        assertEquals(new Date().getDate(), person.getDateOfBirth().getDate());
    }

    @Test
    public void testGetDateOfRegistration() {
        assertNull(person.getDateOfRegistration());
    }

    @Test
    public void testTestSetName() {
        assertEquals("Bob", person.getName());
        person.setName("Ala");
        assertEquals("Ala", person.getName());
        try {
            person.setName(null);
            fail();
        } catch (NullPointerException ignored) {
        }
    }

    @Test
    public void testSetSurname() {
        assertEquals("Fast", person.getSurname());
        person.setSurname("Black");
        assertEquals("Black", person.getSurname());
        try {
            person.setSurname(null);
            fail();
        } catch (NullPointerException ignored) {
        }
    }

    @Test
    public void testSetDateOfBirth() {
        assertEquals(new Date().getYear(), person.getDateOfBirth().getYear());
        assertEquals(new Date().getMonth(), person.getDateOfBirth().getMonth());
        assertEquals(new Date().getDate(), person.getDateOfBirth().getDate());
        Date date = new Date();
        date.setYear(2000);
        date.setMonth(Calendar.FEBRUARY);
        date.setDate(22);
        person.setDateOfBirth(date);
        assertEquals(2000, person.getDateOfBirth().getYear());
        assertEquals(Calendar.FEBRUARY, person.getDateOfBirth().getMonth());
        assertEquals(22, person.getDateOfBirth().getDate());
        try {
            person.setDateOfBirth(null);
            fail();
        } catch (NullPointerException ignored) {
        }
    }

    @Test
    public void testSetDateOfRegistration() {
        assertNull(person.getDateOfRegistration());
        person.setDateOfRegistration(new Date());
        assertEquals(new Date().getYear(), person.getDateOfRegistration().getYear());
        assertEquals(new Date().getMonth(), person.getDateOfRegistration().getMonth());
        assertEquals(new Date().getDate(), person.getDateOfRegistration().getDate());
    }
}