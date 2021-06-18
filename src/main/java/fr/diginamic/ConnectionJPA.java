package fr.diginamic;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class ConnectionJPA {

    public static void main(String[] args) {
        //Je crée mon factory pour communiquer avec la base de données
        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("banque");
        EntityManager em = entityManagerFactory.createEntityManager();

        //Je débute la transaction
        EntityTransaction transaction = em.getTransaction();
        transaction.begin();

        //J'arrête la transaction
        transaction.commit();
        em.close();
    }
}