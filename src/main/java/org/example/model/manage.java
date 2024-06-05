package org.example.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Type;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Table(name = "messages")
@Entity(name = "messages")
public class manage {
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
    @Column(name = "progr_id")
    private String progr_id;
    @Column(name = "new_task_id")
    private String new_task_id;
    @Column(name = "on_prov_task_id")
    private String on_prov_task_id;

    public manage(Integer id, String nick, String name, String fam, String pochta, String password, String tel, String progr_id, String new_task_id, String on_prov_task_id) {
        this.id = id;
        this.nick = nick;
        this.name = name;
        this.fam = fam;
        this.pochta = pochta;
        this.password = password;
        this.tel = tel;
        this.progr_id = progr_id;
        this.new_task_id = new_task_id;
        this.on_prov_task_id = on_prov_task_id;
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

    public String getProgr_id() {
        return progr_id;
    }

    public void setProgr_id(String progr_id) {
        this.progr_id = " "+progr_id;
        System.out.println(this.progr_id);
    }

    public String getNew_task_id() {
        return new_task_id;
    }

    public void setNew_task_id(String new_task_id) {
        this.new_task_id = new_task_id;
    }

    public String getOn_prov_task_id() {
        return on_prov_task_id;
    }

    public void setOn_prov_task_id(String on_prov_task_id) {
        this.on_prov_task_id = on_prov_task_id;
    }
}
