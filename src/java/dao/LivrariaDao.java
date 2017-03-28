/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

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
}
