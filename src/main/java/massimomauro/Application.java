package massimomauro;


import massimomauro.dao.EventDAO;
import massimomauro.dao.LocationDAO;
import massimomauro.dao.PersonDAO;
import massimomauro.data.Gender;
import massimomauro.entities.Event;
import massimomauro.entities.Location;
import massimomauro.entities.Person;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.time.LocalDate;

import static massimomauro.data.TypeEvent.PRIVATO;

public class Application {

    private static final EntityManagerFactory emf = Persistence.createEntityManagerFactory("gestioneventi");
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        EntityManager em = emf.createEntityManager();
        EventDAO sd = new EventDAO(em);
        PersonDAO pd = new PersonDAO(em);
        LocationDAO ld = new LocationDAO(em);

        Person p1= new Person("ran", "dom", "random@gmail.com", today, Gender.M);
        Location l1 = new Location("Salmo", "Torino");
        Event ev1 = new Event("ev", today, "ciao", PRIVATO, 50, l1);

        ld.save(l1);
        pd.save(p1);
        sd.save(ev1);
        //sd.delete(14);
        //System.out.println(sd.findById(1));

        System.out.println("Hello World!");
        em.close();
        emf.close();
    }
}