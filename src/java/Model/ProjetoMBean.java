/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

/**
 *
 * @author Ismae
 */

@ManagedBean
@ViewScoped
public class ProjetoMBean {
    private Projeto projeto;
    private List<Projeto> lista;
    private ProjetoDAO projetodao;
    
    
    @PostConstruct
    public void init(){
        this.projeto = new Projeto();
        this.projetodao = new ProjetoDAO();
    }
    
    public void salvar(){
        projetodao.salvar(projeto);
        init();
        
        lista = projetodao.listar();
    }
 
    
    public String delete(){
       return "projeto;";
    }
    
    public String edit(Projeto projeto){
        this.projeto = projeto;
        return "manageProjeto";
    }
    
    public String save(){
        return "projeto";
    }

    public List<Projeto> getLista() {
        lista = projetodao.listar();
        return lista;
    }

    public Projeto getProjeto() {
        return projeto;
    }

    public ProjetoDAO getProjetodao() {
        return projetodao;
    }

    public void setProjeto(Projeto projeto) {
        this.projeto = projeto;
    }

    public void setLista(List<Projeto> lista) {
        this.lista = lista;
    }

    public void setProjetodao(ProjetoDAO projetodao) {
        this.projetodao = projetodao;
    }

    
}
