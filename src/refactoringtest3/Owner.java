/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringtest3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author zzaier
 */
public class Owner extends Resident {

    List<Tenant> tenants = new ArrayList<Tenant>();
    String photoUrl;

    public Owner(String lastName, String firstName) {
        String ownerID = lastName.toUpperCase().trim().substring(1, 3)
                + firstName.toUpperCase().trim().substring(1, 3);
        System.out.println("New Owner: " + ownerID);
    }

    public void setPhotoUrl(String photoName) {
        this.photoUrl = "/photos/owners/mad/" + photoName;
    }
}
