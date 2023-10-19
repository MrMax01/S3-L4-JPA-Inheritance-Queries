package massimomauro.dao;


import massimomauro.entities.Event;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class EventDAO {
    private final EntityManager em;

    public EventDAO(EntityManager em) {
        this.em = em;
    }

    public void save (Event event){
        EntityTransaction transiction = em.getTransaction();
        try{
            transiction.begin();
            em.persist(event);
            transiction.commit();
            System.out.println("Evento salvato!");
        }catch(Exception e){
            System.err.println("Errore nel salvataggio nel DB");
        }
    }

    public Event findById(long id) {

        return em.find(Event.class, id);
    }
    public void delete(long id){
        Event found = em.find(Event.class, id);
        if(found != null){
            EntityTransaction transiction = em.getTransaction();
            try{
                transiction.begin();
                em.remove(found);
                transiction.commit();
                System.out.println("elemento rimosso!");
            }catch (Exception e){
                System.err.println("Si è presentato un errore nell'eliminare l'evento");
            }
        }else{
            System.err.println("Elemento non trovato!");
        }

    }
    public void refreshFromDB(Event event){
        em.refresh(event);
        System.out.println("Oggetto ripristinato!");
    }
}
