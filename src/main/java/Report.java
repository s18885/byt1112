import java.util.ArrayList;
import java.util.Date;

public class Report {
    private int idReport;
    private String message;
    private Date dateCreated;
    private Date dateClosed;
    private String decision;
    private String reportStatus;

    private ArrayList<Report> listOfReeports;

    public Report(int idReport, String message, Date dateCreated, Date dateClosed, String decision, String reportStatus, ArrayList<Report> listOfReeports) {
        this.idReport = idReport;
        this.message = message;
        this.dateCreated = dateCreated;
        this.dateClosed = dateClosed;
        this.decision = decision;
        this.reportStatus = reportStatus;
        this.listOfReeports = listOfReeports;
    }

    public Report(int idReport, String message, Date dateCreated, ArrayList<Report> listOfReeports) {
        this.idReport = idReport;
        this.message = message;
        this.dateCreated = dateCreated;
        this.listOfReeports = listOfReeports;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public Date getDateClosed() {
        return dateClosed;
    }

    public void setDateClosed(Date dateClosed) {
        this.dateClosed = dateClosed;
    }

    public String getDecision() {
        return decision;
    }

    public void setDecision(String decision) {
        this.decision = decision;
    }

    public String getReportStatus() {
        return reportStatus;
    }

    public void setReportStatus(String reportStatus) {
        this.reportStatus = reportStatus;
    }

    public int getIdReport() {
        return idReport;
    }

    public void createReport(){
        listOfReeports.add(this);
    }

    public void deleteReport(int idReport){
        for (int i = 0; i < listOfReeports.size() - 1; i++) {
            if (this.getIdReport() == idReport){
                listOfReeports.remove(i);
            }
        }

    }
}
