import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

import java.util.Date;

public class PhotoTest {

    private User ulfrick;
    private PhotoAlbum summerHolidays;
    private Photo onTheBeach;

    @Before
    public void setUp()
    {
        ulfrick = new User("Ulfrick","Stormcloack",new Date(System.currentTimeMillis()));
        summerHolidays = new PhotoAlbum(ulfrick,"Summer Holidays");
        onTheBeach = new Photo(summerHolidays);

    }
    @Test
    public void likeTest()
    {
        assertEquals(0,onTheBeach.getLikesCounter());
        for (int i = 0; i < 10; i++) onTheBeach.like();
        assertEquals(10,onTheBeach.getLikesCounter());
    }

    @Test
    public void setProfilePictureTest()
    {
        assertNull(onTheBeach.getProfileOf());

        onTheBeach.setProfilePicture();
        assertEquals(ulfrick,onTheBeach.getProfileOf());

    }

}
