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
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Creación entidad Alumno. Entidad que almacena la informaciácion de los
 * alumnos inscritos en el instituto
 *
 * @author: AyrtonWladimir
 * @version: 02/07/2017
 */
@Entity
@Table(name = "alumno")
public class Alumno implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "COD_ALUMNO", nullable = false, length = 10)
    private String codAlumno;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 150)
    @Column(name = "NOMBRE", nullable = false, length = 150)
    private String nombre;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "DIRECCION", nullable = false, length = 200)
    private String direccion;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "TELEFONO", nullable = false, length = 15)
    private String telefono;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 128)
    @Column(name = "CORREO_ELECTRONICO", nullable = false, length = 128)
    private String correoElectronico;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    @Temporal(TemporalType.DATE)
    private Date fechaNacimiento;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1)
    @Column(name = "GENERO", nullable = false, length = 1)
    private String genero;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<CapacitacionAlumno> capacitacionAlumnoList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "alumno")
    private List<ProgramaAlumno> programaAlumnoList;

    public Alumno() {
    }

    public Alumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public Alumno(String codAlumno, String nombre, String direccion, String telefono, String correoElectronico, Date fechaNacimiento, String genero) {
        this.codAlumno = codAlumno;
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
    }

    public String getCodAlumno() {
        return codAlumno;
    }

    public void setCodAlumno(String codAlumno) {
        this.codAlumno = codAlumno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<CapacitacionAlumno> getCapacitacionAlumnoList() {
        return capacitacionAlumnoList;
    }

    public void setCapacitacionAlumnoList(List<CapacitacionAlumno> capacitacionAlumnoList) {
        this.capacitacionAlumnoList = capacitacionAlumnoList;
    }

    public List<ProgramaAlumno> getProgramaAlumnoList() {
        return programaAlumnoList;
    }

    public void setProgramaAlumnoList(List<ProgramaAlumno> programaAlumnoList) {
        this.programaAlumnoList = programaAlumnoList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codAlumno != null ? codAlumno.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Alumno)) {
            return false;
        }
        Alumno other = (Alumno) object;
        if ((this.codAlumno == null && other.codAlumno != null) || (this.codAlumno != null && !this.codAlumno.equals(other.codAlumno))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "ec.edu.espe.module.Alumno[ codAlumno=" + codAlumno + " ]";
    }

}
