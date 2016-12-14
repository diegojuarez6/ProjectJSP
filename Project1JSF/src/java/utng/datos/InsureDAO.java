/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Insure;

/**
 *
 * @author Diego
 */
public class InsureDAO extends DAO<Insure> {

    public InsureDAO() {
        super(new Insure());
    }

    public Insure getOneById(Insure insure) throws HibernateException {
        return super.getOneById(insure.getId());
    }
}
