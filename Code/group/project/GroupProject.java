
package group.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Evan Schwarzenbach
 */
public class GroupProject {
    static ArrayList<User> UserData = new ArrayList<>();// Stores all Users
    static ArrayList<Course> Courses = new ArrayList<>();// Stores all courses
    static boolean Loggedin;
    static int LoginIndex;// This number is used for the array list, whenever a user is officially logged in, the user will be: LoggedInUser= UserData.get(LoginIndex)
    
    public static void main(String[] args) throws Exception {
        boolean Trial= true;

        /* **************************************************************************************************** */

        //TESTER CODE

        createUser("Rohin", "password", "Admin"); // Add users to the databse
        createUser("Evan", "passcode", "Admin");
        createUser("Stephen", "passpass", "Admin");
        createUser("Tracy", "aserldsa", "Tutor");
        createUser("Ben", "ieldadfx", "Tutor");
        createUser("Abby", "asdfiekd", "Student");
        createUser("Hannah", "qiekdliz", "Student");
        createUser("Maddie", "eidlakde", "Student");
        createUser("Tiffany", "aadafiek", "Student");

        createCourse("MATH", "1551"); // Add courses to the database
        createCourse("PHYS", "2002");
        createCourse("CSC", "3501");
        createCourse("CSC", "3380");
        createCourse("ENGL", "2550");

        addCourse("MATH", "1551", UserData.get(3)); // Assign courses to tutors
        addCourse("PHSY", "2002", UserData.get(3));
        addCourse("CSC", "3501", UserData.get(3));
        addCourse("CSC", "3380", UserData.get(3));
        addCourse("MATH", "1551", UserData.get(4));
        addCourse("PHSY", "2002", UserData.get(4));
        addCourse("ENGL", "2550", UserData.get(4));

        addCourse("MATH", "1551", UserData.get(5)); // Assign courses to students
        addCourse("PHYS", "2002", UserData.get(5));
        addCourse("CSC", "3501", UserData.get(5));
        addCourse("ENGL", "2550", UserData.get(5));
        addCourse("MATH", "1551", UserData.get(6));
        addCourse("PHYS", "2002", UserData.get(6));
        addCourse("CSC", "3380", UserData.get(6));
        addCourse("ENGL", "2550", UserData.get(6));
        addCourse("PHYS", "2002", UserData.get(7));
        addCourse("CSC", "3501", UserData.get(7));
        addCourse("ENGL", "2550", UserData.get(7));
        addCourse("MATH", "1551", UserData.get(8));
        addCourse("CSC", "3501", UserData.get(8));

        Addtime("12/07", "09:00", Courses.get(0), UserData.get(3)); // Add time for tutors
        Addtime("12/07", "09:00", Courses.get(1), UserData.get(3));
        Addtime("12/07", "09:00", Courses.get(2), UserData.get(3));
        Addtime("12/07", "09:00", Courses.get(3), UserData.get(3));
        Addtime("12/07", "10:00", Courses.get(0), UserData.get(3));
        Addtime("12/07", "10:00", Courses.get(1), UserData.get(3));
        Addtime("12/07", "10:00", Courses.get(2), UserData.get(3));
        Addtime("12/07", "10:00", Courses.get(3), UserData.get(3));
        Addtime("12/08", "12:00", Courses.get(0), UserData.get(3));
        Addtime("12/08", "12:00", Courses.get(1), UserData.get(3));
        Addtime("12/08", "12:00", Courses.get(2), UserData.get(3));
        Addtime("12/08", "12:00", Courses.get(3), UserData.get(3));
        Addtime("12/09", "09:00", Courses.get(0), UserData.get(3));
        Addtime("12/09", "09:00", Courses.get(1), UserData.get(3));
        Addtime("12/09", "09:00", Courses.get(2), UserData.get(3));
        Addtime("12/09", "09:00", Courses.get(3), UserData.get(3));
        Addtime("12/10", "09:00", Courses.get(0), UserData.get(3));
        Addtime("12/10", "09:00", Courses.get(1), UserData.get(3));
        Addtime("12/10", "09:00", Courses.get(2), UserData.get(3));
        Addtime("12/10", "09:00", Courses.get(3), UserData.get(3));
        Addtime("12/11", "09:00", Courses.get(0), UserData.get(3));
        Addtime("12/11", "09:00", Courses.get(1), UserData.get(3));
        Addtime("12/11", "09:00", Courses.get(2), UserData.get(3));
        Addtime("12/11", "09:00", Courses.get(3), UserData.get(3));
        Addtime("12/07", "12:00", Courses.get(0), UserData.get(4));
        Addtime("12/07", "12:00", Courses.get(1), UserData.get(4));
        Addtime("12/07", "12:00", Courses.get(4), UserData.get(4));
        Addtime("12/08", "09:00", Courses.get(0), UserData.get(4));
        Addtime("12/08", "09:00", Courses.get(1), UserData.get(4));
        Addtime("12/08", "09:00", Courses.get(4), UserData.get(4));
        Addtime("12/09", "12:00", Courses.get(0), UserData.get(4));
        Addtime("12/09", "12:00", Courses.get(1), UserData.get(4));
        Addtime("12/09", "12:00", Courses.get(4), UserData.get(4));
        Addtime("12/10", "12:00", Courses.get(0), UserData.get(4));
        Addtime("12/10", "12:00", Courses.get(1), UserData.get(4));
        Addtime("12/10", "12:00", Courses.get(4), UserData.get(4));
        
        /* **************************************************************************************************** */

        while(Trial== true) {
            System.out.println();
            System.out.println("Hello! Welcome to Streamline tutoring.");
            System.out.println("Enter 0 to Sign Up");
            System.out.println("Enter 1 to Login");
            System.out.println("Enter 2 to Exit");
            System.out.println();
            Scanner in = new Scanner(System.in);
            String input = in.next();
            
            if(input.equals("0")){//Sign up Code Complete
                System.out.println("Sign up");
                System.out.println("Please enter your name");
                Scanner inName = new Scanner(System.in);
                String Name = inName.next();
                System.out.println("Please enter your password");
                Scanner inPass = new Scanner(System.in);
                String Pass = inPass.next(); 
                signUp(Name,Pass);
            }
            
            
            
            else if(input.equals("1")){// Basic login, user entry
                System.out.println("Please enter your name");
                Scanner inName = new Scanner(System.in);
                String Name = inName.next();
                System.out.println("Please enter your password");
                Scanner inPass = new Scanner(System.in);
                String Pass = inPass.next(); 
                if ((Login(Name,Pass))==true){//This is the hard stuff, the rest of our project rests within this if statement
                    System.out.println("You have logged in, "+Name);
                    Loggedin= true;
                    
                    User LoggedInUser= UserData.get(LoginIndex);// Declared User variable, is assigned during the user is logged in
                    
                    
                    while(Loggedin==true){
                        
                        if("Student".equals(LoggedInUser.getRank())){// Gui for student Rank
                            System.out.println();
                            System.out.println("Welcome "+LoggedInUser.getName()+" to the Streamline tutoring home page your rank is "+LoggedInUser.getRank());
                            System.out.println("Enter 0 Add a course");
                            System.out.println("Enter 1 to Schedule an appointment");
                            System.out.println("Enter 2 to see scheduled appointments");
                            System.out.println("Enter 3 to Logout");
                            System.out.println();
                            Scanner in2 = new Scanner(System.in);
                            String input2 = in2.next();
                            if (input2.equals("0")){// Add a course to the LoggedInUsers courses
                                System.out.println("Here is a list of all courses");
                                getCourseData(Courses);
                                System.out.println("Enter which department your course falls under Ex: Math or EXST");
                                Scanner inCname = new Scanner(System.in);
                                String Cname = inCname.next();      
                                System.out.println("Enter which number your course is:");
                                Scanner inCnum = new Scanner(System.in);
                                String Cnum = inCnum.next(); 
                                addCourse(Cname, Cnum, LoggedInUser);
                                LoggedInUser.myCourses();
                            }
                            else if (input2.equals("1")){
                                // Choose an existing date object (belonging to a course), then create an appointment object belonging to the Student and the tutor
                                System.out.println("Here is a list of your courses");
                                LoggedInUser.myCourses();
                                System.out.println("Enter which department your course falls under Ex: Math or EXST that you want to schedule an appointment for");
                                Scanner inCname = new Scanner(System.in);
                                String Cname = inCname.next();      
                                System.out.println("Enter the course number which you want to make an appointment for");
                                Scanner inCnum = new Scanner(System.in);
                                String Cnum = inCnum.next(); 
                                Coursetimes(Cname,Cnum);
                                System.out.println("Enter the date you want to schedule an appointment");
                                Scanner indate = new Scanner(System.in);
                                String date = indate.next();
                                System.out.println("Enter the time you want to schedule an appointment");
                                Scanner intime = new Scanner(System.in);
                                String time = intime.next();
                                System.out.println("Enter the name of the tutor who is available");
                                Scanner intutor = new Scanner(System.in);
                                String tutor = intutor.next();
                                createAppointment(Cname, Cnum, date, time, tutor, LoggedInUser);                                
                                
                            }
                            else if (input2.equals("2")){// See appointments a Student has scheduled
                                LoggedInUser.getMyAppointments();
                            }
                            else if (input2.equals("3")){// Logout
                                System.out.println("You have logged out.");
                                Loggedin=false;     
                            }
                            else {// Error catching
                                System.out.println("Invalid entry");
                            }                            
                        }
                        
                        else if ("Tutor".equals(LoggedInUser.getRank())) {// Gui for Tutor Rank
                            System.out.println();
                            System.out.println("Welcome "+LoggedInUser.getName()+" to the Streamline tutoring home page your rank is "+LoggedInUser.getRank());
                            System.out.println("Enter 0 to add a course");
                            System.out.println("Enter 1 add available times for appointments");
                            System.out.println("Enter 2 to see my appointments");
                            System.out.println("Enter 3 to Logout");
                            System.out.println();
                            Scanner in2 = new Scanner(System.in);
                            String input2 = in2.next();
                            if (input2.equals("0")){// Adds a course to a tutors course list
                                System.out.println("Here is a list of all courses");
                                getCourseData(Courses);
                                System.out.println("Enter which department your course falls under Ex: Math or EXST");
                                Scanner inCname = new Scanner(System.in);
                                String Cname = inCname.next();      
                                System.out.println("Enter which number your course is:");
                                Scanner inCnum = new Scanner(System.in);
                                String Cnum = inCnum.next(); 
                                addCourse(Cname, Cnum, LoggedInUser);
                                LoggedInUser.myCourses();
                            }
                            else if (input2.equals("1")){// Create a object of Date type, to be used for creating a type appointment
                                System.out.println("Here is a list of your courses");
                                LoggedInUser.myCourses();
                                System.out.println("Enter the department of the course which you are available for");
                                Scanner inCname = new Scanner(System.in);
                                String Cname = inCname.next();      
                                System.out.println("Enter the number of the course which you are available for");
                                Scanner inCnum = new Scanner(System.in);
                                String Cnum = inCnum.next(); 
                                System.out.println("Enter the date you are available for EX: 12/20");
                                Scanner indate = new Scanner(System.in);
                                String date = indate.next();   
                                System.out.println("Enter the time you are available for in military time EX: 7:00 or 18:00");
                                Scanner intime = new Scanner(System.in);
                                String time = indate.next();
                                for (int i =0 ; i < Courses.size(); i++){
                                    if(Cname.equals(Courses.get(i).getName())&&(Cnum.equals(Courses.get(i).getNumber()))){
                                        Addtime(date, time, Courses.get(i), LoggedInUser);
                                        
                                        System.out.println(date+" "+time+" has been made available for "+Cname+" "+Cnum);
                                        break;
                                    }
                                    else if (i == (Courses.size()-1)){
                
                                    System.out.println("Course "+Cname+", "+Cnum+" does not exist");
                                    
                                    
                                    }        
                                }
                                 
                            }
                            else if (input2.equals("2")){// Get created appointments
                                LoggedInUser.getMyAppointments();
                            }
                            else if (input2.equals("3")){// Logout
                                System.out.println("You have logged out.");
                                Loggedin=false;     
                            }
                            else {// Error Catching
                                System.out.println("Invalid entry");
                            }                               
                        }
                        
                        else if ("Admin".equals(LoggedInUser.getRank())){// GUI for Rank admin
                            System.out.println();
                            System.out.println("Welcome "+LoggedInUser.getName()+" to the Streamline tutoring home page your rank is "+LoggedInUser.getRank());
                            System.out.println("Enter 0 to see all user information");
                            System.out.println("Enter 1 to Create Course");
                            System.out.println("Enter 2 to change a Users Rank");
                            System.out.println("Enter 3 See all courses ");
                            System.out.println("Enter 4 Logout ");
                            System.out.println();
                            Scanner in2 = new Scanner(System.in);
                            String input2 = in2.next();
                            if (input2.equals("0")){// Print all user information
                                System.out.println("Here is all user information");
                                getUserData(UserData);

                                
                            }
                            else if (input2.equals("1")){// Create course function
                                System.out.println("Enter which department the course created falls under Ex: Math or EXST");
                                Scanner inCname = new Scanner(System.in);
                                String Cname = inCname.next();      
                                System.out.println("Enter which number the course is:");
                                Scanner inCnum = new Scanner(System.in);
                                String Cnum = inCnum.next(); 
                                createCourse(Cname, Cnum);
                            }
                            else if (input2.equals("2")){// Change Rank Function
                                System.out.println("Please enter the users name you whose rank would like to change");
                                Scanner UName = new Scanner(System.in);
                                String changeName = UName.next();
                                System.out.println("Please enter the users password you whose rank would like to change");
                                Scanner UPass = new Scanner(System.in);
                                String changePass = UPass.next(); 
                                System.out.println("Please enter the users new rank");
                                Scanner inRank = new Scanner(System.in);
                                String newRank = inRank.next();
                                ChangeRank(changeName,changePass, newRank);
                            }
                            else if (input2.equals("3")){// Prints all existing courses
                                System.out.println("Here is a list of all courses");
                                getCourseData(Courses);
                                
                            }
                            else if (input2.equals("4")){// Logout
                                System.out.println("You have logged out.");
                                Loggedin=false;                                
                            }
                                                        
                            else {// Error Catching
                                
                                System.out.println(input2+" is an invalid entry");
                            }                               
                        }
                        else {// this line only exists for errors that should not happen, a user would have rank that does not exist
                            System.out.println("error");
                            Loggedin=false;
                        }
                    }
                    
                }
                
                else {
                    System.out.println("Login attempt failed, username or password is wrong");
                }
            }
            
            
            
            else if(input.equals("2")){// End program
                Trial= false;
            }
            else {// Exception handling
                System.out.println("Error, invalid entry");
            }            
    }
        
    System.out.println("Thank You for visiting our website!");
    }
    
