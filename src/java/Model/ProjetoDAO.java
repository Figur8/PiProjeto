package Model;

import hibernate.HibernateUtil;
import java.util.List;
import javax.persistence.EntityManager;
import org.hibernate.Session;

/**
 *
 * @author Ismael(figur8)
 *  -Agradecimentos:devmedia.com
 */

public class ProjetoDAO {
    
   protected EntityManager entityManager;
   public void salvar(Projeto projeto){
       Session sessao = HibernateUtil.getSessionFactory().openSession();
       sessao.beginTransaction();
       sessao.persist(projeto);
       sessao.getTransaction().commit();
       sessao.close();
   }
   public List<Projeto> listar(){
       Session sessao = HibernateUtil.getSessionFactory().openSession();
       List<Projeto> lista;
       lista = sessao.getNamedQuery("Projeto.findAll").list();
       sessao.close();
       
       return lista;
   }
   public Aluno buscarPeloId(final String id){
       Session sessao = HibernateUtil.getSessionFactory().openSession();
       return entityManager.find(Aluno.class, id);
   }
}
