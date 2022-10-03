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
@Table(name = "logy")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Logy.findAll", query = "SELECT l FROM Logy l")
    , @NamedQuery(name = "Logy.findById", query = "SELECT l FROM Logy l WHERE l.id = :id")
    , @NamedQuery(name = "Logy.findByDatum", query = "SELECT l FROM Logy l WHERE l.datum = :datum")
    , @NamedQuery(name = "Logy.findByCas", query = "SELECT l FROM Logy l WHERE l.cas = :cas")
    , @NamedQuery(name = "Logy.findByIp", query = "SELECT l FROM Logy l WHERE l.ip = :ip")
    , @NamedQuery(name = "Logy.findByHostname", query = "SELECT l FROM Logy l WHERE l.hostname = :hostname")
    , @NamedQuery(name = "Logy.findByBrowser", query = "SELECT l FROM Logy l WHERE l.browser = :browser")
    , @NamedQuery(name = "Logy.findByReferer", query = "SELECT l FROM Logy l WHERE l.referer = :referer")})
public class Logy implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "Id")
    private Integer id;
    @Column(name = "Datum")
    @Temporal(TemporalType.DATE)
    private Date datum;
    @Column(name = "Cas")
    @Temporal(TemporalType.TIME)
    private Date cas;
    @Size(max = 20)
    @Column(name = "IP")
    private String ip;
    @Size(max = 250)
    @Column(name = "Hostname")
    private String hostname;
    @Size(max = 250)
    @Column(name = "Browser")
    private String browser;
    @Size(max = 250)
    @Column(name = "Referer")
    private String referer;

    public Logy() {
    }

    public Logy(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getDatum() {
        return datum;
    }

    public void setDatum(Date datum) {
        this.datum = datum;
    }

    public Date getCas() {
        return cas;
    }

    public void setCas(Date cas) {
        this.cas = cas;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getReferer() {
        return referer;
    }

    public void setReferer(String referer) {
        this.referer = referer;
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
        if (!(object instanceof Logy)) {
            return false;
        }
        Logy other = (Logy) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.pes.test.db.Logy[ id=" + id + " ]";
    }
    
}
