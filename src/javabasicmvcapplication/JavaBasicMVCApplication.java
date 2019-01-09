/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javabasicmvcapplication;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author nikolaos
 */
public class JavaBasicMVCApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // Create a Student model
        Student model = retrieveStudentsFromDatabase().get(0);
        
        // Create a view : to write student details on console
        StudentView view = new StudentView();
 
        // We pass the model and view into the controller
        StudentController controller = new StudentController(model, view);
        
        controller.updateView();

        System.out.println("--------");
        //update model data
        controller.setStudentName("John");
        // and update view
        controller.updateView();
    }

    private static List<Student> retrieveStudentsFromDatabase() {
        List<Student> studentList = new ArrayList();
        studentList.add(new Student("10", "Robert"));
        studentList.add(new Student("15", "Nick"));
        studentList.add(new Student("18", "Mary"));
        studentList.add(new Student("19", "Iris"));
        
        return studentList;
    }


}
