package part2;
import com.google.common.collect.ImmutableList;

public class Cv {
    private PersonalDetails personalDetails;
    private ImmutableList<WorkItem> workHistory;
    private ImmutableList<Qualification> qualifications;

    public Cv(PersonalDetails personalDetails, ImmutableList<WorkItem> workHistory, ImmutableList<Qualification> qualifications)
    {
        this.personalDetails = personalDetails;
        this.workHistory = workHistory;
        this.qualifications = qualifications;
    }

    public PersonalDetails getPersonalDetails() {
        return personalDetails;
    }

    public ImmutableList<WorkItem> getWorkHistory() {
        return workHistory;
    }

    public ImmutableList<Qualification> getQualifications() {
        return qualifications;
    }
}
