package com.company;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner inpuData = new Scanner(System.in);
        List<Student> students = new ArrayList<>();
        String stopExecution = "NO";
        while (stopExecution == "NO") {
            Student student = new Student();
            System.out.println("ingrese nombre del estudiante");
            student.setName(inpuData.nextLine());
            System.out.println("ingrese identificacion");
            student.setIdentification(inpuData.nextLine());
            students.add(student);

            double finalGrade = 0;
            for (int i=0; i<9; i++){
                System.out.println("ingrese la nota");
                double grade = Double.parseDouble(inpuData.nextLine());
                finalGrade = finalGrade + grade;
                student.addGrade(grade);

            }
            finalGrade = finalGrade / student.getGrades().size();
            student.setFinaGrade(finalGrade);
            System.out.println("Deseas continuar - SI - NO");
            String stop = inpuData.nextLine();
            if (stop.equalsIgnoreCase("NO")) {
                stopExecution = "SI";
                break;
            }
        }
        //mustra la lista
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size(); j++){
                System.out.println("Nombre: " + students.get(i).getName() + " Notas: " + students.get(j).getGrades() + " Nota Final: " + students.get(j).getFinaGrade());
            }
        }
        // buscar lista
        System.out.println("ingrese el nombre del estudioante que quiere buscar ");
        String name = inpuData.nextLine();
        for (int i = 0; i < students.size(); i++) {
            for (int j = 0; j < students.size(); j++){
                if (students.get(i).getName().equalsIgnoreCase(name)) {
                    System.out.println("el estudiante " + name + " su identificacion es " + students.get(i).getIdentification() + " con notas " + students.get(j).getGrades() + " Nota Final: " + students.get(j).getFinaGrade());
                    break;
            }

            }
        }
        //eliminar
        System.out.println("ingrese la identidicacion que quiere eliminar ");
        String identification = inpuData.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equalsIgnoreCase(name)) {
                students.remove(i);
                break;
            }
        }
        //actualizar
        System.out.println("ingrese el numero de identicacion que quiere actualizar");
        String id = inpuData.nextLine();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getIdentification().equalsIgnoreCase(name)) {
                Student student = students.get(0);
                System.out.println("nueva identificacion");
                String ident = inpuData.nextLine();
                student.setIdentification(ident);
                students.set(i, student);
                break;
            }
        }

    }
}
