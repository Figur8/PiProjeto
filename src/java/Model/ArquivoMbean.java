/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author NIFVC
 */
@ManagedBean
@SessionScoped
public class ArquivoMbean {
     private Arquivo arquivo;
    private List<Arquivo> lista;
    private ArquivoDAO arquivodao;
    
    
    @PostConstruct
    public void init(){
        this.arquivo = new Arquivo();
        this.arquivodao = new ArquivoDAO();
    }
    
    public void salvar(){
        arquivodao.salvar(arquivo);
        init();
        
        lista = arquivodao.listar();
    }
 
    
    public String delete(){
       return "arquivo;";
    }
    
    public String edit(Arquivo arquivo){
        this.arquivo = arquivo;
        return "manageArquivo";
    }
    
    public String save(){
        return "arquivo";
    }

    public List<Arquivo> getLista() {
        lista = arquivodao.listar();
        return lista;
    }

    public Arquivo getArquivo() {
        return arquivo;
    }

    public ArquivoDAO getArquivodao() {
        return arquivodao;
    }

    public void setArquivo(Arquivo arquivo) {
        this.arquivo = arquivo;
    }

    public void setLista(List<Arquivo> lista) {
        this.lista = lista;
    }

    public void setArquivodao(ArquivoDAO arquivodao) {
        this.arquivodao = arquivodao;
    }
    
}