    public static void createUser(String name, String pass, String rank)// custom create user function for the admin
    {
        if(rank.equals("Student")){
            UserData.add(new User(name, pass, "Student"));
        }
        else if(rank.equals("Tutor")){
            UserData.add(new User(name, pass, "Tutor"));
        }
        else if(rank.equals("Admin")){
            UserData.add(new User(name, pass, "Admin"));
        }
        else {
            System.out.println("User creation failed, rank is invalid");
        }
                                
    }
    
    public static void addCourse(String name,String courseNum, User user)// User Command
    {
        for (int i =0 ; i < Courses.size(); i++){
            if(name.equals(Courses.get(i).getName())&&(courseNum.equals(Courses.get(i).getNumber()))){
                user.addCourse(Courses.get(i));
                Courses.get(i).addMember(user);
                System.out.println("Course "+name+", "+courseNum+" has been added");
                return;
            }
            else if (i == (Courses.size()-1)){
                
                System.out.println("Course "+name+", "+courseNum+" does not exist");
                
                
            }        
        }
        if (Courses.isEmpty()){
            System.out.println("There are no courses");
        }
    }
        
    public static void createCourse(String name, String courseNum)// Admin Command for course creation
    {
        for (int i =0 ; i < Courses.size(); i++){// Search all courses available
            if(name.equals(Courses.get(i).getName())&&(courseNum.equals(Courses.get(i).getNumber()))){
                System.out.println("Course Name and Course number is already created");
                break;
            }
            else if (i == (Courses.size()-1)){
                Courses.add(new Course(name, courseNum));
                System.out.println("Course "+name+", "+courseNum+" has been created");
                
                break;
            }
        }
        if(Courses.isEmpty()){
            Courses.add(new Course(name, courseNum));
            System.out.println("Course "+name+", "+courseNum+" has been created");
            
        }
    }    
    
