package massimomauro.entities;

import massimomauro.data.Status;

import javax.persistence.*;

@Entity
@Table(name="partecipations")
public class Partecipation {
    @Id
    @GeneratedValue
    private long id;
    @ManyToOne
    @JoinColumn(name="person_id")
    private Person person;
    @ManyToOne
    @JoinColumn(name="event_id")
    private Event event;
    private Status status;
    public Partecipation(){}

    public Partecipation(Person person, Event event, Status status) {
        this.person = person;
        this.event = event;
        this.status = status;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
