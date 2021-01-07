import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

public class ModeratorTest extends TestCase {


    private final Moderator moderator = new Moderator("Bob", "Fast", new Date(), 1);

    @Test
    public void testGetAccessRightsCode() {
        assertEquals(1, moderator.getAccessRightsCode());
    }

    @Test
    public void testSetAccessRightsCode() {
        assertEquals(1, moderator.getAccessRightsCode());
        moderator.setAccessRightsCode(2);
        assertEquals(2, moderator.getAccessRightsCode());
    }

    @Test
    public void testRegister() {
        assertNull(moderator.getDateOfRegistration());
        moderator.register();
        assertEquals(new Date().getYear(), moderator.getDateOfRegistration().getYear());
        assertEquals(new Date().getMonth(), moderator.getDateOfRegistration().getMonth());
        assertEquals(new Date().getDay(), moderator.getDateOfRegistration().getDay());
    }
}