/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package u2;

/**
 * Description:
 * DateCreated:
 *
 * @author martinp4325
 */
public class Student {
    private String name;
    private double  age;
    private long studentID;
    private double[][] grades;
    
    
    public Student(){
        this.name = "default";
        this.age = 13;
        this.studentID =0;
        
    }
    
    public Student(String n,double a/* = 13*/,long ID/*=0*/){
        this.name = n;
        this.age = a;
        this.studentID =ID;
        
    }
    public Student(String n,int a/* = 13*/,int ID/*=0*/){
        this.name = n;
        this.age = a;
        this.studentID =ID;
        
    }
    public Student(String n,double a/* = 13*/,int ID/*=0*/){
        this.name = n;
        this.age = a;
        this.studentID =ID;
        
    }
    public Student(String n,int a/* = 13*/,long ID/*=0*/){
        this.name = n;
        this.age = a;
        this.studentID =ID;
        
    }
    public void setGrades(double[][] gradelist){
        grades=gradelist;
    }
    public double[][] getGrades(){
        return grades;
    }
    public double getGPA(){
        double classgrade=0;
        double grade = 0;
        for(int i=0;i<grades.length;i++){
            for (int n=0;n<grades[i].length;i++){
                classgrade +=grades[i][n];
            }
            grade += classgrade/grades[i].length;
        }
        return grade/grades.length;
    }
}
