package ie.atu.week5;

public class StudentDetails {
    private String name;
    private String email;
    private String course;

    public StudentDetails() {
    }

    public StudentDetails(String name) {
        this.name = name;
    }

    public StudentDetails(String name, String email, String course) {
        this.name = name;
        this.email = email;
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
