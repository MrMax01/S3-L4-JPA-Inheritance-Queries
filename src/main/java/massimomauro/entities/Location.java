package massimomauro.entities;

import javax.persistence.*;
@Entity
@Table(name="locations")
public class Location {
    @Id
    @GeneratedValue
    private long id;


    private String name;
    private String city;
    @OneToOne(mappedBy = "location")
    private Event event;
    public Location(){};

    public Location(String name, String city) {
        this.name = name;
        this.city = city;
    }



    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Event getEvent() {
        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }
}
