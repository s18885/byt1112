import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

public class UserTest extends TestCase {

    private final User user = new User("Bob", "Fast", new Date());

    @Test
    public void testIsActive() {
        assertTrue(user.isActive());
    }

    @Test
    public void testArchive() {
        assertTrue(user.isActive());
        user.archive();
        assertFalse(user.isActive());
    }

    @Test
    public void testReactivate() {
        assertTrue(user.isActive());
        user.archive();
        assertFalse(user.isActive());
        user.reactivate();
        assertTrue(user.isActive());
    }

    @Test
    public void testRegister() {
        assertNull(user.getDateOfRegistration());
        user.register();
        assertEquals(new Date().getYear(), user.getDateOfRegistration().getYear());
        assertEquals(new Date().getMonth(), user.getDateOfRegistration().getMonth());
        assertEquals(new Date().getDay(), user.getDateOfRegistration().getDay());
    }
}