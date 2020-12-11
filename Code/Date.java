
package group.project;

public class Date {// Date object, created for a course. Deleted when an appointment is created
    private User Tutor;
    private String Date;
    private String Time;
 
    public Date (String date, String time, User tutor){
        Date= date;
        Time= time;
        Tutor= tutor;
    }
    
    public String[] getInfo(){
    String ar[] = new String[3];
    ar[0]= Date;
    ar[1]= Time;
    ar[2]= Tutor.getName();
    return ar;
    }
    

    public String getDate(){
        return Date;
        
    }
    public String getTime(){
        return Time;
        
    }
    public String getTutor(){
        return Tutor.getName();
        
    }


    public User getObj(){
        return Tutor;
    }

}
