/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringtest3;

import java.util.Date;

/**
 *
 * @author zzaier
 */
public class Tenant extends Resident{
    String tenant_id;

    String lastName;
    String firstName;
    Date dateBirth;

    public Tenant(String ln, String fn, Date db) {
        this.lastName = ln;
        this.firstName = fn;
        this.dateBirth = db;
        this.tenant_id = createTenantId(ln, fn, db);
    }

    public String createTenantId(String lName, String fName, Date date) {
        String end = concatDate(date);
        return lName.substring(0, 3) + fName.charAt(0) + end;
    }

    private String concatDate(Date date) {
        return date.getYear() + "-" + date.getMonth();
    }

    public String getTenantId() {
        return tenant_id;
    }

    public void setTenantId(String tenant_id) {
        this.tenant_id = tenant_id;
    }

    public void isRentedBy(Owner owner) {
        owner.tenants.add(this);
    }
    
}
