import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

public class CommentTest {
    private Date birthDate;
    private User user;
    String messageText1;
    String messageText2;
    private Comment commentGeneral;
    private Comment commentReply;

    @Before
    public void setUp() {
        birthDate = new Date();
        user = new User("Name", "Surname", birthDate);
        messageText1 = "Comment1";
        messageText2 = "Comment2";
        commentGeneral = new Comment(user, messageText1);
        commentReply = new Comment(user, messageText2, commentGeneral);
    }

    @Test
    public void testLikeCounter() {
        Assert.assertEquals(0, commentGeneral.getLikesCounter());
        commentGeneral.like();
        Assert.assertEquals(1, commentGeneral.getLikesCounter());
    }

    @Test
    public void testDeleteComment() {
        Assert.assertTrue(commentGeneral.isVisible());
        commentGeneral.deleteComment();
        Assert.assertFalse(commentGeneral.isVisible());
    }

    @Test
    public void testCreateComment() {
        Comment commentGeneralLocal = Comment.createComment(user, messageText1);
        Comment commentRepliedLocal = Comment.createComment(user, messageText2, commentGeneralLocal);

        Assert.assertEquals(user, commentGeneralLocal.getAuthor());
        Assert.assertTrue(commentGeneralLocal.isVisible());
        Assert.assertEquals(0, commentGeneralLocal.getLikesCounter());

        Assert.assertEquals(messageText1, commentGeneralLocal.getMessage());
        Assert.assertEquals(messageText2, commentRepliedLocal.getMessage());

        Assert.assertNull(commentGeneralLocal.getReplyTo());
        Assert.assertNotNull(commentRepliedLocal.getReplyTo());
    }


}
