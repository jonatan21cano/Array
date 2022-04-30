package com.company;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {


        private String photoUrl;
        private List<Double> grades = new ArrayList<>();

    public void setFinaGrade(double finaGrade) {
        this.finaGrade = finaGrade;
    }

    private double finaGrade;

    public double getFinaGrade() {
        return finaGrade;
    }

    public void addGrade(double grade){
            this.grades.add(grade);
        }

    public List<Double> getGrades() {
        return grades;
    }

    public void setGrades(List<Double> grades) {
        this.grades = grades;
    }





        public String getPhotoUrl() {

            return photoUrl;
        }
        public void setPhotoUrl(String photoUrl){

            this.photoUrl=photoUrl;
        }



        public void add(Student student) {
        }
    }

