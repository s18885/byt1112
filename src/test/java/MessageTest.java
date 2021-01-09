import junit.framework.TestCase;
import org.junit.Test;

import java.util.Date;

public class MessageTest extends TestCase {
    private final User user = new User("Michel", "Avramanko", new Date(2000 - 10 - 10));
    private final User user1 = new User("Luis", "Moriarti", new Date(1990 - 10 - 10));
    private final Chat chat = new Chat(user, user1, new Date(2021 - 31 - 12));
    private final Message message = new Message(chat,new Date(2008-12-12),"Hello");

    @Test
    public void testGetChat(){
        assertEquals(chat,message.getChat());
    }
    @Test
    public void testGetDateSend(){
        assertEquals(message.getDateSend(),new Date(2008-12-12));
    }
    @Test
    public void testGetContent(){
        assertEquals(message.getContent(),"Hello");
    }
    @Test
    public void testDeleteMessage(){
        assertTrue(message.deleteMessage(chat.getUser()));
    }
    @Test
    public void testCreateMessage(){
        assertTrue(message.createMessage(chat.getUser()));
    }
    @Test
    public void testEditMessage(){
        assertTrue(message.editMessage(chat.getUser()));
    }
}
