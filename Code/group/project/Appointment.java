
package group.project;


public class Appointment {// Appointment object, created when a corresponding date is chosen by a student
    private User Student;
    private String Date;
    private String Time;
    private String CourseName;
    private String CourseNum;
    private User Tutor;
    public Appointment(String courseName, String courseNum, String date, String time, User tutor, User student) {
        CourseName= courseName;
        CourseNum= courseNum;
        Date= date;
        Time= time;
        Tutor=tutor;
        Student= student;
        
    }

    
    
    public String[] getInfo(){
    String ar[] = new String[6];
    ar[0]= CourseName;
    ar[1]= CourseNum;
    ar[2]= Date;
    ar[3]= Time;
    ar[4]= Tutor.getName();
    ar[5]= Student.getName();
    return ar;
    }
}
