package io.github.melvincabatuan;

/**
 * Split the 3 components of the course description: LBYCP 24 : Advanced Programming
 * Created by cobalt on 9/21/15.
 */
public class CourseSplitter {

    private String course = "LBYCP 24 : Advanced Programming in Java with Android Dev";
    private String courseName;
    private String courseNumber;
    private String courseDescription="";


    public void splitCourse1(){
        String elements[] = course.split("\\s+");
        courseName =   elements[0];
        courseNumber = elements[1];

        // Note: elements[2] = : is discarded
        for (int i = 3; i < elements.length; ++i) {
            courseDescription = courseDescription  + " " + elements[i];
        }
    }

    public void splitCourse2(){
        String elements[] = course.split("\\s+");
        courseName =   elements[0];
        courseNumber = elements[1];
        courseDescription = course.substring(course.indexOf(":")+1);
    }

    public void printResult(){
        System.out.println("Course Name: " + courseName);
        System.out.println("Course Number: "+ courseNumber);
        System.out.println("Course Description:" + courseDescription);

    }
}
