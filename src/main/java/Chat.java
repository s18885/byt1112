import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Chat {
    private final User user;
    private final User user1;
    private final Date dateCreated;
    private final Collection<Message> messages = new HashSet<Message>();
    private boolean isDeleted = true;
    private boolean isCreated = true;

    protected Chat(User user, User user1, Date dateCreated) {
        this.user = user;
        this.user1 = user1;
        this.dateCreated = dateCreated;
    }

    public boolean createChat(User user) {
        if (user != null) {
            return isCreated;
        }
        return !isCreated;
    }

    public boolean deleteChat(User user) {
        if (user != null) {
            return isDeleted;
        }
        return !isDeleted;
    }

    public User getUser() {
        return user;
    }

    public User getUser1() {
        return user1;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

}
