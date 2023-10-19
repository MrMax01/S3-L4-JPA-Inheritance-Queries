package massimomauro.dao;

import massimomauro.entities.Partecipation;
import massimomauro.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class PartecipationDAO {
    private final EntityManager em;

    public PartecipationDAO(EntityManager em) {
        this.em = em;
    }
    public void save (Partecipation partecipation){
        EntityTransaction transiction = em.getTransaction();
        try{
            transiction.begin();
            em.persist(partecipation);
            transiction.commit();
            System.out.println("Evento salvato!");
        }catch(Exception e){
            System.err.println("Errore nel salvataggio nel DB");
        }
    }

}