    public static void getUserData(ArrayList<User> ArrayList)// prints all of the users relevant data, 
    {
        for (int i =0; i < ArrayList.size(); i++){
            System.out.println(Arrays.toString(ArrayList.get(i).getInfo()));
        }
            
    }
    
    public static boolean Login(String name,String pass) // Test to see if username and password entered that of one of the users stored, true if they match
    {
        int i;
        
        for (i =0 ; i < UserData.size(); i++){
            if((name.equals(UserData.get(i).getName()))&&(pass.equals(UserData.get(i).getPass()))){
                LoginIndex=i;// This number is how we will find the logged in user
                return true;
                
            }
            else if (i == (UserData.size()-1)){
                System.out.println("Login failed");
                return false;
            }
        }
        return false;
    }
    
    public static void signUp(String name, String pass)//create user function but for the GUI
    {
        for (int i =0 ; i < UserData.size(); i++){
            if(name.equals(UserData.get(i).getName())){
                System.out.println("Name is already taken, please Sign up again");
                break;
            }
            else if (i == (UserData.size()-1)){
                createUser(name, pass, "Student");
                System.out.println("Thank you for signing up! Your username is "+ name+" and your password is "+ pass);
                
                break;
            }
        }
    }
    
    public static void getCourseData(ArrayList<Course> ArrayList)// prints all of the Courses
    {
        for (int i =0; i < ArrayList.size(); i++){
            System.out.println(Arrays.toString(ArrayList.get(i).getInfo()));
        } 
        if (ArrayList.isEmpty()){
            System.out.println("There are no courses");
        
        }
    }
    public static void Addtime(String date, String time, Course course, User tutor)// attaches a time available for tutoring to a course (date object)
    {
        Date d= new Date(date,time,tutor);
        course.addDate(d);
        course.myTimes();//remove later
    }    
    
