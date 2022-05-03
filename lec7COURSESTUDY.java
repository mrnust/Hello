package com.company;
class Course{
    private String courseName;
    private String[] students= new String[100];
    private int numberOfStudents=0;
    public Course(String name){
        this.courseName=name;
    }
    public String getCourseName(){
        return this.courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents]=student;
        numberOfStudents++;
    }
    public String[] getStudents(){
        return students;
    }
    public int getNumberOfStudents(){
        return this.numberOfStudents;
    }
    public void dropStudents(String student){
        for(int i=0;i<this.getNumberOfStudents();i++) {
            if (students[i] == student) {
                students[i] = null;
            }
        }
    }
}
public class lec7COURSESTUDY {
    public static void main(String[] args) {
       Course c1=new Course("OOP");
       c1.addStudent("Rayyan");
       c1.addStudent("Talha");
       c1.addStudent("Haseeb");
        System.out.println("Course name is "+c1.getCourseName());
        System.out.println("Number of students enrolled are "+c1.getNumberOfStudents());
        String []students=c1.getStudents();
        for(int i=0;i<c1.getNumberOfStudents();i++){
            System.out.println("Student name is "+students[i]);
        }
        c1.dropStudents("Talha");
        for(int i=0;i<c1.getNumberOfStudents();i++){
            if(students[i]==null) {
                continue;}
                System.out.println(" " + students[i]);
            }
        }
    }

