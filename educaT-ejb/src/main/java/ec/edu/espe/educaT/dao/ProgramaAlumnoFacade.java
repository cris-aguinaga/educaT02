/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educaT.dao;

import ec.edu.espe.educaT.model.ProgramaAlumno;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author AyrtonWladimir
 */
@Stateless
public class ProgramaAlumnoFacade extends AbstractFacade<ProgramaAlumno> {

    @PersistenceContext(unitName = "ec.edu.espe.educaT_educaT-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaAlumnoFacade() {
        super(ProgramaAlumno.class);
    }
    
}