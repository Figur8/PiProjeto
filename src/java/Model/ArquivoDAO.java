/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import hibernate.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author NIFVC
 */
public class ArquivoDAO {
    private Arquivo arquivo;
    private SessionFactory sf;
    private Session session;
    protected EntityManager entityManager;
    public void salvar(Arquivo arquivo) {
        
        //Depois entendendo
        this.sf = HibernateUtil.getSessionFactory();
        this.sf.getCurrentSession().beginTransaction();
        this.session.save(arquivo);
        this.sf.getCurrentSession().getTransaction().commit();
        //Depois entendendo
    }

    public List<Arquivo> listar() {
        Session sessao = HibernateUtil.getSessionFactory().openSession();
        List<Arquivo> lista;
        lista = sessao.getNamedQuery("Arquivo.findAll").list();
        sessao.close();

        return lista;
    }

    public Arquivo buscarPeloId(final String id) {
        Session sessao;
        sessao = HibernateUtil.getSessionFactory().openSession();
        return entityManager.find(Arquivo.class, id);
    }
}
