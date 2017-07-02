/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.educaT.dao;

import ec.edu.espe.educaT.model.Capacitacion;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * En esta clase vemos que una vez un objeto se encuentra dentro del PersistenceContext el EntityManager 
 * será capaz de controlar todos los cambios que se han realizado en él y ejecutar las consultas adecuadas contra la base de datos.
 * @author: CRIS
 * @version: 02/07/2017
 * @see <a href = "https://github.com/cris-aguinaga/educaT02.git" /> educaT02.git – Repositorio en GitHub </a>
 */

@Stateless
public class CapacitacionFacade extends AbstractFacade<Capacitacion> {

    @PersistenceContext(unitName = "ec.edu.espe.educaT_educaT-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CapacitacionFacade() {
        super(Capacitacion.class);
    }
    
}
