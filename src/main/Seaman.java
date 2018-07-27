package main;

public class Seaman extends CrewMember {
    private String jobDescription;
    public Seaman(String name, int age, String jobDescription) {
        super(name, age);
        this.jobDescription = jobDescription;
    }

    public String getJobDescription() {
        return jobDescription;
    }

    public void setJobDescription(String jobDescription) {
        this.jobDescription = jobDescription;
    }
}
