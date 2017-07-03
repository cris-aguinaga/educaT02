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
package ec.edu.espe.educaT.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Esta clase contiene información referente a los alumnos que pertenecen a un programa. 
 * @author: Sofia Gomez
 * @version: 02/07/2017 
 */
@Entity
@Table(name = "programa_alumno")
public class ProgramaAlumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected ProgramaAlumnoPK programaAlumnoPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 3)
    @Column(name = "ESTADO", nullable = false, length = 3)
    private String estado;
    @JoinColumn(name = "COD_ALUMNO", referencedColumnName = "COD_ALUMNO", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Alumno alumno;
    @JoinColumn(name = "COD_PROGRAMA", referencedColumnName = "COD_PROGRAMA", nullable = false, insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Programa programa;

    public ProgramaAlumno() {
    }

    public ProgramaAlumno(ProgramaAlumnoPK programaAlumnoPK) {
        this.programaAlumnoPK = programaAlumnoPK;
    }

    public ProgramaAlumno(ProgramaAlumnoPK programaAlumnoPK, String estado) {
        this.programaAlumnoPK = programaAlumnoPK;
        this.estado = estado;
    }

    public ProgramaAlumno(String codPrograma, String codAlumno) {
        this.programaAlumnoPK = new ProgramaAlumnoPK(codPrograma, codAlumno);
    }

    public ProgramaAlumnoPK getProgramaAlumnoPK() {
        return programaAlumnoPK;
    }

    public void setProgramaAlumnoPK(ProgramaAlumnoPK programaAlumnoPK) {
        this.programaAlumnoPK = programaAlumnoPK;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Alumno getAlumno() {
        return alumno;
    }

    public void setAlumno(Alumno alumno) {
        this.alumno = alumno;
    }

    public Programa getPrograma() {
        return programa;
    }

    public void setPrograma(Programa programa) {
        this.programa = programa;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (programaAlumnoPK != null ? programaAlumnoPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProgramaAlumno)) {
            return false;
        }
        ProgramaAlumno other = (ProgramaAlumno) object;
        if ((this.programaAlumnoPK == null && other.programaAlumnoPK != null) || (this.programaAlumnoPK != null && !this.programaAlumnoPK.equals(other.programaAlumnoPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.module.ProgramaAlumno[ programaAlumnoPK=" + programaAlumnoPK + " ]";
    }
    
}
