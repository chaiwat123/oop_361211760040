package Lab8;

public class student  extends person {
    //attributes
    private String sid;
    private String major;


    public student(String name, int age, String gender) {
        super(name, age, gender);
    }

    public student(String name, int age, String gender, String sid, String major) {
        super(name, age, gender);
        this.sid = sid;
        this.major = major;
    }

    @Override
    public String toString() {
        return "student{" +
                "sid='" + sid + '\'' +
                ", major='" + major + '\'' +
                '}'+ super.toString();
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
}
