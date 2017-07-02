/*
 * Copyright 2017 INNOVAMENTE.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ec.edu.espe.educaT.dao;

import ec.edu.espe.educaT.model.Curso;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * En esta clase vemos que una vez un objeto se encuentra dentro del PersistenceContext el EntityManager 
 * será capaz de controlar todos los cambios que se han realizado en él y ejecutar las consultas adecuadas contra la base de datos.
 * @author: CRIS
 * @version: 02/07/2017
  */
@Stateless
public class CursoFacade extends AbstractFacade<Curso> {

    @PersistenceContext(unitName = "ec.edu.espe.educaT_educaT-ejb_ejb_1PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CursoFacade() {
        super(Curso.class);
    }
    
}
