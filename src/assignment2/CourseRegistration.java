
package assignment2;
import java.util.ArrayList;
/**
 *
 * @author Jelani
 */
public class CourseRegistration {
    
}
public class Student {
 private String id;
 private String name;
 private ArrayList<Course> courses; // contains all courses the student is registered in
 public String getName() {
     return name;
 }
 public String getId() {
     return id;
 }
 // constructor
 public Student(String id, String name) {
 // initialize name and id. Also initialize the ArrayList
 this.id = id;
 this.courses = new ArrayList<>();
 this.name = name;
 }
 public String toString() {
StringBuilder  build= new StringBuilder();
build.append(String.format("%s %s\r\n", name, id));
if (courses.size() > 0) {
            build.append("Registered courses: ");
            for (Course RegCourses : courses) {
                build.append(String.format("%s %d, ", RegCourses.getTitle(), RegCourses.getCode()));
            }
        }

        String str = builder.toString();
        return str.substring(0, str.length() - 2); // deletes any excess space and comma operators
    }
}

 
 public registerFor(Course course){
     if (courses.contains(course)) return;

        courses.add(course);
        course.classList.add(this);

        Department dept = course.getDept();
        if (!dept.courseList.contains(course))
            dept.courseList.add(course);
        if (dept.registerList.contains(this))
            return;
        dept.registerList.add(this);
 }
}

public class Course {
 private Department dept;
 private String title; // title of the course (e.g. “Intro to programming”);
 private String code; // course code, e.g. SOFE, ELEE, MANE, etc.
 private int number; // course number, e.g. 1200, 2710, 2800, etc.
 ArrayList<Student> classList; // contains all students registered in this course
 public String getDept() {
 }

 public String getCode() {
 }
 public Course(String code, int number, Department dept, String title) {
 // also initialize the classList;
 }
 public String toString() {
 // return a string representation of the course with the course code,
 // name, and number of people registered in the course in the following
 // format:
 // SOFE 2710 Object Oriented Programming and Design, Enrollment = 260
 }
}

public class Department {
 private String name; // the name of school “Dept of Computing and Info Science”
 private String id; // short name for courses “SOFE”, “ELEE”, “STAT”, etc
 ArrayList<Course> courseList; // all courses offered by the department
 ArrayList<Course> registerList; // all students taking courses in the department.
 public String getName() {
 }
 public String getId() {
 }
 public Department(String name, String id) {
 // also initialize the arraylists
 }
 public String toString() {
 // returns a string representation of department name, number
 // of courses offered and number of students registered in the
 // department. Use the format:
 // ECSE: 53 courses, 460 students
 }
 public offerCourse (Course course){
     
 }
 public printCourseOffered(){
     
 }
 public printStudentByName(){
     
 }
}
