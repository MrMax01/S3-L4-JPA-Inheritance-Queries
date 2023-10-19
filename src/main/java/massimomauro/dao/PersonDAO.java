package massimomauro.dao;

import massimomauro.entities.Event;
import massimomauro.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PersonDAO {
    private final EntityManager em;

    public PersonDAO(EntityManager em) {
        this.em = em;
    }
    public void save (Person person){
        EntityTransaction transiction = em.getTransaction();
        try{
            transiction.begin();
            em.persist(person);
            transiction.commit();
            System.out.println("Evento salvato!");
        }catch(Exception e){
            System.err.println("Errore nel salvataggio nel DB");
        }
    }

}
