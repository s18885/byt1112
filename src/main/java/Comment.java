import java.util.Date;

public class Comment {
    private User author;
    private String message;
    private Comment replyTo;
    private Date createdAt;

    private int likesCounter;
    private boolean isVisible;

    public Comment(User commentAuthor, String message) {
        this.author = commentAuthor;
        this.message = message;
        this.createdAt = new Date();
        setVisible(true);
    }

    public Comment(User commentAuthor, String message, Comment replyTo) {
        this.author = commentAuthor;
        this.message = message;
        this.createdAt = new Date();
        this.replyTo = replyTo;
        setVisible(true);
    }

    public void like() {
        likesCounter++;
    }

    public static Comment createComment(User author, String message) {
        return new Comment(author, message);
    }

    public static Comment createComment(User author, String message, Comment replyTo) {
        return new Comment(author, message, replyTo);
    }

    public void deleteComment() {
        setVisible(false);
    }

    public boolean isVisible() {
        return isVisible;
    }

    private void setVisible(boolean visible) {
        isVisible = visible;
    }

    public int getLikesCounter() {
        return likesCounter;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public Comment getReplyTo() {
        return replyTo;
    }

    public String getMessage() {
        return message;
    }

    public User getAuthor() {
        return author;
    }
}
