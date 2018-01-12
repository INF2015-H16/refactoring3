/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package refactoringtest3;

/**
 *
 * @author zzaier
 */
public class Apartment {
    
    String idResidence;
    Integer nbRooms;
    Integer nbSquareFeet;

 	public String getIdResidence() {
		return idResidence;
	}

	public void setIdOffice(String idResidence) {
		this.idResidence = idResidence;
	}

	public Integer getNbRooms() {
		return nbRooms;
	}

	public void setNbRooms(Integer nbRooms) {
		this.nbRooms = nbRooms;
	}

	public Integer getNbSquareFeet() {
		return nbSquareFeet;
	}

	public void setNbSquareFeet(Integer nbSquareFeet) {
		this.nbSquareFeet = nbSquareFeet;
	}
    
}
