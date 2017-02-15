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
public class HealthCareServicesAdministrator extends HealthCareProfession {

    private boolean adminCertified;

    public boolean isAdminCertified() {
        return adminCertified;
    }

    public void setAdminCertified(boolean adminCertified) {
        this.adminCertified = adminCertified;
    }
}
