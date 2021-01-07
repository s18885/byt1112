import java.util.Collection;
import java.util.Date;
import java.util.HashSet;

public class Moderator extends Person {

    private int accessRightsCode;

    private final Collection<Report> assignedReports = new HashSet<Report>();

    protected Moderator(String name, String surname, Date dateOfBirth, int accessRightsCode) {
        super(name, surname, dateOfBirth);
        setAccessRightsCode(accessRightsCode);
    }

    public int getAccessRightsCode() {
        return accessRightsCode;
    }

    public void setAccessRightsCode(int accessRightsCode) {
        this.accessRightsCode = accessRightsCode;
    }

    public Collection<Report> getAssignedReports() {
        return assignedReports;
    }

    public boolean register() {
        setDateOfRegistration(new Date());
        return true;
    }

    public boolean login() {
        return true;
    }

    public boolean assignReport(Report report) {
        return assignedReports.add(report);
    }

    public boolean unassignReport(Report report) {
        return assignedReports.remove(report);
    }

    public boolean removeInappropriateContent(Report report) {
        return true;
    }

    public boolean punishUser(Report report) {
        return true;
    }

    @Override
    public String toString() {
        return "Moderator{" +
                super.toString() +
                "accessRightsCode=" + accessRightsCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Moderator)) return false;
        if (!super.equals(o)) return false;

        Moderator moderator = (Moderator) o;

        return getAccessRightsCode() == moderator.getAccessRightsCode();
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + getAccessRightsCode();
        return result;
    }
}
