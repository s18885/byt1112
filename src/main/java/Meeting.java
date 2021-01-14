import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Meeting {

    private Date dateOfMeeting;
    private String description;
    private String address;

    private List<Person> invited;

    public List<Person> getPending() {
        return pending;
    }

    public void setPending(List<Person> pending) {
        this.pending = pending;
    }

    private List<Person> pending;

    public Meeting(Date dateOfMeeting, String description, String address) {
        this.dateOfMeeting = dateOfMeeting;
        this.description = description;
        this.address = address;
        this.invited = new ArrayList<>();
        this.pending = new ArrayList<>();

    }

    public  Meeting delete(){
        return this;
    }

    public  void  invitePeople(Person e){
        this.pending.add(e);
    }

    public  void  acceptInvitation(Person e){
        this.pending.remove(e);
        this.invited.add(e);
    }


    public List<Person> getInvited() {
        return invited;
    }

    public void setInvited(List<Person> invited) {
        this.invited = invited;
    }

    public Date getDateOfMeeting() {
        return dateOfMeeting;
    }

    public void setDateOfMeeting(Date dateOfMeeting) {
        this.dateOfMeeting = dateOfMeeting;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
