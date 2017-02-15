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
public class HealthServicesAdministrator extends HealthProfession {

    @Override
    public void setTasks(String tasks) {
        tasks = "manage business healthcare";
        super.setTasks(tasks); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getTasks() {
        return super.getTasks(); //To change body of generated methods, choose Tools | Templates.
    }

    

    

    @Override
    public void setEducation(String degree) {
        degree = "public health or nursing or business administration";
        super.setEducation(degree); 
    }

    @Override
    public String getEducation() {
        return super.getEducation(); 
    }

   
}
