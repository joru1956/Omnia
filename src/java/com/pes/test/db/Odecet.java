/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pes.test.db;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author AdminRuzicka
 */
@Entity
@Table(name = "odecet")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Odecet.findAll", query = "SELECT o FROM Odecet o")
    , @NamedQuery(name = "Odecet.findById", query = "SELECT o FROM Odecet o WHERE o.id = :id")
    , @NamedQuery(name = "Odecet.findByDatum", query = "SELECT o FROM Odecet o WHERE o.datum = :datum")
    , @NamedQuery(name = "Odecet.findByStav", query = "SELECT o FROM Odecet o WHERE o.stav = :stav")
    , @NamedQuery(name = "Odecet.findByString", query = "SELECT o FROM Odecet o WHERE o.string = :string")})
public class Odecet implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Short id;
    @Column(name = "Datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Column(name = "Stav")
    private Integer stav;
    @Size(max = 20)
    @Column(name = "String")
    private String string;

    public Odecet() {
    }

    public Odecet(Short id) {
        this.id = id;
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Integer getStav() {
        return stav;
    }

    public void setStav(Integer stav) {
        this.stav = stav;
    }

    public String getString() {
        return string;
    }

    public void setString(String string) {
        this.string = string;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Odecet)) {
            return false;
        }
        Odecet other = (Odecet) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pes.test.db.Odecet[ id=" + id + " ]";
    }
    
}
