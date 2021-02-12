package fi.vamk.e1801174.bird.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Bird {
    // {"textid":"CYGOLO","latin":"Cygnus
    // olor","finnish":"Kyhmyjoutsen","swedish":"Kn\u00f6lsvan","english":"Mute
    // Swan"}
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // autoincrement the id for next record
    private int id;
    private String textid;
    private String latin;
    private String finnish;
    private String swedish;
    private String english;

    public String getFinnish() {
        return this.finnish;
    }

    public void setFinnish(String finnish) {
        this.finnish = finnish;
    }

    public String getSwedish() {
        return this.swedish;
    }

    public void setSwedish(String swedish) {
        this.swedish = swedish;
    }

    public String getEnglish() {
        return this.english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public Bird() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTextid() {
        return this.textid;
    }

    public void setTextid(String textid) {
        this.textid = textid;
    }

    public String getLatin(){
        return this.latin;
    }

    public void setLatin(String latin) {
        this.latin = latin;
    }
}
