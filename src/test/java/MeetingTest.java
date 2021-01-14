import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

public class MeetingTest extends TestCase {
    private final  Date date = new Date();

    private final User user = new User("Michel", "Avramanko", new Date(2000 - 10 - 10));
    private final User user1 = new User("Luis", "Moriarti", new Date(1990 - 10 - 10));
    private final Meeting meeting = new Meeting(date, "Today", "Warsaw");


    @Test
    public void testGetDateOfMeeting() {
        assertEquals(meeting.getDateOfMeeting(), date);
    }

    @Test
    public void testGetDescription() {
        assertEquals(meeting.getDescription(), "Today");
    }

    @Test
    public void testGetAddress() {
        assertEquals(meeting.getAddress(), "Warsaw");
    }


    @Test
    public void testInvitePeople() {
        meeting.invitePeople(user);
        assertTrue(meeting.getPending().contains(user));
        assertFalse(meeting.getInvited().contains(user));

    }

    @Test
    public void testAcceptInvite() {
        meeting.invitePeople(user);
        meeting.acceptInvitation(user);
        assertFalse(meeting.getPending().contains(user));
        assertTrue(meeting.getInvited().contains(user));

    }





}
