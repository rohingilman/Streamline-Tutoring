
package group.project;

import java.util.ArrayList;
import java.util.Arrays;

public class Course {// Course object
    private ArrayList<User> Members = new ArrayList<>();
    private ArrayList<Date> AvailableTimes= new ArrayList<>();
    private String Name;
    private String Number;
    
    
    public Course(String name, String number){
        Name= name;
        Number= number;
    }
    
    public String getName(){
        return Name;
        
    }
    
    public String getNumber(){
        return Number;
        
    }    
    public String[] getInfo(){
    String ar[] = new String[2];
    ar[0]= Name;
    ar[1]= Number;
    return ar;
    }
    
    public void addMember(User user) {// Each course will have a list of Users that are in it
        Members.add(user);
    }
    
    public void addDate(Date date) {// Each course will have a list of Users that are in it
        AvailableTimes.add(date);
    }
    
    public void deleteDate(String name, String number, String tutor) {// Each course will have a list of Users that are in it
 
    }
    
    public void myMembers() {
        if (AvailableTimes.isEmpty()){
            System.out.println("You have no Members");
        }
        else{
            System.out.println(Name+" "+Number+" members are");
            for (int i =0; i < AvailableTimes.size(); i++){
                System.out.println(Arrays.toString(AvailableTimes.get(i).getInfo()));
            }
        }

    }
    public void myTimes() {
        if (AvailableTimes.isEmpty()){
            System.out.println("There are no appointments available");
        }
        else{
            System.out.println(Name+" "+Number+" appointments available are");
            for (int i =0; i < AvailableTimes.size(); i++){
                System.out.println(Arrays.toString(AvailableTimes.get(i).getInfo()));
            }
        }

    }
    

    public ArrayList<Date> getDates(){
        return AvailableTimes;
    }



}
