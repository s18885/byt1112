import java.util.List;
import java.util.ArrayList;

public class Photo {

    private int likesCounter;
    private PhotoAlbum albumBelongsTo;
    private List<Comment> commentedWith;
    private Person profileOf;

    public Photo( PhotoAlbum album)
    {
        albumBelongsTo = album;
        commentedWith = new ArrayList<>();
        profileOf = null;
        likesCounter = 0;
    }

    public void like()
    {
        likesCounter++;
    }

    public void setProfilePicture()
    {
        profileOf = albumBelongsTo.getCreator();
    }

    public int getLikesCounter()
    {
        return likesCounter;
    }

    public PhotoAlbum getAlbumBelongsTo()
    {
        return albumBelongsTo;
    }

    public List<Comment> getCommentedWith()
    {
        return commentedWith;
    }

    public Person getProfileOf()
    {
        return profileOf;
    }
}