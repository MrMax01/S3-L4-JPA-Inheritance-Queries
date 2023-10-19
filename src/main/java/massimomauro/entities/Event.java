package massimomauro.entities;

import massimomauro.data.TypeEvent;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="events")
public class Event {
    @Id
    @GeneratedValue
    private long id;
    private String title;
    private LocalDate dataEvent;
    private String description;
    // @Enumerated(EnumType.STRING)
    private TypeEvent typeEvent;
    private int maxNumberPartecipants;

    @OneToOne
    @JoinColumn(name="location_id")
    private Location location;
    @OneToMany(mappedBy = "event")
    @OrderBy("title ASC")
    private Set<Partecipation> partecipationList;


    public Event (){};

    public Event(String title, LocalDate dataEvent, String description, TypeEvent typeEvent, int maxNumberPartecipants, Location location) {
        this.title = title;
        this.dataEvent = dataEvent;
        this.description = description;
        this.typeEvent = typeEvent;
        this.maxNumberPartecipants = maxNumberPartecipants;
        this.location= location;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public LocalDate getDataEvent() {
        return dataEvent;
    }

    public String getDescription() {
        return description;
    }

    public TypeEvent getTypeEvent() {
        return typeEvent;
    }

    public int getMaxNumberPartecipants() {
        return maxNumberPartecipants;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setDataEvent(LocalDate dataEvent) {
        this.dataEvent = dataEvent;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setTypeEvent(TypeEvent typeEvent) {
        this.typeEvent = typeEvent;
    }

    public void setMaxNumberPartecipants(int maxNumberPartecipants) {
        this.maxNumberPartecipants = maxNumberPartecipants;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", dataEvent=" + dataEvent +
                ", description='" + description + '\'' +
                ", typeEvent=" + typeEvent +
                ", maxNumberPartecipants=" + maxNumberPartecipants +
                '}';
    }
}
