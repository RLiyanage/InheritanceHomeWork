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
public final class Doctor extends HealthProfession{
    private final boolean medicalCollegeAdmissionTest = true;
    private final boolean residency = true;
    private final boolean medicalSchool = true;
   
    
    
    public Doctor(String bachelorOfScienceDegree) {
        setEducation(bachelorOfScienceDegree);
    }

    public boolean isMedicalCollegeAdmissionTest() {
        return medicalCollegeAdmissionTest;
    }

    public boolean isResidency() {
        return residency;
    }
    public boolean isMedicalSchool() {
        return medicalSchool;
    }

    @Override
    public void setWorkingPlace(String hospital) {
        super.setWorkingPlace(hospital); 
    }

    @Override
    public void setEducation(String bachelorOfScienceDegree) {
        super.setEducation(bachelorOfScienceDegree); 
    }

    public void completeRequirments(){
        isMedicalCollegeAdmissionTest();
        isMedicalSchool();
        isResidency();
         
    }

    @Override
    public void setLicence( String boardCertification) {
        super.setLicence(boardCertification); 
    }
    
    
    
}
