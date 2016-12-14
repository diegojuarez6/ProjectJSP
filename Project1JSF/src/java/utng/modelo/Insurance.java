/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author janto
 */
@Entity
@Table(name = "insurance")

public class Insurance implements Serializable
 {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_company")
    private Long idCompany;
    @Column(name = "contact_fname", length = 15)
    private String contactFname;
    @Column(length = 15)
    private String contactLname;
    @Column(length = 12)
    private int phone;

    public Insurance(Long idCompany, String contactFname, String contactLname, int phone) {
        this.idCompany = idCompany;
        this.contactFname = contactFname;
        this.contactLname = contactLname;
        this.phone = phone;
    }

    public Insurance() {
        this(0L, "", "",0);
    }

    public Long getIdCompany() {
        return idCompany;
    }

    public void setIdCompany(Long idCompany) {
        this.idCompany = idCompany;
    }

    public String getContactFname() {
        return contactFname;
    }

    public void setContactFname(String contactFname) {
        this.contactFname = contactFname;
    }

    public String getContactLname() {
        return contactLname;
    }

    public void setContactLname(String contactLname) {
        this.contactLname = contactLname;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

       
}

