package massimomauro.dao;

import massimomauro.entities.Location;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class LocationDAO {
    private final EntityManager em;

    public LocationDAO(EntityManager em) {
        this.em = em;
    }
    public void save (Location location){
        EntityTransaction transiction = em.getTransaction();
        try{
            transiction.begin();
            em.persist(location);
            transiction.commit();
            System.out.println("Evento salvato!");
        }catch(Exception e){
            System.err.println("Errore nel salvataggio nel DB");
        }
    }

}
