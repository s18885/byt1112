import java.util.*;

public class User extends Person {

    private final Collection<Person> favourites = new HashSet<Person>();

    private final Collection<PhotoAlbum> photoAlbums = new HashSet<PhotoAlbum>();

    private final Collection<Chat> chats = new HashSet<Chat>();

    private final Collection<Pet> pets = new HashSet<Pet>();

    private final Collection<Meeting> meetings = new HashSet<Meeting>();

    private boolean isActive = true;

    protected User(String name, String surname, Date dateOfBirth) {
        super(name, surname, dateOfBirth);
    }

    public boolean isActive() {
        return isActive;
    }

    public Collection<Person> getFavourites() {
        return favourites;
    }

    public Collection<PhotoAlbum> getPhotoAlbums() {
        return photoAlbums;
    }

    public Collection<Chat> getChats() {
        return chats;
    }

    public Collection<Pet> getPets() {
        return pets;
    }

    public Collection<Meeting> getMeeting() {
        return meetings;
    }

    public boolean register() {
        setDateOfRegistration(new Date());
        return true;
    }

    public boolean login() {
        return true;
    }

    public boolean addToFavourites(Person person) {
        return favourites.add(person);
    }

    public boolean removeFromFavourites(Person person) {
        return favourites.remove(person);
    }

    public boolean archive() {
        isActive = false;
        return true;
    }

    public boolean reactivate() {
        isActive = true;
        return true;
    }

    public boolean addPhotoAlbum(PhotoAlbum photoAlbum) {
        return photoAlbums.add(photoAlbum);
    }

    public boolean removePhotoAlbum(PhotoAlbum photoAlbum) {
        return photoAlbums.remove(photoAlbum);
    }

    public boolean addChat(Chat chat) {
        return chats.add(chat);
    }

    public boolean removeChat(Chat chat) {
        return chats.remove(chat);
    }

    public boolean addPet(Pet pet) {
        return pets.add(pet);
    }

    public boolean removePet(Pet pet) {
        return pets.remove(pet);
    }

    public boolean addMeeting(Meeting meeting) {
        return meetings.add(meeting);
    }

    public boolean removeMeeting(Meeting meeting) {
        return meetings.remove(meeting);
    }

    @Override
    public String toString() {
        return "User{" +
                super.toString() +
                ", isActive=" + isActive +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        if (!super.equals(o)) return false;

        User user = (User) o;

        return isActive() == user.isActive();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (isActive() ? 1 : 0);
        return result;
    }
}
