import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class PhotoAlbumTest {

    private User ulfrick;
    private PhotoAlbum summerHolidays;

    @Before
    public void setUp()
    {
        ulfrick = new User("Ulfrick","Stormcloack",new Date(System.currentTimeMillis()));
        summerHolidays = new PhotoAlbum(ulfrick,"Summer Holidays");
    }

    @Test
    public void createPhotoAlbumTest()
    {
        String albumName = "Kicking Imperial A$$es";
        PhotoAlbum newAlbum = PhotoAlbum.CreatePhotoAlbum(ulfrick,albumName);
        assertNotNull(newAlbum);
        assertEquals(ulfrick,newAlbum.getCreator());
        assertFalse(newAlbum.isPrivate());
        assertEquals(albumName ,newAlbum.getAlbumName());
    }

    @Test
    public void addPhotoTest()
    {
        assertEquals(0,summerHolidays.getPhotoes().size());
        for (int i = 0; i < 10; i++) summerHolidays.addPhoto();
        assertEquals(10,summerHolidays.getPhotoes().size());
    }

    @Test
    public void deletePhotoTest()
    {
        addPhotoTest();
        for (int i = 9; i >= 0; i--) summerHolidays.deletePhoto(summerHolidays.getPhotoes().get(i));
        assertEquals(0,summerHolidays.getPhotoes().size());
    }

    @Test
    public void makeAlbumPrivateTest()
    {
        assertFalse(summerHolidays.isPrivate());
        summerHolidays.makeAlbumPrivate();
        assertTrue(summerHolidays.isPrivate());
        summerHolidays.makeAlbumPrivate();
        assertFalse(summerHolidays.isPrivate());
    }
}
