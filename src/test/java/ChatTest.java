import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

public class ChatTest extends TestCase {
    private final User user = new User("Michel", "Avramanko", new Date(2000 - 10 - 10));
    private final User user1 = new User("Luis", "Moriarti", new Date(1990 - 10 - 10));
    private final Chat chat = new Chat(user, user1, new Date(2021 - 31 - 12));

    @Test
    public void testCreateChat() {
        assertTrue(chat.createChat(user));
    }

    @Test
    public void testDaleteChat() {
        assertTrue(chat.deleteChat(user));
    }

    @Test
    public void testGetUser() {
        assertEquals(user, chat.getUser());
    }

    @Test
    public void testGetUser1() {
        assertEquals(user1, chat.getUser1());
    }
    @Test
    public void testGetDateCreated(){
        assertEquals(chat.getDateCreated(),new Date(2021 - 31 - 12));
    }
}
