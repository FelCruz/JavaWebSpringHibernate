/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import modelo.Autor;
import modelo.Editora;

/**
 *
 * @author DesenvolvedorJava
 */
public class LivrariaDao {
    
    public void cadastrarAutor(Autor autor) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistSpringDois");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(autor);
        em.getTransaction().commit();
        em.close();
    }
    
    public void cadastrarEditora(Editora editora) {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistSpringDois");        
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();
        em.persist(editora);
        em.getTransaction().commit();
        em.close();
    }
    
    public List<Editora> listarEditora() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistSpringDois");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();        
        List<Editora> listaEditora = em.createQuery("SELECT e FROM Editora as e").getResultList();
        em.close();
        factory.close();
        return listaEditora;
    }
    
    public List<Autor> listarAutor() {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("PersistSpringDois");
        EntityManager em = factory.createEntityManager();
        
        em.getTransaction().begin();        
        List<Autor> listaAutor = em.createQuery("SELECT a FROM Autor as a").getResultList();
        em.close();
        factory.close();
        return listaAutor;
    } 
    
}
