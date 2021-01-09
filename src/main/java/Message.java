import java.util.Date;

public class Message {
    private final Chat chat;
    private final Date dateSend;
    private final String content;
    private boolean isCreated = true;
    private boolean isDeleted = true;
    private boolean isEdit = true;

    public Message(Chat chat, Date dateSend, String content) {
        this.chat = chat;
        this.dateSend = dateSend;
        this.content = content;
    }

    public Chat getChat() {
        return chat;
    }

    public Date getDateSend() {
        return dateSend;
    }

    public String getContent() {
        return content;
    }

    public boolean deleteMessage(User user) {
        if (user != null) {
            return isDeleted;
        }
        return !isDeleted;
    }
    public boolean createMessage(User user) {
        if (user != null) {
            return isCreated;
        }
        return !isCreated;
    }
    public boolean editMessage(User user) {
        if (user != null) {
            return isEdit;
        }
        return !isEdit;
    }
}
