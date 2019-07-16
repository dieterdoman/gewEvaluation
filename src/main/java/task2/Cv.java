package task2;
import com.google.common.collect.ImmutableList;

import java.util.List;

public final class Cv {
    private final PersonalDetails personalDetails;
    private final ImmutableList<WorkItem> workHistory;
    private final ImmutableList<Qualification> qualifications;

    public Cv(PersonalDetails personalDetails, List<WorkItem> workHistory, List<Qualification> qualifications)
    {
        this.personalDetails = new PersonalDetails(personalDetails.getName(), personalDetails.getSurname());
        this.workHistory = ImmutableList.<WorkItem>builder()
                .addAll(workHistory)
                .build();
        this.qualifications = ImmutableList.<Qualification>builder()
                .addAll(qualifications)
                .build();
    }

    public PersonalDetails getPersonalDetails() {
        return new PersonalDetails(personalDetails.getName(), personalDetails.getSurname());
    }

    public List<WorkItem> getWorkHistory() {
        return ImmutableList.<WorkItem>builder()
                .addAll(workHistory)
                .build();
    }

    public List<Qualification> getQualifications() {
        return ImmutableList.<Qualification>builder()
                .addAll(qualifications)
                .build();
    }
}
