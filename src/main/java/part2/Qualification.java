package part2;

import java.util.Date;

public class Qualification {
    private String qualificationName;
    private String institutionName;
    private Date dateAchieved;

    public Qualification(String qualificationName, String institutionName, Date dateAchieved){
        this.qualificationName = qualificationName;
        this.institutionName = institutionName;
        this.dateAchieved = dateAchieved;
    }

    public String getQualificationName() {
        return qualificationName;
    }

    public String getInstitutionName() {
        return institutionName;
    }

    public Date getDateAchieved() {
        return dateAchieved;
    }
}
