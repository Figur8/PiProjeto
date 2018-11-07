/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author NIFVC
 */
@Embeddable
public class EquipePK implements Serializable {

    @Basic(optional = false)
    @Column(name = "idEquipe")
    private int idEquipe;
    @Basic(optional = false)
    @Column(name = "aluno_id_aluno")
    private int alunoIdAluno;

    public EquipePK() {
    }

    public EquipePK(int idEquipe, int alunoIdAluno) {
        this.idEquipe = idEquipe;
        this.alunoIdAluno = alunoIdAluno;
    }

    public int getIdEquipe() {
        return idEquipe;
    }

    public void setIdEquipe(int idEquipe) {
        this.idEquipe = idEquipe;
    }

    public int getAlunoIdAluno() {
        return alunoIdAluno;
    }

    public void setAlunoIdAluno(int alunoIdAluno) {
        this.alunoIdAluno = alunoIdAluno;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) idEquipe;
        hash += (int) alunoIdAluno;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof EquipePK)) {
            return false;
        }
        EquipePK other = (EquipePK) object;
        if (this.idEquipe != other.idEquipe) {
            return false;
        }
        if (this.alunoIdAluno != other.alunoIdAluno) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.EquipePK[ idEquipe=" + idEquipe + ", alunoIdAluno=" + alunoIdAluno + " ]";
    }
    
}
