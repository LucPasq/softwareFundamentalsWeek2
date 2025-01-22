/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package studentlist;

/**
* Date: Jan 22/25**
 *
 * @author fagun at 12/05/2024
 */
public class Student {
    private String name;
    private String studentID;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the studentID
     */
    public String getStudentID() {
        return studentID;
    }

    /**
     * @param studentID the studentID to set
     */
    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }
    ////

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }
   
}
