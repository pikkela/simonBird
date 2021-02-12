package fi.vamk.e1801174.bird.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

    /**Class represent database table "observation" */

@Entity
public class Observation {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) // autoincrement id
    private int id;
    private int bird;
    private String place;
    private java.sql.Date time;
    private String user;

    public Observation() {

    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getBird() {
        return this.bird;
    }

    public void setBird(int bird) {
        this.bird = bird;
    }

    public String getPlace() {
        return this.place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public java.sql.Date getTime() {
        return this.time;
    }

    public void setTime(java.sql.Date time) {
        this.time = time;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }


}
