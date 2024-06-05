package org.example.model;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Arrays;

@Data
@NoArgsConstructor
@Table(name = "message")
@Entity(name = "message")
public class proger {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "nick")
    private String nick;
    @Column(name = "name")
    private String name;
    @Column(name = "fam")
    private String fam;
    @Column(name = "pochta")
    private String pochta;
    @Column(name = "password")
    private String password;
    @Column(name = "tel")
    private String tel;
    @Column(name = "exam")
    private String exam;
    @Column(name = "badex")
    private String badex;

    public proger(Integer id, String nick, String name, String fam, String pochta, String password, String tel, String exam, String badex) {
        this.id = id;
        this.nick = nick;
        this.name = name;
        this.fam = fam;
        this.pochta = pochta;
        this.password = password;
        this.tel = tel;
        this.exam = exam;
        this.badex = badex;
        System.out.println(toString());
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFam() {
        return fam;
    }

    public void setFam(String fam) {
        this.fam = fam;
    }

    public String getPochta() {
        return pochta;
    }

    public void setPochta(String pochta) {
        this.pochta = pochta;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getExam() {
        return exam;
    }

    public void setExam(String exam) {
        this.exam = exam;
    }

    public String getBadex() {
        return badex;
    }

    public void setBadex(String badex) {
        this.badex = badex;
    }

    @Override
    public String toString() {
        return "proger{" +
                "id=" + id +
                ", nick='" + nick + '\'' +
                ", name='" + name + '\'' +
                ", fam='" + fam + '\'' +
                ", pochta='" + pochta + '\'' +
                ", password='" + password + '\'' +
                ", tel='" + tel + '\'' +
                ", exam='" + exam + '\'' +
                ", badex='" + badex + '\'' +
                '}';
    }
}


