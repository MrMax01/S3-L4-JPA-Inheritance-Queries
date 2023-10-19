package massimomauro.entities;

import massimomauro.data.Gender;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name="persons")
public class Person {
    @Id
    @GeneratedValue
    private long id;
    private String name;
    private String surname;
    private String email;
    private LocalDate birthday;
    private Gender gender;

    @OneToMany(mappedBy = "person")
    private Set<Partecipation> partecipationList;
    public Person (){};

    public Person(String name, String surname, String email, LocalDate birthday, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.birthday = birthday;
        this.gender = gender;
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

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Set<Partecipation> getPartecipationList() {
        return partecipationList;
    }

    public void setPartecipationList(Set<Partecipation> partecipationList) {
        this.partecipationList = partecipationList;
    }
}
