package part2;

import java.util.Date;

public class WorkItem {
    private String companyName;
    private String role;
    private Date dateStarted;
    private Date dateFinished;

    public WorkItem(String companyName, String role, Date dateStarted, Date dateFinished)
    {
        this.companyName = companyName;
        this.role = role;
        this.dateStarted = dateStarted;
        this.dateFinished = dateFinished;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getRole() {
        return role;
    }

    public Date getDateStarted() {
        return dateStarted;
    }

    public Date getDateFinished() {
        return dateFinished;
    }
}
