/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InheritanceHomeWork;

/**
 *
 * @author Sanuth
 */
public class StartUp {

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor();
        System.out.println("doctor1 education : " + doctor1.getEducation());
        doctor1.completeRequirments();
    }
}
