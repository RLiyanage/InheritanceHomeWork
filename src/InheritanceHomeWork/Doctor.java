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
public final class Doctor extends HealthProfession {
    private boolean medicalCollegeAdmissionTest;
    private boolean residency;
    private boolean medicalSchool;

    public void setMedicalCollegeAdmissionTest(boolean medicalCollegeAdmissionTest) {
        this.medicalCollegeAdmissionTest = medicalCollegeAdmissionTest;
    }

    public void setResidency(boolean residency) {
        this.residency = residency;
    }

    public void setMedicalSchool(boolean medicalSchool) {
        this.medicalSchool = medicalSchool;
    }

    public Doctor() {
        super.setEducation("Bachelor Of Science Degree");
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

    public void completeRequirments() {
        System.out.println("Medical college admission test ");
        setMedicalCollegeAdmissionTest(true);
        System.out.println("Medical College Completion ");
        setMedicalSchool(true);
        System.out.println("Residency Completion");
        setResidency(true);
    }
}
