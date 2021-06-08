package com.softeq.main;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

class StudentChecker implements Comparator<Student> {

    @Override
    public int compare(Student o1, Student o2) {
        if (o1.getCgpa() == o2.getCgpa() && o1.getFname().equals(o2.getFname())) {
            return Integer.compare(o1.getId(), o2.getId());
        } else if (o1.getCgpa() == o2.getCgpa()) {
            return o1.getFname().compareTo(o2.getFname());
        } else {
            return Double.compare(o1.getCgpa(), o2.getCgpa());
        }
    }
}

class Student {
    private int id;
    private String fname;
    private double cgpa;

    public Student(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }

    public int getId() {
        return id;
    }

    public String getFname() {
        return fname;
    }

    public double getCgpa() {
        return cgpa;
    }

    @Override
    public String toString() {
        return "Student{" +
            "id=" + id +
            ", fname='" + fname + '\'' +
            ", cgpa=" + cgpa +
            '}';
    }
}

//Complete the code
public class ComporatorStudents {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int testCases = Integer.parseInt(in.nextLine());
//
//        List<Student> studentList = new ArrayList<Student>();
//        while(testCases>0){
//            int id = in.nextInt();
//            String fname = in.next();
//            double cgpa = in.nextDouble();
//
//            Student st = new Student(id, fname, cgpa);
//            studentList.add(st);
//
//            testCases--;
//        }




        List<Student> studentList = Arrays.asList(new Student(1, "Ivan", 1.2), new Student(2, "Bob", 1.2),
            new Student(3, "Bob2", 1.2), new Student(4, "Ramen", 2));

        Collections.sort(studentList, new StudentChecker());

        for (Student st : studentList) {
            System.out.println(st);
        }
    }
}