    public static void ChangeRank(String name,String pass, String newRank) // Enter a users name and pass word and change their rank, Admin command
    {
        int i;
        
        for (i =0 ; i < UserData.size(); i++){
            if((name.equals(UserData.get(i).getName()))&&(pass.equals(UserData.get(i).getPass()))){
                UserData.get(i).changeRank(UserData.get(i), newRank);
                break;
                
                
            }
            else if (i == (UserData.size()-1)){
                System.out.println("User not found");
                
            }
        }
        
    }
    public static void Coursetimes(String name,String Cnum) // Prints dates and times that are available to create an appointment
    {
        int i;
        
        for (i =0 ; i < Courses.size(); i++){
            if((name.equals(Courses.get(i).getName()))&&(Cnum.equals(Courses.get(i).getNumber()))){
                Courses.get(i).myTimes();
                return;
            }
            else if (i == (Courses.size()-1)){
                System.out.println("Course not found");
                return;
            }
        }
        
    }
    public static void createAppointment(String courseName, String courseNum, String date, String time, String tutorName, User student)
    {// This method finds the entered course, then finds the specific date, time and tutor entered to create an appointment object for both the user and tutor
        
        
        for (int i =0 ; i < Courses.size(); i++){
            if((courseName.equals(Courses.get(i).getName()))&&(courseNum.equals(Courses.get(i).getNumber()))){
                Course c = Courses.get(i);
                ArrayList<Date> dates= new ArrayList<>();
                dates= c.getDates();

                for(int i2=0; i2 < dates.size(); i2++){
                    if((date.equals(dates.get(i2).getDate()))&&(time.equals(dates.get(i2).getTime()))&&(tutorName.equals(dates.get(i2).getTutor()))){
                        User u = dates.get(i2).getObj();
                        Appointment a = new Appointment(courseName, courseNum, date, time, u, UserData.get(LoginIndex));
                        u.addAppointment(a);
                        UserData.get(LoginIndex).addAppointment(a);
                        System.out.println("Appointment created");
                        c.getDates().remove(dates.get(i2));
                        return;
                    }
                    else if (i == (dates.size()-1)){
                        System.out.println("Error in creating appointment 0");
                        return;
                    }
                }
                
            }
            else if (i == (Courses.size()-1)){
                System.out.println("Error in Creating appointment 1");
                return;
            }
        }
        System.out.println("Error in creating appointment 2");
    }
}
