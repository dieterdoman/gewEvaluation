package task2;
import java.util.ArrayList;
import java.util.List;

public final class Cv {
    private final PersonalDetails personalDetails;
    private final List<WorkItem> workHistory;
    private final List<Qualification> qualifications;

    public Cv(PersonalDetails personalDetails, List<WorkItem> workHistory, List<Qualification> qualifications)
    {
        this.personalDetails = new PersonalDetails(personalDetails.getName(), personalDetails.getSurname());
        this.workHistory = new ArrayList<>(workHistory);
        this.qualifications = new ArrayList<>(qualifications);
    }

    public PersonalDetails getPersonalDetails() {
        return new PersonalDetails(personalDetails.getName(), personalDetails.getSurname());
    }

    public List<WorkItem> getWorkHistory() {
        return new ArrayList<>(workHistory);
    }

    public List<Qualification> getQualifications() {
        return new ArrayList<>(qualifications);
    }
}
