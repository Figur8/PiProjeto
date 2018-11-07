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
@Table(name = "projeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projeto.findAll", query = "SELECT p FROM Projeto p")
    , @NamedQuery(name = "Projeto.findByIdProj", query = "SELECT p FROM Projeto p WHERE p.idProj = :idProj")
    , @NamedQuery(name = "Projeto.findByNome", query = "SELECT p FROM Projeto p WHERE p.nome = :nome")
    , @NamedQuery(name = "Projeto.findByDescProj", query = "SELECT p FROM Projeto p WHERE p.descProj = :descProj")
    , @NamedQuery(name = "Projeto.findByAno", query = "SELECT p FROM Projeto p WHERE p.ano = :ano")
    , @NamedQuery(name = "Projeto.findByValidacaoProf", query = "SELECT p FROM Projeto p WHERE p.validacaoProf = :validacaoProf")
    , @NamedQuery(name = "Projeto.findByValidacaoCoord", query = "SELECT p FROM Projeto p WHERE p.validacaoCoord = :validacaoCoord")
    , @NamedQuery(name = "Projeto.findByPeriodo", query = "SELECT p FROM Projeto p WHERE p.periodo = :periodo")
    , @NamedQuery(name = "Projeto.findByDisciplinaidDisciplina", query = "SELECT p FROM Projeto p WHERE p.disciplinaidDisciplina = :disciplinaidDisciplina")
    , @NamedQuery(name = "Projeto.findByEquipeidEquipe", query = "SELECT p FROM Projeto p WHERE p.equipeidEquipe = :equipeidEquipe")
    , @NamedQuery(name = "Projeto.findByCursoidCurso", query = "SELECT p FROM Projeto p WHERE p.cursoidCurso = :cursoidCurso")
    , @NamedQuery(name = "Projeto.findByProfessoridProf", query = "SELECT p FROM Projeto p WHERE p.professoridProf = :professoridProf")
    , @NamedQuery(name = "Projeto.findByProfessoridCoordenador", query = "SELECT p FROM Projeto p WHERE p.professoridCoordenador = :professoridCoordenador")})
public class Projeto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idProj")
    private Integer idProj;
    @Basic(optional = false)
    @Column(name = "nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "desc_proj")
    private String descProj;
    @Basic(optional = false)
    @Column(name = "ano")
    private String ano;
    @Column(name = "validacao_prof")
    private Integer validacaoProf;
    @Column(name = "validacao_coord")
    private String validacaoCoord;
    @Basic(optional = false)
    @Column(name = "periodo")
    private int periodo;
    @Basic(optional = false)
    @Column(name = "Disciplina_idDisciplina")
    private int disciplinaidDisciplina;
    @Basic(optional = false)
    @Column(name = "Equipe_idEquipe")
    private int equipeidEquipe;
    @Basic(optional = false)
    @Column(name = "Curso_idCurso")
    private int cursoidCurso;
    @Basic(optional = false)
    @Column(name = "professor_idProf")
    private int professoridProf;
    @Basic(optional = false)
    @Column(name = "professor_idCoordenador")
    private int professoridCoordenador;

    public Projeto() {
    }

    public Projeto(Integer idProj) {
        this.idProj = idProj;
    }

    public Projeto(Integer idProj, String nome, String descProj, String ano, int periodo, int disciplinaidDisciplina, int equipeidEquipe, int cursoidCurso, int professoridProf, int professoridCoordenador) {
        this.idProj = idProj;
        this.nome = nome;
        this.descProj = descProj;
        this.ano = ano;
        this.periodo = periodo;
        this.disciplinaidDisciplina = disciplinaidDisciplina;
        this.equipeidEquipe = equipeidEquipe;
        this.cursoidCurso = cursoidCurso;
        this.professoridProf = professoridProf;
        this.professoridCoordenador = professoridCoordenador;
    }

    public Integer getIdProj() {
        return idProj;
    }

    public void setIdProj(Integer idProj) {
        this.idProj = idProj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescProj() {
        return descProj;
    }

    public void setDescProj(String descProj) {
        this.descProj = descProj;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public Integer getValidacaoProf() {
        return validacaoProf;
    }

    public void setValidacaoProf(Integer validacaoProf) {
        this.validacaoProf = validacaoProf;
    }

    public String getValidacaoCoord() {
        return validacaoCoord;
    }

    public void setValidacaoCoord(String validacaoCoord) {
        this.validacaoCoord = validacaoCoord;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    public int getDisciplinaidDisciplina() {
        return disciplinaidDisciplina;
    }

    public void setDisciplinaidDisciplina(int disciplinaidDisciplina) {
        this.disciplinaidDisciplina = disciplinaidDisciplina;
    }

    public int getEquipeidEquipe() {
        return equipeidEquipe;
    }

    public void setEquipeidEquipe(int equipeidEquipe) {
        this.equipeidEquipe = equipeidEquipe;
    }

    public int getCursoidCurso() {
        return cursoidCurso;
    }

    public void setCursoidCurso(int cursoidCurso) {
        this.cursoidCurso = cursoidCurso;
    }

    public int getProfessoridProf() {
        return professoridProf;
    }

    public void setProfessoridProf(int professoridProf) {
        this.professoridProf = professoridProf;
    }

    public int getProfessoridCoordenador() {
        return professoridCoordenador;
    }

    public void setProfessoridCoordenador(int professoridCoordenador) {
        this.professoridCoordenador = professoridCoordenador;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProj != null ? idProj.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Projeto)) {
            return false;
        }
        Projeto other = (Projeto) object;
        if ((this.idProj == null && other.idProj != null) || (this.idProj != null && !this.idProj.equals(other.idProj))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Model.Projeto[ idProj=" + idProj + " ]";
    }
    
}
