/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Insurance;

/**
 *
 * @author janto
 */
public class InsuranceDAO extends DAO<Insurance> {
        public InsuranceDAO() {
        super(new Insurance());
    }

    public Insurance getOneById(Insurance insurance) throws HibernateException {
        return super.getOneById(insurance.getIdCompany());
    }
   
}
