/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

/**
 *
 * @author Diego
 */
import java.io.Serializable;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import utng.datos.InsureDAO;
import utng.datos.InsuranceDAO;
import utng.modelo.Insure;
import utng.modelo.Insurance;

@ManagedBean
@SessionScoped
public class InsureBean implements Serializable {

    private List<Insure> insures;
    private Insure insure;
    private List<Insurance> insurances;

    public InsureBean() {
        insure = new Insure();
        insure.setInsurance(new Insurance());
    }

    public String listar() {
        InsureDAO dao = new InsureDAO();
        try {
            insures = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Insures";
    }

    public String eliminar() {
        InsureDAO dao = new InsureDAO();
        try {
            dao.delete(insure);
            insures = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }

    public String agregar() {
        insure = new Insure();
        insure.setInsurance(new Insurance());
        try {
            insurances = new InsuranceDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Agregar";
    }

    public String guardar() {
        InsureDAO dao = new InsureDAO();
        try {
            if (insure.getId() != 0) {
                dao.update(insure);
            } else {
                dao.insert(insure);
            }
            insures = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }

    public String cancelar() {
        return "Cancelar";
    }

    public String editar(Insure insure) {
        this.insure = insure;
        try {
            insurances = new InsuranceDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Editar";
    }

    public List<Insure> getInsures() {
        return insures;
    }

    public void setInsures(List<Insure> insures) {
        this.insures = insures;
    }

    public Insure getInsure() {
        return insure;
    }

    public void setInsure(Insure insure) {
        this.insure = insure;
    }

    public List<Insurance> getInsurances() {
        return insurances;
    }

    public void setInsurances(List<Insurance> insurances) {
        this.insurances = insurances;
    }

   
    
}
