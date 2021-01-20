import java.util.Date;

public class Message {
    private final Chat chat;
    private final Date dateSend;
    private final String content;
    private static boolean isCreated = true;
    private static boolean isDeleted = true;
    private static boolean isEdit = true;

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

    public static boolean deleteMessage(User user) {
        if (user != null) {
            return isDeleted;
        }
        return !isDeleted;
    }
    public static boolean createMessage(User user) {
        if (user != null) {
            return isCreated;
        }
        return !isCreated;
    }
    public static boolean editMessage(User user) {
        if (user != null) {
            return isEdit;
        }
        return !isEdit;
    }
}
