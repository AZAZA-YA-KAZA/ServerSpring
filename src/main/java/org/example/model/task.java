package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Table(name = "messag")
@Entity(name = "messag")
public class task {
    @Id
    @Column(name = "id")
    private Integer id;
    @Column(name = "stat")
    private Integer stat;
    @Column(name = "nam")
    private String nam;
    @Column(name = "opis")
    private String opis;
    @Column(name = "nick")
    private String nick;
    @Column(name = "sroki")
    private String sroki;

    public task(Integer id, String nick, Integer state, String nam, String opis, String sroki) {
        this.id = id;
        this.nick = nick;
        this.stat = state;
        this.nam = nam;
        this.opis = opis;
        this.sroki = sroki;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getState() {
        return stat;
    }

    public void setState(Integer state) {
        this.stat = state;
    }

    public String getNam() {
        return nam;
    }

    public void setNam(String nam) {
        this.nam = nam;
    }

    public String getOpis() {
        return opis;
    }

    public void setOpis(String opis) {
        this.opis = opis;
    }

    public String getSroki() {
        return sroki;
    }

    public void setSroki(String sroki) {
        this.sroki = sroki;
    }
}
