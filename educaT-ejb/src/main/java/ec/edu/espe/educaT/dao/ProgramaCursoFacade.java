/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educaT.dao;

import ec.edu.espe.educaT.model.ProgramaCurso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author CRIS
 */
@Stateless
public class ProgramaCursoFacade extends AbstractFacade<ProgramaCurso> {

    @PersistenceContext(unitName = "ec.edu.espe.educaT_educaT-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ProgramaCursoFacade() {
        super(ProgramaCurso.class);
    }
    
}
