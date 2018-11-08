/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author NIFVC
 */
@Entity
@Table(name = "arquivo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Arquivo.findAll", query = "SELECT a FROM Arquivo a")
    , @NamedQuery(name = "Arquivo.findByIdArquivos", query = "SELECT a FROM Arquivo a WHERE a.idArquivos = :idArquivos")
    , @NamedQuery(name = "Arquivo.findByEndArq", query = "SELECT a FROM Arquivo a WHERE a.endArq = :endArq")})
public class Arquivo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idArquivos")
    private Integer idArquivos;
    @Basic(optional = false)
    @Column(name = "end_arq")
    private String endArq;

    public Arquivo() {
    }

    public Arquivo(Integer idArquivos) {
        this.idArquivos = idArquivos;
    }

    public Arquivo(Integer idArquivos, String endArq) {
        this.idArquivos = idArquivos;
        this.endArq = endArq;
    }

    public Integer getIdArquivos() {
        return idArquivos;
    }

    public void setIdArquivos(Integer idArquivos) {
        this.idArquivos = idArquivos;
    }

    public String getEndArq() {
        return endArq;
    }

    public void setEndArq(String endArq) {
        this.endArq = endArq;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArquivos != null ? idArquivos.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Arquivo)) {
            return false;
        }
        Arquivo other = (Arquivo) object;
        if ((this.idArquivos == null && other.idArquivos != null) || (this.idArquivos != null && !this.idArquivos.equals(other.idArquivos))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Arquivo[ idArquivos=" + idArquivos + " ]";
    }
    
}
