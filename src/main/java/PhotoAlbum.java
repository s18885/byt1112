import java.util.Date;
import java.util.List;
import java.util.ArrayList;

public class PhotoAlbum {

    private User creator;
    private String albumName;
    private Date date;
    private boolean isPrivate;
    private List<Photo> photoes;

    public PhotoAlbum(User creator, String albumName)
    {
        this.creator = creator;
        this.albumName = albumName;
        date = new Date(System.currentTimeMillis());
        photoes = new ArrayList<>();
        isPrivate = false;
    }

    public void addPhoto()
    {
        if(photoes != null)
        {
            photoes.add(new Photo(this));
        }
    }

    public void deletePhoto(Photo photo)
    {
        if(photoes != null)
        {
            photoes.remove(photo);
        }
    }

    public void makeAlbumPrivate()
    {
        isPrivate = !isPrivate;
    }

    public static PhotoAlbum CreatePhotoAlbum(User user, String albumName)
    {
        return new PhotoAlbum(user,albumName);
    }

    public User getCreator()
    {
        return creator;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public Date getDate()
    {
        return date;
    }

    public boolean isPrivate()
    {
        return isPrivate;
    }

    public List<Photo> getPhotoes()
    {
        return photoes;
    }

    public void setAlbumName(String albumName)
    {
        this.albumName = albumName;
    }
}
